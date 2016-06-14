package org.effectivejava.reimplement.chapter06.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/6/14.
 */
public class RunTests {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        int passes = 0;
        int tests = 0;

        String className = args[0];
        Class clazz = Class.forName(className);

        for (Method m : clazz.getDeclaredMethods()){
            if ( m.isAnnotationPresent(Test.class) ) {
                tests++;
                try {
                    m.invoke(null);
                    passes++;
                } catch (InvocationTargetException e) {
                    Throwable exception = e.getCause();
                    System.out.println( m + " failed: " + exception);
                } catch (IllegalAccessException e) {
                    System.out.println( m + " cannot access.");
                } catch (Exception e){
                    System.out.println("INVALID @Test: " + m);
                }
            }

            if ( m.isAnnotationPresent(ExceptionTest.class) ) {
                tests++;
                try{
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception\n", m);
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
                    int oldPassed = passes;
                    for ( Class<? extends Exception> excType : m.getAnnotation(ExceptionTest.class).value()){
                        if ( excType.isInstance(exc) ){
                            passes++;
                            break;
                        }
                    }
                    if ( oldPassed == passes ) {
                        System.out.printf("Test %s failed: %s \n", m, exc);
                    }
                } catch (Exception e) {
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d\n", passes, tests - passes);
    }
}
