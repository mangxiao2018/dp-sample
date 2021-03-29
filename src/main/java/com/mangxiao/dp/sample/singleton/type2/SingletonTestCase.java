package com.mangxiao.dp.sample.singleton.type2;

/**
 * @description:饿汉式(静态变量)测试类
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class SingletonTestCase {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        Singleton instance01 = Singleton.getInstance();
        Singleton instance02 = Singleton.getInstance();

        System.out.println(instance01 == instance02);//true

        System.out.println("instance01.hashCode=" + instance01.hashCode());
        System.out.println("instance02.hashCode=" + instance02.hashCode());
    }
}
