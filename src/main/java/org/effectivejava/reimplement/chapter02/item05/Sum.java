package org.effectivejava.reimplement.chapter02.item05;

/**
 * Created by Administrator on 2016/5/30.
 */
public class Sum {

    public static void main( String[] args ) {

        long startTime = System.currentTimeMillis();

        method();

        long endTime = System.currentTimeMillis();
        System.out.println( (double)( endTime - startTime ) / 1000 + "seconds");

    }

    private static void method() {

        long sum = 0L;
        for ( int i = 0; i < Integer.MAX_VALUE; ++i ) {
            sum += i;
        }
        System.out.println(sum);

    }
}
