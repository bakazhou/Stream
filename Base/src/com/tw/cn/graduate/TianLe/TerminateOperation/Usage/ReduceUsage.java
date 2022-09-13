package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceUsage {
    public static Integer elementSummationByReduce(List<Integer> integers){
        return integers.stream().reduce(0, Integer::sum);
    }

    public static Optional<Integer> findMaxElementByReduce(List<Integer> integers){
        return integers.stream().reduce(Integer::max);
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(0, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(elementSummationByReduce(integers));

        System.out.println(findMaxElementByReduce(integers).get());
    }
}
