package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        // if a number can be divided by both 3 and 5 ---> fizzbuzz number
        // if a number can be divided by  5 ---> fizz number
        // if a number can be divided by  3 ---> buzz number

//        int num=15;
//
//        if( num%5==0 && num%3==0  ){
//            System.out.println(num+ " is fizzbuzz number");
//        }else if(num%5==0){
//            System.out.println(num+ " is fizz number");
//        }else if(num%3==0){
//            System.out.println(num+" is buzz number");
//        }//else{
//           // System.out.println("not a fizz or buzz number");
//       // }

        int num = 1;
        while (num <= 100) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is fizzbuzz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is fizz number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is buzz number");

            }
            ++num;

        }
    }
}
