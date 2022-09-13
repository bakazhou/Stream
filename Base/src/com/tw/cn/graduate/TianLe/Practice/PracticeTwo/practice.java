package com.tw.cn.graduate.TianLe.Practice.PracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
    private static List<Transaction> getBefore2011TransActionList(List<Transaction> transactions) {
        return transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted((t1, t2) -> t1.getValue() >= t2.getValue() ? 1 : -1).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        //set up
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //找出2011年的所有交易并按交易额排序(从低到高)
        List<Transaction> before2011TransActionList = getBefore2011TransActionList(transactions);
        System.out.println("before2011TransActionList:"+before2011TransActionList);


    }

}
