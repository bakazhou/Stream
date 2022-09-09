package com.tw.cn.graduate.TianLe.Usage;

import java.util.Arrays;
import java.util.List;

//该方法会返回一个扔掉了前面n个元素的流。如果流中元素不足n个，则返回一个空流。
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
