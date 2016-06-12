package org.effectivejava.reimplement.chapter06.item34;

/**
 * Created by Administrator on 2016/6/12.
 */
public enum ExtendedOperation implements Operation{

    EXP("^"){
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%"){
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;
    ExtendedOperation( String symbol ) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
