package org.effectivejava.reimplement.chapter02.item02;

/**
 * Created by Administrator on 2016/5/30.
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder( int servingSize, int servings ) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setFat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder setSodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder setCarbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts( Builder builder ) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main( String[] args ){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder( 1, 2 )
                .setCalories(3).setFat(4).setSodium(5).setCarbohydrate(6).build();
        System.out.println(nutritionFacts);
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
