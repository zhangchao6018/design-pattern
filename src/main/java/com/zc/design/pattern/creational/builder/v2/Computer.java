package com.zc.design.pattern.creational.builder.v2;

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

    private Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    static class ComputerBuilder{
        private Computer computer;

        public ComputerBuilder(String cpu,String ram) {
            this.computer = new  Computer(cpu,ram);
        }

        //        public void setCpu(String cpu) {
//            this.computer.cpu = cpu;
//        }
//
//        public void setRam(String ram) {
//            this.computer.ram = ram;
//        }

        public ComputerBuilder usbCount(int usbCount) {
            this.computer.usbCount = usbCount;
            return this;
        }

        public ComputerBuilder keyboard(String keyboard) {
            this.computer.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder display(String display) {
            this.computer.display = display;
            return this;
        }

        public Computer build(){
            return computer;
        }
    }


}
