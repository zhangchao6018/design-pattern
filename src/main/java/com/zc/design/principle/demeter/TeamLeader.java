package com.zc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class TeamLeader {

    public int count(List<GroupLeader> groupLeaderList) {
        int result = 0;
        for (GroupLeader element : groupLeaderList) {
            result += element.count();
        }
        return result;
    }



    public int count() {
        int result = 0;

        GroupLeader groupLeaderA = new GroupLeaderA();
        GroupLeader groupLeaderB = new GroupLeaderB();
        List<GroupLeader> groupLeaderList= new ArrayList();
        groupLeaderList.add(groupLeaderA);
        groupLeaderList.add(groupLeaderB);


        for (GroupLeader element : groupLeaderList) {
            result += element.count();
        }
        return result;
    }
}
