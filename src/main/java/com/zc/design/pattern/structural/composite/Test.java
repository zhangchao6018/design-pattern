package com.zc.design.pattern.structural.composite;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {



        AbstractProductCategory category = new Category("手机",1);
        AbstractProductCategory product1 = new Product("iphone11" ,7999);
        AbstractProductCategory product2 = new Product("iphone12" ,9999);


        AbstractProductCategory category2 = new Category("三星手机",2);
        AbstractProductCategory product3 = new Product("Samsung 10s+" ,7999);
        AbstractProductCategory product4 = new Product("Samsung 20s" ,9999);
        category2.add(product3);
        category2.add(product4);

        category.add(product1);
        category.add(product2);
        category.add(category2);
        category.getPrint();


    }
}
