package com.mangxiao.dp.sample.singleton.type4;
/**
 * @description:懒汉式-线程安全-同步方法
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    /**
     * 懒汉式，加同步锁解决线程安全问题
     * @return
     */
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
