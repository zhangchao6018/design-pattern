package com.zc.design.pattern.creational.factorymethod;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory mybatisFactory = new MybatisCourseFactory();
        mybatisFactory.createCourse().learn();

        CourseFactory springFactory = new SpringCourseFactory();
        springFactory.createCourse().learn();

    }
}
