package com.ajn.design.pattern.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        MeanBuilder meanBuilder = new MeanBuilder();
        Meal vegMeal = meanBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        System.out.println();
        System.out.println();

        Meal nonVegMeal = meanBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }

}
