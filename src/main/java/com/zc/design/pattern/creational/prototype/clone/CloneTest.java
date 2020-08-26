package com.zc.design.pattern.creational.prototype.clone;


import java.util.Date;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setBirthday(new Date(0L));
        person.setUsername("default name");

        Person clonePerson = (Person) person.clone();
        clonePerson.getBirthday().setTime(10000L);
        System.out.println(person);
        System.out.println(clonePerson);

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton clone = (HungrySingleton) hungrySingleton.clone();
        System.out.println(hungrySingleton);
        System.out.println(clone);
    }
}
