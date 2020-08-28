package com.mangxiao.dp.sample.singleton;

/**
 * @descripton:饿汉模式 - 是线程安全的
 * @author:mangxiao
 * @date:2020-8-28
 */
public class SingletonH {
    private static SingletonH instance = new SingletonH();

    public static SingletonH getInstance(){
        return instance;
    }
}
