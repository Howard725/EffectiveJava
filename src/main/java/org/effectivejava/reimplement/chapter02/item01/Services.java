package org.effectivejava.reimplement.chapter02.item01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/5/30.
 */
public class Services {

    private final static Map< String, Provider > providers = new ConcurrentHashMap< String, Provider>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerProvider( String providerName, Provider provider ) {
        providers.put(providerName, provider);
    }

    public static void registerProvider( Provider provider ) {
        registerProvider( DEFAULT_PROVIDER_NAME, provider);
    }

    public static Service newInstance( String providerName ) {
        return providers.get(providerName).getService();
    }

    public static Service newInstance() {
        return providers.get(DEFAULT_PROVIDER_NAME).getService();
    }

}
