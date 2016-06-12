package org.effectivejava.reimplement.chapter06.item32;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Text {
    private enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    public void applyStyles(Set<Style> styles){};

    public static void main ( String[] args ){
        Text text = new Text();

        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
