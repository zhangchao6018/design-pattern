package com.zc.design.pattern.creational.builder;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class DellComputerBuilder extends ComputerBuilder {

    private Computer computer;

    public DellComputerBuilder(String cpu, String ram) {
        this.computer=new Computer(cpu,ram);
    }

    public void buildUsbCount(int usbCount) {
        //do something
        this.computer.setUsbCount(usbCount);
    }

    public void buildKeyboard(String keyboard) {
        //do something
        this.computer.setKeyboard(keyboard);
    }

    public void buildDisplay(String display) {
        //do something
        this.computer.setDisplay(display);
    }

    public Computer getComputer() {
        return computer;
    }
}
