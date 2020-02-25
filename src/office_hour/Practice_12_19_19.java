package office_hour;

import java.util.Arrays;

public class Practice_12_19_19 {
    public static void main(String[] args) {
        int a = 'A';
        int[] arr = {10, (byte) 9, (short) 8, 'a'}; // data MUST match with the data type	of the array
        System.out.println(Arrays.toString(arr));

        long l1 = 100;  // implicit: by default 100 is an integer, and we assign it to long data type
        int num1 = (int) l1;  // explicit

        System.out.println(arr[arr.length - 1]);  // data at last index: 97

        int[] arr2 = {0, 0, 0};
        for (int each : arr2) {
            System.out.println(each); // 0  0  0
        }

        System.out.println("================================");
        for (int i = 0; i < 4; i++) {

            System.out.println(i);

            if (i == 2)
                continue;

            System.out.println(i + " is printed");

        }
        System.out.println("================================");

        for (int i = 0; i < 4; i++) {

            System.out.println(i); //0  1  2

            if (i == 2) {
                break;  // exits the loop IMMEDIETLY
            }

            //    System.out.println(i); //0 1

        }


        System.out.println("================================");



//1. write a program that can check if a string is build out of the same letters as another string
//		Ex: input:
//				str1 = "abc";
//				str2 = "cba";
//			output:
//				true

       String str1 = "abc";
        String str2 = "cba";   //expected result is true
        //split() , toCharArray() ,

        char[] ar1=str1.toCharArray();  // [a,b,c]
        Arrays.sort(ar1);  // [a,b,c]

        char[] ar2=str2.toCharArray();
        Arrays.sort(ar2);  // [b,b,c]

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        System.out.println(Arrays.equals(ar1,ar2));

        str1=Arrays.toString(ar1);
        str2=Arrays.toString(ar2);

        System.out.println(str1.equals(str2));


//2. Write a program that will remove all the dupplicates from a string
//				Do it withg Arrays only

        String s1="aaabbaaccbbdd";  //expected result abcd
        String s2="";  // we store non dublicated char in it

        for(int x=0;x<s1.length();x++){
            String eachChar=""+s1.charAt(x);
            if(!s2.contains(eachChar)){
                s2+=eachChar;  // we only concat the character if that character is not exits in s2
            }
      }
        String fiveMinutes="aaabbbdddffhgkgkkh";
        String[] eachChar=fiveMinutes.split("");
         String result="";  // to store all non dublicated String obj of the array
        for (String each:eachChar ){
            if(!result.contains(each)){
                result+=each;
            }
        }
        System.out.println(result);
        System.out.println("___________________________________");
//	3. given the array of names:
//			String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//	   write a program that can remove all the names named Ahmed from the array
//	   Ex:
//	   		names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
//	   		System.out.println( Arrays.toString(names) );
//	   		output:
//	   			[John, Eric, Hassan]

//===========================================================================================================
//NOTES

//12/19/2019
//Java Practice: Arrays
//               Loops
//Array: a vraible that can have multiple data elemnts
//        data-type[]  vairableName = {data1, data2, ...}  // data MUST match with the data type
//                        // index:      0      1
//                vairableName[0] ==> data1
//                vairableName[1] ==> data2
//for each loop: is used to access each data in the collections of data (array)
//            it's a loop that's already been iterated
//            numbers of execution of the loop depends on the numbers of data elemnbts
//            for(data-type  each : ArrayName  ){
//            }
//            varoable "each" represents each elemnts of the array
//            EX:
//                int[] arr = {0,0,0} ;
//                for(int each: arr){
//                        sout(each);  // gets executed 3 times, lenght of the array is 3
//                }
//        when do we need for each loop:
//                we dont need use index numbers
//continue statement: used to skip the current iteration of the loop. jumps to the next iteration.
//break statement: exiting the loop IMMEDIETLY

    }
}
