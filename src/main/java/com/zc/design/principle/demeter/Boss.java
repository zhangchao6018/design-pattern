package com.zc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Boss {
    public void getTotalNum(TeamLeader teamLeader){
        GroupLeader groupLeaderA = new GroupLeaderA();
        GroupLeader groupLeaderB = new GroupLeaderB();
        List<GroupLeader> groupLeaderList= new ArrayList();
        groupLeaderList.add(groupLeaderA);
        groupLeaderList.add(groupLeaderB);

        int count = teamLeader.count(groupLeaderList);
        System.out.println("boss拿到了员工总数:"+count);
    }

    public void getTotalNum1(TeamLeader teamLeader){

        int count = teamLeader.count();
        System.out.println("boss拿到了员工总数:"+count);
    }
}
