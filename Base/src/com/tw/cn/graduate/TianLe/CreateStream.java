package com.tw.cn.graduate.TianLe;

import java.util.stream.Stream;

public class CreateStream {
    //数组转Stream流
    private static void createStreamByArray(){
        String[] array = {"a","b","c"};
        Stream<String> stream = Stream.of(array);
    }
}
