package com.zc.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;

/**
 * 描述:
 *
 * @Author: zhangchao
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------懒汉模式线程不安全----------------------------------------");
        R1 r1 = new R1();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();

        try { TimeUnit.MILLISECONDS.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}

        System.out.println("--------------------------------double-check+volatile懒汉模式-----------------------------------");
        LazyDoubleCheckSingleton instance1 = LazyDoubleCheckSingleton.getInstance();
        System.out.println(instance1);
        LazyDoubleCheckSingleton instance2 = LazyDoubleCheckSingleton.getInstance();
        System.out.println(instance2);
        LazyDoubleCheckSingleton instance3 = LazyDoubleCheckSingleton.getInstance();
        System.out.println(instance3);

        System.out.println("-----------------------------------------静态内部类模式----------------------------------------");
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(staticInnerClassSingleton);
        StaticInnerClassSingleton staticInnerClassSingleton1 = StaticInnerClassSingleton.getInstance();
        System.out.println(staticInnerClassSingleton1);


        System.out.println("--------------------------------------------饿汉模式---------------------------------------------");
        //序列化\反序列化的侵入
        serializableHungrySingleton();

        //反射  在私有构造加判断,将组织反射
        //测试 HungrySingleton--适用
        //reflect_hugry();
        //测试 StaticInnerClassSingleton--适用
        //reflectInnerClass();
        //测试LazyDoubleCheckSingleton 私有构造加校验[无效]
        reflectLazyDoubleCheckSingleton();

        System.out.println("--------------------------------------------枚举模式---------------------------------------------");
        //序列化\反序列化的侵入
        serializableEnumSingletonWrongWay();
        serializableEnumSingleton();

        //尝试反射-空参构造创建枚举-失败
        //reflectEnumSingleton1();
        //无法通过反射创建枚举
        //reflectEnumSingleton2();


        System.out.println("--------------------------------------------ThreadLocal---------------------------------------------");
        ThreadLocalInstance localInstance = ThreadLocalInstance.getInstance();
        ThreadLocalInstance localInstance2 = ThreadLocalInstance.getInstance();
        ThreadLocalInstance localInstance3 = ThreadLocalInstance.getInstance();
        System.out.println();
    }

    /**
     * 无法通过反射创建枚举
     * @throws Exception
     */
    private static void reflectEnumSingleton2() throws Exception{
        System.out.println();
        Class<EnumSingleton> clazz = EnumSingleton.class;
        Constructor<EnumSingleton> declaredConstructor = clazz.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton instance1 = declaredConstructor.newInstance("hello",5);
        EnumSingleton instance2 = instance1.getInstance();
        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println("类名直接调用静态方法------------:"+instance);
        System.out.println("反射生成实例调用static获取实例--:"+instance1);
        System.out.println("反射生成的实例-----------------:"+instance2);
    }

    /**
     * 尝试反射-空参构造创建枚举-失败
     * @throws Exception
     */
    private static void reflectEnumSingleton1() throws Exception{
        System.out.println();
        Class<EnumSingleton> clazz = EnumSingleton.class;
        Constructor<EnumSingleton> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        EnumSingleton instance1 = declaredConstructor.newInstance();
        EnumSingleton instance2 = instance1.getInstance();
        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println("类名直接调用静态方法------------:"+instance);
        System.out.println("反射生成实例调用static获取实例--:"+instance1);
        System.out.println("反射生成的实例-----------------:"+instance2);
    }

    private static void reflectLazyDoubleCheckSingleton() throws Exception{
        System.out.println();
        Class<LazyDoubleCheckSingleton> clazz = LazyDoubleCheckSingleton.class;
        Constructor<LazyDoubleCheckSingleton> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazyDoubleCheckSingleton instance1 = declaredConstructor.newInstance();
        LazyDoubleCheckSingleton instance2 = instance1.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println("类名直接调用静态方法------------:"+instance);
        System.out.println("反射生成实例调用static获取实例--:"+instance1);
        System.out.println("反射生成的实例-----------------:"+instance2);
    }

    private static void reflectHugry() throws NoSuchMethodException, InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        System.out.println();
        HungrySingleton instance = HungrySingleton.getInstance();
        Class<HungrySingleton> clazz = HungrySingleton.class;
        Constructor<HungrySingleton> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instance1 = declaredConstructor.newInstance();
        HungrySingleton instance2 = instance1.getInstance();
        System.out.println("类名直接调用静态方法------------:"+instance);
        System.out.println("反射生成实例调用static获取实例--:"+instance1);
        System.out.println("反射生成的实例-----------------:"+instance2);
    }
    private static void reflectInnerClass() throws NoSuchMethodException, InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        System.out.println();
        Class<StaticInnerClassSingleton> clazz = StaticInnerClassSingleton.class;
        Constructor<StaticInnerClassSingleton> declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        StaticInnerClassSingleton instance1 = declaredConstructor.newInstance();
        StaticInnerClassSingleton instance2 = instance1.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println("类名直接调用静态方法------------:"+instance);
        System.out.println("反射生成实例调用static获取实例--:"+instance1);
        System.out.println("反射生成的实例-----------------:"+instance2);
    }

    /**
     * 序列化/反序列化 枚举
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void serializableEnumSingleton() throws IOException, ClassNotFoundException {
        System.out.println();
        EnumSingleton instance = EnumSingleton.getInstance();
//        instance.setObject(new Object());


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file_enum_right"));
        oos.writeObject(instance);
        File file = new File("singleton_file_enum_right");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        EnumSingleton o = (EnumSingleton) objectInputStream.readObject();
        //这里的setObject必须是getObject之前
//        o.setObject(new Object());

        System.out.println(instance.getObject());
        EnumSingleton instance1 = EnumSingleton.getInstance();
        System.out.println(instance1.getObject());
        System.out.println(o.getObject());
    }
    private static void serializableEnumSingletonWrongWay() throws IOException, ClassNotFoundException {
        System.out.println();
        EnumSingletonWrongWay instance = EnumSingletonWrongWay.getInstance();
        System.out.println(instance);
        EnumSingletonWrongWay instance1 = EnumSingletonWrongWay.getInstance();
        System.out.println(instance1);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file_enum"));
        oos.writeObject(instance);
        File file = new File("singleton_file_enum");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        EnumSingletonWrongWay o = (EnumSingletonWrongWay) objectInputStream.readObject();
        System.out.println(o);
    }
    private static void serializableHungrySingleton() throws IOException, ClassNotFoundException {
        System.out.println();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(hungrySingleton);
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        System.out.println(hungrySingleton1);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(hungrySingleton);
        File file = new File("singleton_file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton o = (HungrySingleton) objectInputStream.readObject();
        System.out.println(o);
    }

    static class R1 implements Runnable{
        public void run() {
            LazySingletonNotSafe lazySingletonNotSafe = LazySingletonNotSafe.getInstance();
            System.out.println(lazySingletonNotSafe);
        }
    }
}
