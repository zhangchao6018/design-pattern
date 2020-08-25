package com.zc.design.pattern.creational.factorymethod;


/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class SpringCourseFactory extends CourseFactory {
    public Course createCourse() {
        return new SpringCourse();
    }
}
