package practice12_05_19;

import java.util.Scanner;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {

        int sum=0;
        for(int x=0;x<=10;x++) {
            sum = sum + x;
            System.out.println(sum);
        }
        System.out.println("total sum = " + sum);

        Scanner scan=new Scanner(System.in);
        System.out.println("enter to numbers, i will sum all");
        int firstNum=scan.nextInt();
        int secondNum=scan.nextInt();
        int sum2=0;

        if(firstNum<secondNum) {
            for (int x = firstNum; x <= secondNum; x++) {
                sum2 = sum2 + x;
            }
            System.out.println(sum2);
        }if(firstNum>secondNum){
            for(int x=firstNum;x>=secondNum;x--){
                sum2=sum2+x;
            }
            System.out.println(sum2);
        }

    }
}
