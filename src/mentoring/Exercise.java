package mentoring;

import java.util.Arrays;

public class Exercise {
    //Write a Java program that takes numbers 1 to 10 and
    //prints the multiplication table for each number
    //from 1 upto 10.
    //Sample Input: 1
    //Expected Output :
    //1 x 1 = 1
    //1 x 2 = 2
    //1 x 3 = 3
    //...
    //10 x 10 = 100

    public static void main(String[] args) {

        String s="asd";
        System.out.println("s = " + s);

//        for (int x = 1; x <= 10; x++) {  //OUTERLOOP
//
//            for (int y = 1; y <=10 ; y++) {  //innerloop
//                System.out.println(x +" x "+y+" = "+(x*y));
//
//            }
//            System.out.println();
//        }

        String str = "The quick brown fox";

        String reverse="";

        for(int x=str.length()-1 ;x>=0 ; x--  ){
            reverse+=""+str.charAt(x);
        }
        System.out.println("reverse = " + reverse);

        StringBuilder str2 = new StringBuilder(str);

        str2= str2.reverse();

        System.out.println("str2 = " + str2);

        //Write a Java program to create a new sorted array from
        //given array of random integers.(Bubble Sorting)
        //Sample Input:
        //arr = [7, 3, 1, 2, 5]
        //Expected Output :
        //result = [1, 2, 3, 5,7]

        int [] arr ={7,3,1,2,5};
       System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//
//        Arrays.sort(arr);
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        ////2nd approach
        int temp;
        for(int x=0 ; x<arr.length; x++){

            for(int y=(x+1) ; y<arr.length ; y++ ){
                if (arr[x] > arr[y] ) {
                    temp = arr[x];
                    arr[x]=arr[y];
                    arr[y]=temp;
                }
            }
        }
        System.out.println( Arrays.toString(arr));



    }

    public void asd(String a,String b){
        System.out.println("\"first\" = " + "first");
    }
    public static String asd(String  b){
        System.out.println("a = " + b);
        return "a";
    }




}
