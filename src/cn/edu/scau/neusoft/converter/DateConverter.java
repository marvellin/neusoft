package cn.edu.scau.neusoft.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    private String datePattern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException("无效日期，请用这种格式：" + datePattern);
        }
    }
}
