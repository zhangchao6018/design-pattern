package com.zc.design.principle.dependenceinversion;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class MybatisCourse implements Course {
    public void studyCourse() {
        System.out.println("学习Mybatis课程");
    }
}
