package com.zc.design.pattern.creational.builder;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public abstract class ComputerBuilder {
    public abstract void buildUsbCount(int usbCount);//可选
    public abstract void buildKeyboard(String keyboard);//可选
    public abstract void buildDisplay(String display);//可选

    public abstract Computer getComputer();
}
