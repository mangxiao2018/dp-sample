package com.mangxiao.dp.sample.singleton;

/**
 * @description:懒汉模式 - 非线程安全的
 * @author:mangxiao
 * @date:2020-8-28
 */
public class SingletonL {
    private static SingletonL instance = null;

    public synchronized SingletonL getInstance(){
        if (null == instance){
             instance = new SingletonL();
        }
        return instance;
    }
}
