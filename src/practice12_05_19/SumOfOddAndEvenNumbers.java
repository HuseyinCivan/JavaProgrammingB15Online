package practice12_05_19;

public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {

        int sumOfOdd=0;
        int sumOfEven=0;
        for(int x=0;x<=100;x++){

            if(x%2==1){
                sumOfOdd=sumOfOdd+x;
            }else if(x%2==0){
                sumOfEven=sumOfEven+x;
            }
        }
        System.out.println("sum of odd = " + sumOfOdd);
        System.out.println("sum of even = "+sumOfEven);

    }
}
