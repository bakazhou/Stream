package com.tw.cn.graduate.TianLe;

import java.util.List;

public class MapUsage {
    private static List<String> mapTaskName(List<Task> tasks){
        return tasks.stream().map(Task::getName).toList();
    }

    private static List<Integer> mapTaskId(List<Task> tasks){
        return tasks.stream().map(Task::getId).toList();
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(new Task("task0", 0), new Task("task1", 1));

        List<String> taskName = mapTaskName(tasks);
        System.out.println("task name:"+taskName);

        List<Integer> taskId = mapTaskId(tasks);
        System.out.println(taskId);
    }
}
