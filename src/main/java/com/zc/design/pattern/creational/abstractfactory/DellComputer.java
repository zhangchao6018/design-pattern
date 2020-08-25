package com.zc.design.pattern.creational.abstractfactory;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class DellComputer implements Computer {
    public Mouse createMouse() {
        return new DellMouse();
    }

    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
