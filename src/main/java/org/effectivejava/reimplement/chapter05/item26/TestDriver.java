package org.effectivejava.reimplement.chapter05.item26;

import java.util.List;

/**
 * Created by Administrator on 2016/6/11.
 */
public class TestDriver {


    //下面的语句编译错误，不可直接创建不可具体化类的数组
//    List<String>[] listArray = new List<String>[16];

    //下面的语句编译正确，但是有未检警告
    List<String>[] listArray = (List<String>[]) new Object[16];
}
