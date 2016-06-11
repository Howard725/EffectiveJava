package org.effectivejava.reimplement.chapter06.item30;

/**
 * Created by Administrator on 2016/6/11.
 */
public enum Planet {

    EARTH(1);

    private final int value;

    Planet( int value ){
        this.value = value;
    }

    int getValue(){
        return this.value;
    }

}
