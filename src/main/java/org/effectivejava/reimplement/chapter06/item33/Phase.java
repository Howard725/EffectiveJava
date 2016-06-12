package org.effectivejava.reimplement.chapter06.item33;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/12.
 */
public enum Phase {

    SOLID, LIQUID, GAS;

    public enum Transition {

        MELT(SOLID, LIQUID ), FREEZE( LIQUID, SOLID ),
        BOIL( LIQUID, GAS ), CONDENSE( GAS, LIQUID ),
        SUBLIME( SOLID, GAS ), DEPOSIT( GAS, SOLID );

        private final Phase src;
        private final Phase dst;

        Transition( Phase src, Phase dst ) {
            this.src = src;
            this.dst = dst;
        }

        private static final Map< Phase, Map< Phase, Transition >> m =
                new EnumMap<Phase, Map<Phase, Transition>>(Phase.class);

        static {
            for ( Phase p : Phase.values() ) {
                m.put( p, new EnumMap<Phase, Transition>(Phase.class) );
            }

            for ( Transition t : Transition.values() ) {
                m.get( t.src ).put( t.dst, t );
            }
        }

        public static Transition from( Phase src, Phase dst ) {
            return m.get(src).get(dst);
        }

    }
}
