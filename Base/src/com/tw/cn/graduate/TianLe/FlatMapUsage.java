package com.tw.cn.graduate.TianLe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//该方法key可以让你把一个流中的每个值都换成另一个流，然后把所有的流都链接起来成为一个流。
public class FlatMapUsage {
    public static void main(String[] args) {
        //将words 转化为 H e l l o W o r l d的单个字符
        String[] words = {"Hello", "World"};
        List<String> collect = Stream.of(words).
                map(w -> w.split("")).
                flatMap(Arrays::stream).
                toList();
        System.out.println("collect = " + collect);
    }
}
