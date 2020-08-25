package com.zc.design.pattern.creational.builder;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
//        ComputerBuilder dellComputerBuilder = new  DellComputerBuilder("i5","1024g");
//        dellComputerBuilder.buildDisplay("21");
//        dellComputerBuilder.buildKeyboard("罗技键盘");
//        dellComputerBuilder.buildUsbCount(5);
//
//        ComputerBuilder macComputerBuilder = new  MacComputerBuilder("i7","256g");
//        macComputerBuilder.buildDisplay("15.6");
//        macComputerBuilder.buildUsbCount(4);
//
//        Computer dellComputer = dellComputerBuilder.getComputer();
//        Computer macComputer = macComputerBuilder.getComputer();
//        System.out.println(dellComputer.toString());
//        System.out.println(macComputer.toString());

        //根据实际情况 创建具体的ComputerBuilder实现类已达到构建Computer的目的
        ComputerDirector dellDirector = new ComputerDirector(new DellComputerBuilder("i9", "512g"));
        Computer dellComputer = dellDirector.makeComputer(5, "圣手二代", "29英寸");

        ComputerDirector macDirector = new ComputerDirector(new MacComputerBuilder("i4", "256g"));
        Computer macComputer = macDirector.makeComputer(4, "罗技键盘", "15.6英寸");

        System.out.println(dellComputer);
        System.out.println(macComputer);

    }
}
