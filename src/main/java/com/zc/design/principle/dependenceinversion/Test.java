package com.zc.design.principle.dependenceinversion;

/**
 * 描述:
 * 这是高层模块(应用层)
 *
 *  * HuMan不应该依赖具体实现,而仅应依赖接口
 *  * 想替换任何课程,不需要改HuMan该类,只需要上层调用方(Test类)去决定(方法传入,构造,setter...)
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        //v1 面向实习类编程
        System.out.println("-------------------v1 面向实习类编程-------------------");
        HuMan huMan = new HuMan();
        huMan.studyMybatisCource();
        huMan.studyRedisCource();
        huMan.studySpringCource();

        //具体内容应该交由高层(Test类)决定,而不是HuMan类

        //v2 面向接口编程 方法传入实例
        System.out.println("-------------------v2 面向接口编程 方法传入-------------------");
        huMan.studyCource(new MybatisCourse());
        huMan.studyCource(new RedisCourse());
        huMan.studyCource(new SpringCourse());

        //v3 面向接口编程  构造器注入实例
        System.out.println("-------------------v3 面向接口编程 构造器注入-------------------");
        HuMan huMan3 = new HuMan(new MybatisCourse());
        huMan3.studyCource3();

        //v4 面向接口编程  setter实例
        System.out.println("-------------------v4 面向接口编程  setter-------------------");
        HuMan huMan4 = new HuMan();
        huMan4.setCourse(new MybatisCourse());
        huMan4.studyCource3();
        huMan4.setCourse(new SpringCourse());
        huMan4.studyCource3();
        huMan4.setCourse(new RedisCourse());
        huMan4.studyCource3();

    }
}
