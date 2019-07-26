package cn.edu.scau.neusoft.validator;

import cn.edu.scau.neusoft.po.Goods;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Date;
@Component
public class GoodsValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
//        return false;
        return Goods.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Goods goods = (Goods)o;
        ValidationUtils.rejectIfEmpty(errors, "gname", "goods.gname.required");
        ValidationUtils.rejectIfEmpty(errors, "gdescription", "goods.gdescription.required");
        if(goods.getGprice()>100||goods.getGprice()<0){
            errors.rejectValue("gprice","gprice.invalid");
        }
        Date goodsdate = goods.getGdate();
        if(goodsdate!=null&&goodsdate.after(new Date())){
            errors.rejectValue("gdate","gdate.invalid");
        }
    }
}
