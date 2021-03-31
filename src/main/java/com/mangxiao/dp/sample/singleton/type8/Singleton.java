package com.mangxiao.dp.sample.singleton.type8;
/**
 * @description:懒汉式-同步代码块-线程不安全
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    /**
     * 提供一个静态的公有方法-同步代码块
     * 不推荐使用
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
