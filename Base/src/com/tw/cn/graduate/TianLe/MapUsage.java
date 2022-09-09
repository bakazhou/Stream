package com.tw.cn.graduate.TianLe;

import java.util.List;

//该方法会接受一个函数作为参数，这个函数会被应用到每个元素上，并将其映射成一个新的元素。就是根据指定函数获取流中得每个元素得数据并重新组合成一个新的元素。
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
