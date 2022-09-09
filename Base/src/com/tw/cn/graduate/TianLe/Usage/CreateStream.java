package com.tw.cn.graduate.TianLe.Usage;

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

    //注意：并行流并不一定比普通的流快，因为涉及到多核的调度，消耗的内存更多，同时也可能会变得更慢
    //List集合转并行流
    private void createParallelStreamByList(){
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.parallelStream();
    }
}
