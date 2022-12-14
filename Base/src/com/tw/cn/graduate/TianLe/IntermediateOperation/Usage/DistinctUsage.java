package com.tw.cn.graduate.TianLe.IntermediateOperation.Usage;

import java.util.Arrays;
import java.util.List;

//该操作会返回一个元素各异（根据流所生成元素的hashCode和equals方法实现）的流。
public class DistinctUsage {
    public static List<Integer> removeDuplicateNumbers(List<Integer> integers ){
        return integers.stream().distinct().toList();
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> duplicateNumbers = removeDuplicateNumbers(integers);
        System.out.println("duplicate numbers:"+duplicateNumbers);
    }
}
