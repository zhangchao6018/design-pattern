package com.zc.design.principle.singleresponsibility;

/**
 * 描述: 方法单一职责
 * 这里的方法单一,指的是底层方法职责单一
 * 具体如何使用交由顶层的方法去调用这些职责分明的底层方法
 * @Author: zhangchao
 **/
public class Method {
    //
    public void mixed(){
        //查询用户基本信息
        Object userBaseInfo = "do something";
        //查询用户会员信息
        Object userVIPInfo = "do something";
        //查询用户余额
        Object userBalance = "do something";
        //更新余额...
        Object userUpdate = "do something";
    }


    //--------------------方法单一职责化-------------------
    public void userBaseInfo(){
        //查询用户基本信息
        Object userBaseInfo = "do something";
    }

    public void userVIPInfo(){
        //查询用户会员信息
        Object userVIPInfo = "do something";
    }

    public void userBalance(){
        //查询用户余额
        Object userBalance = "do something";
    }

    public void userUpdate(){
        //更新余额...
        Object userUpdate = "do something";
    }
}
