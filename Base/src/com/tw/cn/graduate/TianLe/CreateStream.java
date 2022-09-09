package com.tw.cn.graduate.TianLe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    //数组转Stream流
    private static void createStreamByArray(){
        String[] array = {"a","b","c"};
        Stream<String> stream = Stream.of(array);
    }

    //List集合转Stream流
    private static void createStreamByList(){
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
    }

    //List集合转并行流
    private void createParallelStreamByList(){
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.parallelStream();
    }
}
