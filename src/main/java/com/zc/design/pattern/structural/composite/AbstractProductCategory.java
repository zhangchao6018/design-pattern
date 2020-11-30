package com.zc.design.pattern.structural.composite;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public abstract class AbstractProductCategory {
    public void add(AbstractProductCategory element){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public String getName(AbstractProductCategory element){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public double getPrice(AbstractProductCategory element){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(AbstractProductCategory element){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void getPrint(){
        throw new UnsupportedOperationException("不支持添加操作");
    }
}
