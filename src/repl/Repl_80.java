package repl;

import java.util.Scanner;

public class Repl_80 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //Write a program that will print out route instructions.
        // Your program should take 2 parameters: start point and endpoint.
        // Use left, right, up and down for navigation. Insert ">" between commands.
        // If start point equals to endpoint - display: "start/end(start or end variable!) found".
        // Note: you may move only clockwise.

        String abcd = "A right B down C left D up A right B down C";
        String startPoint=scan.next();
        String endPoint=scan.next();
        int indexStart=0;
        int indexEnd=0;

        if(startPoint.equals(endPoint)){
            System.out.println(startPoint+" found");

        }
        else {
            if (startPoint.charAt(0) < endPoint.charAt(0)) {
                indexStart = abcd.indexOf(startPoint);
                indexEnd = abcd.indexOf(endPoint);

            } else if (startPoint.charAt(0) > endPoint.charAt(0)) {
                indexStart = abcd.indexOf(startPoint);
                indexEnd = abcd.lastIndexOf(endPoint);

            }
            String path = (abcd.substring(indexStart + 2, indexEnd - 1));
            path = path.replace('A', '>');
            path = path.replace('B', '>');
            path = path.replace('C', '>');
            path = path.replace('D', '>');

            System.out.println(path + ": " + endPoint + " found");
        }

    }
}
