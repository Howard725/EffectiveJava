package org.effectivejava.reimplement.chapter02.item03;

/**
 * Created by Administrator on 2016/5/30.
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {};

    public static Singleton getInstance() { return INSTANCE; }

}
