package org.effectivejava.reimplement.chapter02.item01;

/**
 * Created by Administrator on 2016/5/30.
 */
public class Test {

    public static void main( String[] args ) {

        Services.registerProvider(DEFAULT_PROVIDER);
        Services.registerProvider( "Comp service.", ANOTHER_PROVIDER );

        Service defaultService = Services.newInstance();
        Service anotherService = Services.newInstance("Comp service.");

        System.out.printf("%s\n%s\n", defaultService, anotherService );

    }

    private final static Provider DEFAULT_PROVIDER = new Provider() {
        public Service getService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default service.";
                }
            };
        }
    };

    private final static Provider ANOTHER_PROVIDER = new Provider() {
        public Service getService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Another service.";
                }
            };
        }
    };

}
