package com.zc.design.pattern.structural.adapter.objectadapter;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class AC220V {
    public int  outputElectric220(){
        int e = 220;
        System.out.println("这是民用电"+e+"V");
        return e;
    }
}
