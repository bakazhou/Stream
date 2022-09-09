package com.tw.cn.graduate.TianLe.Usage;

import java.util.Arrays;
import java.util.List;

//该方法会返回一个不超过给定长度的流。
public class LimitUsage {
    public static List<Integer> limitListBy2(List<Integer> integers ){
        return integers.stream().limit(2).toList();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,3,5,1,2,7,6,8,9);
        List<Integer> limitListBy2 = limitListBy2(integers);
        System.out.println("list limit 2:"+limitListBy2);
    }
}
