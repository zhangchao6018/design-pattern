package com.zc.design.pattern.creational.builder;

/**
 * 描述:
 * 指导类
 * @Author: zhangchao
 **/
public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer makeComputer(int usbCount, String keyboard, String display){
        computerBuilder.buildDisplay(display);
        computerBuilder.buildKeyboard(keyboard);
        computerBuilder.buildUsbCount(usbCount);

        return computerBuilder.getComputer();
    }

}