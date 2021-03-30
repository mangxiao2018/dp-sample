package com.mangxiao.dp.sample.singleton.type7;


/**
 * @description:用枚举实现单例模式-测试类
 * @author:mangxiao2018@126.com
 * @date:2021-3-30
 */
public class SingletonTestCase {
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args){
        System.out.println("使用枚举实现单例模式");
        Singleton instance01 = Singleton.INSTANCE;
        Singleton instance02 = Singleton.INSTANCE;

        System.out.println(instance01 == instance02);//true

        System.out.println("instance01.hashCode=" + instance01.hashCode());
        System.out.println("instance02.hashCode=" + instance02.hashCode());

        instance01.sayHi();
    }
}
