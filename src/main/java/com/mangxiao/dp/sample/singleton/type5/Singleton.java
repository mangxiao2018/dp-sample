package com.mangxiao.dp.sample.singleton.type5;
/**
 * @description:懒汉式-线程安全-同步方法
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){

    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * 同时保证了效率，推荐使用
     * @return
     */
    public static synchronized Singleton getInstance(){
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
