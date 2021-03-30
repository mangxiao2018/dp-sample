package com.mangxiao.dp.sample.singleton.type6;
/**
 * @description:使用静态内部类完成单例模式-推荐使用
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){

    }

    /**
     * 写一个静态内部类,该类中有一个静态属性 Singleton
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
     * @return
     */
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
