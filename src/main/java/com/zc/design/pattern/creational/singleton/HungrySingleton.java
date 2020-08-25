package com.zc.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class HungrySingleton implements Serializable {
    //类加载就完成赋值
//    private static final HungrySingleton instance =  new HungrySingleton();

    private static HungrySingleton instance ;


    private HungrySingleton() {
        if (instance !=null){
            throw new RuntimeException("单例构造器,禁止反射调用..");
        }
    }

    static {
        instance = new HungrySingleton();
    }
    public static HungrySingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return instance;
    }
}
