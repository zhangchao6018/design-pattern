package com.zc.design.pattern.creational.builder.v2;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("i9", "1024g");

        //链式调用更加清晰--适用于参数多的时候,毕传参数可以作为build类的构造函数强制用户传入
        Computer computer = builder.display("15.6寸").
                keyboard("罗技键盘").
                usbCount(5).
                build();

        System.out.println(computer.toString());
    }
}
