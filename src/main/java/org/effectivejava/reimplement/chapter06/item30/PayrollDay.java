package org.effectivejava.reimplement.chapter06.item30;

/**
 * Created by Administrator on 2016/6/12.
 */
public enum PayrollDay {

    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    SUNDAY(PayType.WEEKEND);

    PayrollDay( PayType payType ) {
        this.payType = payType;
    }

    private final PayType payType;

    public double pay( double hours, double payRate ) {
        return payType.pay( hours, payRate );
    }

    private enum PayType {

        WEEKDAY{
            @Override
            double overtimePay(double hours, double payRate) {
                return hours <= HOURS_PER_SHIFT ? 0 : ( hours - HOURS_PER_SHIFT ) * payRate;
            }
        },
        WEEKEND{
            @Override
            double overtimePay(double hours, double payRate) {
                return hours * payRate;
            }
        };

        private static final int HOURS_PER_SHIFT = 8;

        abstract double overtimePay( double hours, double payRate );

        double pay( double hours, double payRate ) {
            double basePay = hours * payRate;
            return basePay + overtimePay( hours, payRate );
        }
    }
}
