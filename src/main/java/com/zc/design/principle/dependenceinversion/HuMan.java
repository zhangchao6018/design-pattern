package com.zc.design.principle.dependenceinversion;

/**
 * 描述:
 * @Author: zhangchao
 **/
public class HuMan {
    private Course course;

    public HuMan() {
    }
    public HuMan(Course course) {
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //----------------------v1 面向实现编程-------------------
    public void studySpringCource(){
        System.out.println("HuMan正在学习Spring课程");
    }
    public void studyMybatisCource(){
        System.out.println("HuMan正在学习Mybatis课程");
    }
    public void studyRedisCource(){
        System.out.println("HuMan正在学习Redis课程");
    }



    //----------------------v2 面向接口方法编程-------------------
    public void studyCource(Course course){
        course.studyCourse();
    }


    //----------------------v3 面向接口编程-------------------
    public void studyCource3(){
        this.course.studyCourse();
    }
}
