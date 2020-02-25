package practice12_17_19;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

    String sentence= "then write a logic to print out in below format"    ;
    String[] arrSentence=sentence.split(" ");

        System.out.println("arrSentence is "+Arrays.toString(arrSentence));


        for( int x=arrSentence.length-1;x>=0;x--     ){

            System.out.print(arrSentence[x]+" ");
        }

        System.out.println("\n____________________");

      String[] reverseArrSentence = new String[arrSentence.length];
      for(int x=0;x<=reverseArrSentence.length-1;x++){
          reverseArrSentence[x]=arrSentence[x];
      }

     System.out.println(Arrays.toString(reverseArrSentence));
        System.out.println("______________________");
        System.out.println("______________________");


        String temp ="";


for(int x=0;x<reverseArrSentence.length/2;x++){
//[then, write, a, logic, to, print, out, in, below, format]
    temp=reverseArrSentence[x];
    reverseArrSentence[x]=reverseArrSentence[reverseArrSentence.length-1-x];
    reverseArrSentence[reverseArrSentence.length-1-x]=temp;

}
System.out.println(Arrays.toString(reverseArrSentence));
        System.out.println("=========================");

for(int x=0; x<=reverseArrSentence.length-1;x++){

    for(int y=0;y<=reverseArrSentence[x].length()-1;y++){
        System.out.print(reverseArrSentence[x].charAt(y)+"  ");
    }
}
        System.out.println();
        System.out.println("arrSentence is "+Arrays.toString(arrSentence));
    }
}
