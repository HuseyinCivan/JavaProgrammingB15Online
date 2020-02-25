package day20;

public class SumOffOdd {
    public static void main(String[] args) {

        // give me the sum of odd numbers from 10 to 100

//        int sum=10;
//
//        for (int i = 11; i <100 ; i+=2) {
//            sum=sum+i;
//            System.out.println(sum);
//            }
//
//
        int sum=0;

        for( int x=10;   x<=100;  x++   ){

            if(x%2==1){
                //System.out.println(x);
                sum=sum+x;   // sum+=x;
            }


        }

        System.out.println("sum = "+sum);

    }
}

