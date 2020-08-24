package com.zc.design.principle.demeter;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.getTotalNum(teamLeader);

        //boss只用知道TeamLeader 不需要了解底层的GroupLeader
        boss.getTotalNum1(teamLeader);
    }
}
