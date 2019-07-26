package cn.edu.scau.neusoft.po;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Goods {
    private String gname;
    private String gdescription;
    private Double gprice;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date gdate;

    public void setGname(String gname){
        this.gname=gname;
    }
    public String getGname(){
        return gname;
    }
    public void setGdescription(String gdescription){
        this.gdescription=gdescription;
    }
    public String getGdescription(){
        return gdescription;
    }
    public void setGprice(Double gprice){
        this.gprice=gprice;
    }
    public Double getGprice(){
        return gprice;
    }
    public void setGdate(Date gdate){
        this.gdate=gdate;
    }
    public Date getGdate(){
        return gdate;
    }
}

