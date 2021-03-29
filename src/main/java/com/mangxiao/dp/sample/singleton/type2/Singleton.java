package com.mangxiao.dp.sample.singleton.type2;
/**
 * @description:饿汉式(静态变量)
 * @author:mangxiao2018@126.com
 * @date:2021-3-29
 */
public class Singleton {
    /**
     * 构造器私有化，防止外部通过new来实例化此类
     */
    private Singleton(){

    }
    /**
     * 创建final的static的instance实例
     */
    private static Singleton instance;

    /**
     * 在静态代码块中，创建单例对象
     */
    static {
        instance = new Singleton();
    }
    /**
     * 提供一个公有的静态方法,返回实例对象
     */
    public static Singleton getInstance(){
        return instance;
    }
}
