package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//findAny是找出流中的符合谓词的任意元素
public class FindAnyUsage {
    public static Optional<Integer> findAnyByListField(List<Integer> integers){
        return integers.stream().filter(integer -> integer.equals(1)).findAny();
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 1, 0);
        Optional<Integer> field = findAnyByListField(integers);
        System.out.println(field.isPresent());
    }
}
