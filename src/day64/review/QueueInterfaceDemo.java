package day64.review;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        Queue<String>  taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend the class");
        taskQueue.add("Say bye to Java");
        taskQueue.add("Say bye to Java");

        System.out.println("taskQueue = " + taskQueue);

        taskQueue.offer("attend the class");
        System.out.println("taskQueue = " + taskQueue);
        taskQueue.remove();
        taskQueue.poll();
        taskQueue.poll();
        taskQueue.poll();


        System.out.println("taskQueue = " + taskQueue);
















    }
}
