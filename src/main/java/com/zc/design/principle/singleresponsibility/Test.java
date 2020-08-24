package com.zc.design.principle.singleresponsibility;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        //v1
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");

        System.out.println("---------------------单一职责---------------------");
        //v2 单一职责
        BirdWalk birdWalk = new BirdWalk();
        birdWalk.mainMoveMode("鸵鸟");

        BirdFly birdFly = new BirdFly();
        birdFly.mainMoveMode("大雁");


    }
}
