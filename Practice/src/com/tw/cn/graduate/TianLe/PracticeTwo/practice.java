package com.tw.cn.graduate.TianLe.PracticeTwo;

import java.util.*;
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

    private static Optional<Integer> getMaxValue(List<Transaction> transactions) {
        return transactions.stream().max(Comparator.comparing(Transaction::getValue)).map(Transaction::getValue);
    }
    private static Optional<Integer> getMinValue(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getValue).reduce(Integer::min);
    }
    private static int getSumValue(List<Transaction> transactions) {
        return transactions.stream().mapToInt(Transaction::getValue).sum();
    }
    private static Map<String, List<Transaction>> getGroupByTraderName(List<Transaction> transactions) {
        return transactions.stream().collect(Collectors.groupingBy(transaction -> transaction.getTrader().getName()));
    }
    private static Map<Integer, List<Transaction>> getGroupByYear(List<Transaction> transactions) {
        return transactions.stream().sorted(Comparator.comparing(Transaction::getYear)).collect(Collectors.groupingBy(Transaction::getYear));
    }
    public static void main(String[] args) {
        //set up
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //??????2011???????????????????????????????????????(????????????)
        List<Transaction> before2011TransActionList = getBefore2011TransActionList(transactions);
        System.out.println("before2011TransActionList:" + before2011TransActionList);

        //???????????????????????????????????????????????????
        List<String> city = getTraderDifCity(transactions);
        System.out.println("city:" + city);

        //?????????????????????????????????????????????????????????
        List<Trader> cambridgeTraders = getCambridgeTraders(transactions);
        System.out.println("cambridgeTraders:" + cambridgeTraders);

        //???????????????????????????????????????????????????????????????
        List<String> allTraderNames = getAllTraderNames(transactions);
        System.out.println("allTraderNames:" + allTraderNames);

        //???????????????????????????????????????
        boolean isTraderAtMilan = isTraderAtMilan(transactions);
        System.out.println("isTraderAtMilan:" + isTraderAtMilan);

        //???????????????????????????????????????????????????
        printAllTraderValueAtCambridge(transactions);

        //?????????????????????????????????????????????
        Optional<Integer> maxValue = getMaxValue(transactions);
        System.out.println("maxValue:" + maxValue.get());

        //??????????????????????????????
        Optional<Integer> minValue = getMinValue(transactions);
        System.out.println("minValue:"+minValue.get());

        //??????????????????
        int sumValue = getSumValue(transactions);
        System.out.println("sumValue:"+sumValue);

        //?????????????????????????????????????????????
        Map<String, List<Transaction>> groupByTraderName = getGroupByTraderName(transactions);
        System.out.println("groupByTraderName:"+groupByTraderName);

        //???????????????????????????????????????
        Map<Integer, List<Transaction>> groupByYear = getGroupByYear(transactions);
        System.out.println("groupByYear:"+groupByYear);
    }

}
