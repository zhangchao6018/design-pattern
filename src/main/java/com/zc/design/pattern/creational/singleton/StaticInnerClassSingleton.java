package com.zc.design.pattern.creational.singleton;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (Creator.instance!=null){
            throw new RuntimeException("单例构造器,禁止反射调用..");
        }
    }

    private static class Creator{
      private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance(){
        return Creator.instance;
    }
}
