package com.zc.design.pattern.creational.builder.v3;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public  class Computer {

    private  String cpu;//必须
    private  String ram;//必须
    private  int usbCount;//可选
    private  String keyboard;//可选
    private  String display;//可选

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    static class ComputerBuilder{
        private  String cpu;//必须
        private  String ram;//必须
        private  int usbCount;//可选
        private  String keyboard;//可选
        private  String display;//可选

        public ComputerBuilder(String cpu,String ram) {
            this.cpu =cpu;
            this.ram =ram;
        }


        public ComputerBuilder usbCount(int usbCount) {
            this.usbCount =usbCount;
            return this;
        }

        public ComputerBuilder keyboard(String keyboard) {
            this.keyboard =keyboard;
            return this;
        }

        public ComputerBuilder display(String display) {
            this.display =display;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
