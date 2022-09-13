package com.tw.cn.graduate.TianLe.PracticeOne;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

public class practice {
    private static List<Integer> getSquaresList(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).toList();
    }

    private static List<int[]> getArrays(List<Integer> numbers1, List<Integer> numbers2) {
        return numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[]{i, j})).toList();
    }

    private static List<int[]> getArraysMultiplesOfThree(List<Integer> numbers1, List<Integer> numbers2) {
        return numbers1.stream().flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).toList();
    }

    private static List<String> getCalorieMoreThan300Dishes(List<Dish> menu) {
        return menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList());
    }
    private static List<String> getVegetarianDishes(List<Dish> menu) {
        return menu.stream().filter(Dish::isVegetarian).map(Dish::getName).toList();
    }
    private static List<String> getGetCalorieMoreThan300AndIsNotVegetarianDishes(List<Dish> menu) {
        return menu.stream().filter(dish -> dish.getCalories() > 300).filter(dish -> !dish.isVegetarian()).map(Dish::getName).limit(2).collect(Collectors.toList());
    }
    private static boolean isAllDishesCaloriesLowerThan1000(List<Dish> menu) {
        return menu.stream().allMatch(dish -> dish.getCalories() <= 1000);
    }
    private static boolean isAnyDishCaloriesMoreThan1000(List<Dish> menu) {
        return menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);
    }
    private static Optional<String> getMaxCaloriesDishName(List<Dish> menu) {
        return menu.stream().max(Comparator.comparing(Dish::getCalories)).map(Dish::getName);
    }
    private static Optional<String> getMaxCaloriesVegetarianDishName(List<Dish> menu) {
        return menu.stream().filter(Dish::isVegetarian).max(Comparator.comparing(Dish::getCalories)).map(Dish::getName);
    }
    private static Map<Dish.Type, List<Dish>> getTypeListMap(List<Dish> menu) {
        return menu.stream().collect(Collectors.groupingBy(Dish::getType));
    }
    private static Map<Dish.Type, Optional<Dish>> getMaxCaloriesDishByType(List<Dish> menu) {
        return menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.maxBy(Comparator.comparing(Dish::getCalories))));
    }
    private static Map<Boolean, List<Dish>> getGroupByIsVegetarian(List<Dish> menu) {
        return menu.stream().collect(partitioningBy(Dish::isVegetarian));
    }
    public static void main(String[] args) {
        
        //set up
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        
        //(1) 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢?例如，给定[1, 2, 3, 4,5]，应该返回[1, 4, 9, 16, 25]。
        List<Integer> squaresList = getSquaresList(numbers);
        System.out.println("squaresList:"+squaresList);
        
        //(2) 给定两个数字列表，如何返回所有的数对呢?例如，给定列表[1, 2, 3]和列表[3, 4]，应 该返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]。为简单起见，你可以用有两个元素的数组来代表数对。
        List<int[]> arrays = getArrays(numbers1, numbers2);
        //(3) 如何扩展前一个例子，只返回总和能被3整除的数对呢?例如(2, 4)和(3, 3)是可以的。
        List<int[]> arraysMultiplesOfThree = getArraysMultiplesOfThree(numbers1, numbers2);
        //set up
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        //获取卡路里大于300的前三道菜肴的名字集合
        List<String> calorieMoreThan300Dishes = getCalorieMoreThan300Dishes(menu);
        System.out.println("calorieMoreThan300Dishes:"+calorieMoreThan300Dishes);
        //获取所有属于青菜类别的菜名集合
        List<String> vegetarianDishes = getVegetarianDishes(menu);
        System.out.println("vegetarianDishes:"+vegetarianDishes);
        //获取卡路里大于300的前两个荤菜名字集合
        List<String> calorieMoreThan300AndIsNotVegetarianDishes = getGetCalorieMoreThan300AndIsNotVegetarianDishes(menu);
        System.out.println("calorieMoreThan300AndIsNotVegetarianDishes:"+calorieMoreThan300AndIsNotVegetarianDishes);
        //判断是否所有菜的热量都低于1000卡路里
        boolean isAllDishesCaloriesLowerThan1000 = isAllDishesCaloriesLowerThan1000(menu);
        System.out.println("isAllDishesCaloriesLowerThan1000:"+isAllDishesCaloriesLowerThan1000);
        //判断是否有菜的热量高于1000卡路里
        boolean unHealthy = isAnyDishCaloriesMoreThan1000(menu);
        System.out.println("isAnyDishCaloriesMoreThan1000:"+unHealthy);
        //获取所有菜中热量最高的菜的名字
        Optional<String> maxCaloriesDishName = getMaxCaloriesDishName(menu);
        System.out.println("maxCaloriesDishName:"+maxCaloriesDishName.get());
        //获取素菜中热量最高的素菜的名字
        Optional<String> maxCaloriesVegetarianDishName = getMaxCaloriesVegetarianDishName(menu);
        System.out.println("maxCaloriesVegetarianDishName:"+maxCaloriesVegetarianDishName);
        //通过菜品的种类对所有的菜品进行分类，并获取集合
        Map<Dish.Type, List<Dish>> typeListMap = getTypeListMap(menu);
        System.out.println("typeListMap:"+typeListMap);
        //获取三种菜品分类中热量的最高的菜品，并按照类型进行分类
        Map<Dish.Type, Optional<Dish>> maxCaloriesDishByType = getMaxCaloriesDishByType(menu);
        System.out.println("maxCaloriesDishByType:"+maxCaloriesDishByType);
        //将菜品通过是否是蔬菜进行区分
        Map<Boolean, List<Dish>> groupByIsVegetarian = getGroupByIsVegetarian(menu);
        System.out.println("groupByIsVegetarian:"+groupByIsVegetarian);
    }

}
