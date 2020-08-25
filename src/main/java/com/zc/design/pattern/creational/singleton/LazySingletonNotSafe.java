package com.zc.design.pattern.creational.singleton;

/**
 * 描述:
 * 懒加载--多线程不安全
 * @Author: zhangchao
 **/
public class LazySingletonNotSafe {
    private static LazySingletonNotSafe instance;

    private LazySingletonNotSafe() {
    }

    public static LazySingletonNotSafe getInstance(){
        if (instance==null){
            instance = new LazySingletonNotSafe();
        }
        return instance;
    }

}
