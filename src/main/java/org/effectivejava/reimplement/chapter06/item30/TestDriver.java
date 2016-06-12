package org.effectivejava.reimplement.chapter06.item30;

/**
 * Created by Administrator on 2016/6/12.
 */
public class TestDriver {

    public static void main( String[] args ){

        System.out.println( PayrollDay.MONDAY.pay( 10, 50 ) );
        System.out.println( PayrollDay.SUNDAY.pay( 10, 50 ) );
    }
}
