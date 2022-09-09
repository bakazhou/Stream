package com.tw.cn.graduate.TianLe;

import java.util.Arrays;
import java.util.List;

public class SkipUsage {
    public static List<Integer> listSkipBy3(List<Integer> integers ){
        return integers.stream().skip(3).toList();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,3,5,1,2,7,6,8,9);
        List<Integer> listSkipBy3 = listSkipBy3(integers);
        System.out.println("list skip 3:"+listSkipBy3);
    }
}
