package day17;

public class SkipCounting {
    public static void main(String[] args) {

        //skip counting by 3 from 0 till 30

        // 3 6 9 12...

        int counter=0;

        while(counter<30){
            counter=counter+3;  // counter+=3;
            System.out.println("counter = " + counter);

        }
        //write a program to print out a even number from 0 to 50;
        //write a program to print out a odd number from 0 to 50;
        System.out.println("---------------------------------------");
        int evenNumber=0;
        while(evenNumber<50){
            evenNumber+=2;
            System.out.print(evenNumber+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        int oddNUmber=1;
        while(oddNUmber<50){
            System.out.print(oddNUmber+" ");
            oddNUmber+=2;
        }
        System.out.println("---------------------------------------");
        int cnt3=0;
        while(cnt3<=50){
            if(cnt3%2==0){
                System.out.println("cnt3 = " + cnt3+" is even number");

                }else{
                System.out.println("cnt3 = " + cnt3+" is odd number");
            }
            ++cnt3;
        }








    }
}
