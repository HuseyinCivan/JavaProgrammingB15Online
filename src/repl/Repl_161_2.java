package repl;

import java.util.Scanner;

public class Repl_161_2 {
    public static void main(String[] args) {
      int num=123321;
      int reverse=0;
      int originalNum=num;
      
      while(num>0){
          int remainder=num%10;
          reverse=reverse*10 + remainder;
          System.out.println(reverse);
          num=num/10;
          
      }
        System.out.println("originalNum = " + originalNum);
        System.out.println("reverse = " + reverse);



        
    }
}

