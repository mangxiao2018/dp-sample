package com.mangxiao.dp.sample.singleton.type7;

/**
 * @description:使用枚举实现单例-推荐使用
 * @author:mangxiao2018@126.com
 * @date:2021-3-30
 */
public enum Singleton {
    /**属性*/
    INSTANCE;
    public void sayHi(){
        System.out.println("Hi, my boy.");
    }
}
