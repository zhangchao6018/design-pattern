package com.zc.design.principle.openclose;

/**
 * 描述:
 *
 * @Author: zhangchao
 * @Date: 8/24/20 2:04 下午
 **/
public class JavaCourse implements Course {
    private Integer Id;

    private String name;

    private double price;

    public JavaCourse(Integer id, String name, double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return 1;
    }

    public String getName() {
        return "design pattern";
    }

    public Double getPrice() {
        return 100d;
    }
}
