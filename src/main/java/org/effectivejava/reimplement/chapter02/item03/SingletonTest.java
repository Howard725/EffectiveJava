package org.effectivejava.reimplement.chapter02.item03;

/**
 * Created by Administrator on 2016/5/30.
 */
public class SingletonTest {

    public static void main( String[] args ) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println( singleton == singleton1 );

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum1 = singletonEnum.INSTANCE;

        System.out.println( singletonEnum == singletonEnum1 );
        System.out.println( singletonEnum );
    }
}
