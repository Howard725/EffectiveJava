package org.effectivejava.reimplement.chapter06.item34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

/**
 * Created by Administrator on 2016/6/12.
 */
public class OperationTestDriver {

    public static void main(String[] args){
        double x = Double.parseDouble( args[0] );
        double y = Double.parseDouble( args[1] );
        test1(ExtendedOperation.class, x, y );
        test2(Arrays.asList(ExtendedOperation.values()), x, y);
        test2(EnumSet.of(ExtendedOperation.EXP, ExtendedOperation.REMAINDER), x, y );
    }

    public static <T extends Enum<T> & Operation > void test1( Class<T> clazz, double x, double y) {
        for ( Operation operation : clazz.getEnumConstants() ){
            System.out.printf( "%f %s %f = %f\n", x, operation, y, operation.apply(x,y) );
        }
    }

    public static void test2(Collection<? extends Operation> opSet, double x, double y) {
        for ( Operation operation : opSet ) {
            System.out.printf( "%f %s %f = %f\n", x, operation, y, operation.apply(x,y) );
        }
    }
}
