package com.tw.cn.graduate.TianLe;

import java.util.Arrays;
import java.util.List;

public class SortedUsage {
    public static List<Integer> sortedListByDesc(List<Integer> integers ){
        return integers.stream().sorted().toList();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,3,5,1,2,7,6,8,9);
        List<Integer> sortedListByDesc = sortedListByDesc(integers);
        System.out.println("sort list by desc:"+sortedListByDesc);


    }
}
