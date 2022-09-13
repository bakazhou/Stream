package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;

//allMatch方法和anyMatch类似，校验流中是否都能匹配到给定的谓词。anymatch只需要一个元素与谓词匹配，而allMatch需要全部匹配
public class AllMatchUsage {
    public static boolean listAllFieldIsZero(List<Integer> integers ) {
        return integers.stream().allMatch(integer -> integer.equals(0));
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(0, 0, 0, 0, 0);
        System.out.println(listAllFieldIsZero(integers));
    }
}
