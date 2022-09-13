package com.tw.cn.graduate.TianLe.Practice.PracticeOne;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    private static Stream<String> getCalorieMoreThan300Dishes(List<Dish> menu) {
        return menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName);
    }
    private static List<String> getVegetarianDishes(List<Dish> menu) {
        return menu.stream().filter(Dish::isVegetarian).map(Dish::getName).toList();
    }
    public static void main(String[] args) {
        
        //set up
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        
        //(1) 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢?例如，给定[1, 2, 3, 4,5]，应该返回[1, 4, 9, 16, 25]。
        List<Integer> squaresList = getSquaresList(numbers);
        
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
        Stream<String> calorieMoreThan300Dishes = getCalorieMoreThan300Dishes(menu);

        //获取所有属于青菜类别的菜名集合
        List<String> vegetarianDishes = getVegetarianDishes(menu);

    }
}
