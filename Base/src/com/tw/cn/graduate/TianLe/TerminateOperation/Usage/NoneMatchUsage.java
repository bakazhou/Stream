package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;


//noneMatch的含义是流中不包含符合谓词的元素
public class NoneMatchUsage {
    public static boolean listAllFieldZeroIsNotExist(List<Integer> integers ) {
        return integers.stream().noneMatch(integer -> integer.equals(0));
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 1, 0);
        System.out.println(listAllFieldZeroIsNotExist(integers));
    }
}
