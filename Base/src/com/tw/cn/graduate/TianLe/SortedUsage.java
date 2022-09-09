package com.tw.cn.graduate.TianLe;

import java.util.Arrays;
import java.util.List;

public class SortedUsage {
    //默认升序排列
    public static List<Integer> sortedListByDesc(List<Integer> integers ){
        return integers.stream().sorted().toList();
    }

    //默认降序排列
    public static List<Integer> sortedListByAsc(List<Integer> integers ){
        return integers.stream().sorted(((o1, o2) -> (o1 < o2) ? 1 : -1)).toList();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,3,5,1,2,7,6,8,9);
        List<Integer> sortedListByDesc = sortedListByDesc(integers);
        System.out.println("sort list by desc:"+sortedListByDesc);

        List<Integer> sortedListByAsc = sortedListByAsc(integers);
        System.out.println("sort list by asc:"+sortedListByAsc);
    }
}
