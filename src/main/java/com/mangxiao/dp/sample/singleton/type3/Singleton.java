package com.mangxiao.dp.sample.singleton.type3;
/**
 * @description:懒汉式-线程不安全
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
