package practice12_05_19;

import java.util.Scanner;

public class SpeedAction {
    public static void main(String[] args) {

//
//        int start=10;
//        int end=27;
//
//        for(start=10;start<=end;start++){
//            System.out.print(start+" ");
//        }

        System.out.println("_________________________");

        Scanner scan=new Scanner(System.in);

        System.out.println("enter start speed");
        int start1=scan.nextInt();
        System.out.println("enter finish speed");
        int end1=scan.nextInt();

if(start1<end1) {

    for (int x = start1; x <= end1; x++) {
        System.out.print(" " + x);
    }}
    else{
        for (int x=start1;x>=end1;x--){
            System.out.print(" "+x);
        }
    }

}

    }

