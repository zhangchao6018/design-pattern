package com.zc.design.pattern.creational.abstractfactory;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Computer dellComputer = new DellComputer();
        dellComputer.createKeyBoard().typing();
        dellComputer.createMouse().click();

        Computer logicComputer = new LogicComputer();
        logicComputer.createKeyBoard().typing();
        logicComputer.createMouse().click();
    }
}
