package com.zc.design.pattern.structural.composite;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Product extends AbstractProductCategory {

    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName(AbstractProductCategory element) {
        return this.name;
    }

    @Override
    public double getPrice(AbstractProductCategory element) {
        return this.price;
    }

    @Override
    public void getPrint() {
        System.out.println("productName:"+this.name+" price:"+price);
    }
}
