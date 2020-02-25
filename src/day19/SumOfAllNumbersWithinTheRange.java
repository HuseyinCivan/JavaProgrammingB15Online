package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {


       //get the sum of numbers from 1-10

        //1+2+3+4+5+6+7+8+9+10

        // when we loop from 1 to 10 ,
        int sum=0; // nothing has been yet so 0

        // sum= sum + 1  //1
        // sum= sum + 2  //3
        // sum= sum + 3  //6
        // sum= sum + 4  //10
        // sum= sum + 5  //15
        // sum= sum + 6  //21
        // sum= sum + 7  //28
        // sum= sum + 8  //36
        // sum= sum + 9  //45
        // sum= sum + 10  //55

        //-------->> sum = sum + i

        for (int x = 1; x <=100 ; x++) {
            //System.out.println(i);
            sum=sum+x;
            //System.out.println(sum);
        }

        System.out.println(sum);
// HOMEWORK
        // create a program to ask users two number and add numbers within those range













    }
}
