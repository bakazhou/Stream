package com.tw.cn.graduate.TianLe.TerminateOperation.Usage;

import java.util.Arrays;
import java.util.List;

//anyMatch方法可以回答“流中是否有一个元素能匹配到给定的谓词”。会返回一个boolean值。
public class AnyMatchUsage {
    public static boolean listIsIncludeZero (List<Integer> integers ){
        return integers.stream().anyMatch(integer -> integer.equals(0));
    }

    public static void main(String[] args) {
        //set up
        List<Integer> integers = Arrays.asList(0, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10);
        boolean flag = listIsIncludeZero(integers);
        System.out.println(flag);
    }
}
