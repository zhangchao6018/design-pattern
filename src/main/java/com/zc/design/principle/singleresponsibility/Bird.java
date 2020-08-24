package com.zc.design.principle.singleresponsibility;

/**
 * 描述: 类单一职责
 *
 * @Author: zhangchao
 * @Date: 8/24/20 3:06 下午
 **/
public class Bird {

    /**
     * 如果继续在此业务类扩展,代码复杂度越来越高,出错风险来越大
     * @param birdName
     */
    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else {
            System.out.println(birdName + "用翅膀飞");
        }
    }

}
