package com.zc.design.principle.openclose;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Course course = new JavaCourse(1,"design pattern",100);

        System.out.println("课程id;"+course.getId()+",名称:"+course.getId()+",价格"+course.getPrice());

        //通过新增类,继承原有类,不改动上层构造--实现打折价格
        JavaDiscountCourse discountCourse = new JavaDiscountCourse(1,"design pattern",100);

        System.out.println("课程id;"+discountCourse.getId()+",名称:"+discountCourse.getId()+",价格"+discountCourse.getDiscountPrice());
    }
}
