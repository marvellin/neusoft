package cn.edu.scau.neusoft.converter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    private String datePattern = "yyy-MM-dd HH:mm:ss";
    private SimpleDateFormat sdf;

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        sdf = new SimpleDateFormat(datePattern);
        return sdf.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return new SimpleDateFormat().format(date);
    }
}
