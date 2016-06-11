package org.effectivejava.reimplement.chapter05.item29;

/**
 * Created by Administrator on 2016/6/11.
 */
public class TestDriver {

    public static void main( String[] args ) {
        Favorites favorites = new Favorites();
        favorites.putFavorite(String.class, "Java");
        favorites.putFavorite(Integer.class, 123);
        favorites.putFavorite(Double.class, 123.456);
        favorites.putFavorite(Favorites.class, favorites);

        System.out.printf("%s\n %d\n %f\n %s\n", favorites.getFavorite(String.class), favorites.getFavorite(Integer.class),
                favorites.getFavorite(Double.class), favorites.getFavorite(Favorites.class));
    }
}
