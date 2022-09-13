package com.tw.cn.graduate.TianLe.IntermediateOperation.Usage;

import java.util.List;

//peek就是在流的每个元素恢复运行之前，插入执行一个动作。
public class PeekUsage {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4);
        List<Integer> result =
                numbers.stream()
                        .peek(x -> System.out.println("from stream: " + x))
                        .map(x -> x + 17)
                        .peek(x -> System.out.println("after map: " + x))
                        .filter(x -> x % 2 == 0)
                        .peek(x -> System.out.println("after filter: " + x))
                        .limit(3)
                        .peek(x -> System.out.println("after limit: " + x)).toList();
        System.out.println("list peek:"+result);

    }
}
