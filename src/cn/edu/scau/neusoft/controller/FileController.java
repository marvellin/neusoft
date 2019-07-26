package cn.edu.scau.neusoft.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
public class FileController {
    @RequestMapping("/upload")
    public String upload() {
        return "fileUpload";
    }

    @RequestMapping("/download")
    public String download() {
        return "fileDownload";
    }

    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public String fileUpload(@RequestParam(value = "name", required = false)String name, @RequestParam(value = "uploadfile")List<MultipartFile> uploadfiles, HttpServletRequest request) {
//    public String fileUpload(String name, List<MultipartFile> uploadfile, HttpServletRequest request){
            System.out.println(name +" "+uploadfiles.size());
        if(!uploadfiles.isEmpty()&&uploadfiles.size()>0) {
        for (MultipartFile file : uploadfiles) {
            //原始名
            String originalFilename = file.getOriginalFilename();
            //创建存放文件的目录
            String dirPath = request.getServletContext().getRealPath("/upload/");
            File filePath = new File(dirPath);
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            System.out.println(filePath);
            //重命名上传文件进行保存
            String newFilename = name + "_" + originalFilename;
            try {
                file.transferTo(new File(dirPath + newFilename));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("失败1");
                return "fileerror";
            }
        }
        return "success";
    } else {
        System.out.println("失败2");
        return "fileerror";
    }
}

    @RequestMapping("/fileDownload")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request, String filename) throws Exception {
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        //创建文件对象
        File file = new File(path + File.separator + filename);
        //响应头
        HttpHeaders headers = new HttpHeaders();
        //通知浏览器打开
        headers.setContentDispositionFormData("attachment", filename);
        //定义以流的方式下载
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //对象封装返回下载数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
    }
}
