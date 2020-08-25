package com.zc.design.pattern.creational.singleton;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton INSTANCE = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (INSTANCE==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (INSTANCE==null){
                    INSTANCE = new  LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
