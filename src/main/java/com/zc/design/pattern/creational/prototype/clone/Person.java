package com.zc.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Person implements Cloneable{
    private String username;

    //引用类型建议做深克隆
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.birthday = (Date) clone.birthday.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}
