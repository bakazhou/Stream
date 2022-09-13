package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//找到符合谓词的元素流中的第一个元素
public class FindFirstUsage {
    public static Optional<Integer> findFirstByListFieldEqualOne(List<Integer> integers){
        return integers.stream().filter(integer -> integer.equals(1)).findAny();
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 1, 0);

        Optional<Integer> firstFieldEqualOne = findFirstByListFieldEqualOne(integers);

        System.out.println(firstFieldEqualOne.isPresent());

    }
}
