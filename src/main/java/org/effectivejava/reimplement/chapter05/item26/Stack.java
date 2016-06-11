package org.effectivejava.reimplement.chapter05.item26;

/**
 * Created by Administrator on 2016/6/11.
 */
public class Stack<E> {

    private E[] elements;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

}
