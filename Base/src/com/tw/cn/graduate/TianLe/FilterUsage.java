package com.tw.cn.graduate.TianLe;

import java.util.Arrays;
import java.util.List;

public class FilterUsage {
    //截取所有能被2整除得数据
    public static List<Integer> filterMultiplesOf2(List<Integer> integers ){
        return integers.stream().filter(i -> i % 2 == 0).toList();
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filterList = FilterUsage.filterMultiplesOf2(integers);
        System.out.printf("filter list:%s%n", filterList);
    }
}
