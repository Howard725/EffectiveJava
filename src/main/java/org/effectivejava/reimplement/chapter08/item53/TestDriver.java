package org.effectivejava.reimplement.chapter08.item53;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/16.
 */
public class TestDriver {

    public static void main(String[] args){
        Class<?> clazz = null;
        try {
            clazz = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
            System.exit(1);
        }

        Set<String> s = null;
        try {
            s = (Set<String>) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
