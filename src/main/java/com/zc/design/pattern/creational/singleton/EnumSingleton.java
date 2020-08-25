package com.zc.design.pattern.creational.singleton;

/**
 * 枚举在编译器加载期间就加载好,类似于饿汉模式静态代码块
 */
public enum EnumSingleton {
    INSTANCE;
    private Object object;

//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }

    EnumSingleton() {
        this.object = new Object();
    }

    public Object getObject() {
        return object;
    }


    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
