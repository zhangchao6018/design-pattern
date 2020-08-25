package com.zc.design.pattern.creational.factorymethod;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class MybatisCourseFactory extends CourseFactory {
    public Course createCourse() {
        return new MybatisCourse();
    }
}
