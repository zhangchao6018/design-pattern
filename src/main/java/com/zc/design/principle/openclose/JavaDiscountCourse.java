package com.zc.design.principle.openclose;

/**
 * 描述:
 *
 * @Author: zhangchao
 * @Date: 8/24/20 2:09 下午
 **/
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    public double getDiscountPrice(){
        return super.getPrice()*0.8;
    }
}
