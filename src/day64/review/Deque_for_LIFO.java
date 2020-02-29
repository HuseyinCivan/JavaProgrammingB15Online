package day64.review;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {
    public static void main(String[] args) {
        Deque< String > lifoQue = new LinkedList<>();


        lifoQue.add("review the class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to Java");
        lifoQue.add("Say bye to Java");

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());


        System.out.println("lifoQue = " + lifoQue);
        System.out.println("lifoQue.remove() = " + lifoQue.remove());
        System.out.println("lifoQue = " + lifoQue);
    }
}
