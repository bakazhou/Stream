package com.tw.cn.graduate.TianLe.Practice.PracticeTwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class practice {
    private static List<Transaction> getBefore2011TransActionList(List<Transaction> transactions) {
        return transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted((t1, t2) -> t1.getValue() >= t2.getValue() ? 1 : -1).collect(Collectors.toList());
    }
    private static List<String> getTraderDifCity(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(Collectors.toList());
    }
    private static List<Trader> getCambridgeTraders(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Cambridge")).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
    }

    private static List<String> getAllTraderNames(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).distinct().sorted(Comparator.comparing(Trader::getName)).map(Trader::getName).collect(Collectors.toList());
    }
    private static boolean isTraderAtMilan(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).anyMatch(trader -> trader.getCity().equals("Milan"));
    }

    private static void printAllTraderValueAtCambridge(List<Transaction> transactions) {
        transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);
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

        //找出交易员都在哪些不同的城市工作过
        List<String> city = getTraderDifCity(transactions);
        System.out.println("city:"+city);

        //找出所有来自剑桥的交易员，并按姓名排序
        List<Trader> cambridgeTraders = getCambridgeTraders(transactions);
        System.out.println("cambridgeTraders:"+cambridgeTraders);

        //返回所有交易员的姓名字符串，按字母顺序排序
        List<String> allTraderNames = getAllTraderNames(transactions);
        System.out.println("allTraderNames:"+allTraderNames);

        //有没有交易员是在米兰工作的
        boolean isTraderAtMilan = isTraderAtMilan(transactions);
        System.out.println("isTraderAtMilan:"+isTraderAtMilan);

        //打印生活在剑桥的交易员的所有交易额
        printAllTraderValueAtCambridge(transactions);


    }



}
