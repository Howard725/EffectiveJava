package org.effectivejava.reimplement.chapter05.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/11.
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> clazz, T instance ){
        if ( clazz != null )
            favorites.put(clazz, instance);
    }

    public <T> T getFavorite(Class<T> clazz ) {
        return clazz.cast( favorites.get(clazz) );
    }
}
