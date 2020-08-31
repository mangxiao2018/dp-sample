package com.mangxiao.dp.sample.singleton;

import org.apache.juli.logging.LogFactory;

import java.util.logging.Logger;

public class TestSingleton {
    public static void main(String[] args){
        SingletonH s1 = null;
        for (int i = 1; i<=100; i++){
            s1 = SingletonH.getInstance();
            System.out.println("第"+i+"次创建饿汉式单例模式,验证创建对象是否是单例，对像为:"+s1);
        }

        System.out.println("------------------------------------------------------------");
        SingletonL s2 = null;
        for (int i = 1; i<=100; i++){
            s2 = SingletonL.getInstance();
            System.out.println("第"+i+"次创建懒汉式单例模式,验证创建对象是否是单例，对像为:"+s2);
        }
    }
}
