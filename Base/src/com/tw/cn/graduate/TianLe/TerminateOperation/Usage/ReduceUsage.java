package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
此类查询需要将流中所有元素反复结合起来，得到一个值，比如一个 Integer 。这样的查询可以被归类为归约操作（将流归约成一个值）。用函数式编程语言的术语来说，这称为折叠（fold），因为你可以将这个操
作看成把一张长长的纸（你的流）反复折叠成一个小方块，而这就是折叠操作的结果。
 */
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
