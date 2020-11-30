package com.zc.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Category extends AbstractProductCategory {
    //业务含义:分类 分类下面可能是商品,也可能是自分类
    private List<AbstractProductCategory> productHolder = new ArrayList();
    private String name;

    private Integer level;

    public Category(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(AbstractProductCategory element) {
        productHolder.add(element);
    }

    @Override
    public String getName(AbstractProductCategory element) {
        return this.name;
    }

    @Override
    public void remove(AbstractProductCategory element) {
        productHolder.remove(element);
    }

    @Override
    public void getPrint() {
        System.out.println(this.name);
        for(AbstractProductCategory element : productHolder){
            if (this.level!=null){
                for (int i= 0; i<level;i++){
                    System.out.print("    ");
                }
            }
            element.getPrint();
        }
    }


}

