package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Collectors主要用于构建最终返回所需要的对象
public class CollectorsUsage {
    public static String makeStringByJoining(List<Integer> integers){
        return integers.stream().map(integer -> integer.toString()).collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(makeStringByJoining(integers));
    }
}
