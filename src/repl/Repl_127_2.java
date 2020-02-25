package repl;

import java.util.Arrays;

public class Repl_127_2 {
    public static void main(String[] args) {
        //An array inhabitants represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:
        //[3, 6, 0, 4, 3, 2, 7, 1]
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};

        //Day 0 [3, 6, 0, 4, 3, 2, 7, 1] ===> day x           3,    6,    0,    4,   3,   2,   7,   1
        //Day 1 [1, 3, 0, 2, 1, 1, 3, 0] ===> day x+1        3/2    6/2   0/2   4/2  3/2  2/2   7/2  1/2
        //Day 2 [0, 1, 0, 1, 0, 0, 1, 0] ===> day x+1+1
        //Day 3 [0, 0, 0, 0, 0, 0, 0, 0] ===> day x+1+1+1
        //---- EXTINCT ----

//1. String[] lastDay={0, 0, 0, 0, 0, 0, 0, 0};  if it equals to lastday ,
        //2. Day x [0, 0, 0, 0, 0, 0, 0, 0]  =======>  sum of the values inside the array is 0 ,
        //3. find the most populated city ======> 7 ===========> 0  ,
        int day=0;
      int sum;

        do{
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
            day++;
           sum=0;

            for(int x=0; x<inhabitants.length;x++){
                inhabitants[x]=inhabitants[x]/2;
                sum=sum+inhabitants[x];

            }

        }while(sum>0);
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }
}

