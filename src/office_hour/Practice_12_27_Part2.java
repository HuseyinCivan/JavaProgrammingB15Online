package office_hour;
//1. write a method that can convert km to miles
//	 				Hint: 1 km = 0.612 miles
//	 	2. write a method that can convert gallons to litters
//	 			   Hint: 1 G = 3.75 L
//	 	3. write a method that can print out the array in Descending order
//	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
//	 	and prints out the calculation
//		if operator is not between [-, +, *, /, %] output should be Invalid Operator
//			Ex: calculate(10, 2, "*") ==> 20;
//				calculate(20, 2, "~") ==> invalid operator
//		5. write a method that can calculate grade
//					if score is 100 ~ 90 ==> A
//					if score is 89 ~ 80 ==> B
//					if score is 79 ~ 70 ==> C
//					if score is 69 ~ 60 ==> D
//					if score is 0 ~ 59 ==> F
//					otherwise ==> Invalid Score

import java.util.Arrays;

public class Practice_12_27_Part2 {
    public static void main(String[] args) {
       OddOrEVen(99);
        System.out.println(KmToMileConverter(100));
        System.out.println(gallonToLiterConverter(12.5));

    int[] nums={12,15,88,4,26,0,999};
       arrayWithDescendingOrder(nums);

       calculate(10,5,"++");
        calculate(10,5,"+");
        calculate(10,5,"*");
        calculate(10,5,"@");

    }
    public static void OddOrEVen (int num){
        if(num%2==0){
            System.out.println(num+" is even number");
            return;
        }
        System.out.println(num+" is odd number");
    }
public static double KmToMileConverter(double km){
        double mile=0.612 * km;

   // Hint: 1 km = 0.612 miles
   return mile;
}
//	 	2. write a method that can convert gallons to litters
//	 			   Hint: 1 G = 3.75 L
    public static double gallonToLiterConverter(double gallon){
        double liter = gallon*3.75;
        return liter;
    }
    //3. write a method that can print out the array in Descending order

    public static void arrayWithDescendingOrder(int[] numbers){
        Arrays.sort(numbers);
        //swap
        int temp;
        for(int x=0;x<numbers.length/2;x++){
           temp=numbers[x];
           numbers[x]=numbers[numbers.length-1-x];
           numbers[numbers.length-1-x]=temp;
        }
        System.out.println(Arrays.toString(numbers));

    }
    ////	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
    ////	 	and prints out the calculation
    ////		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    ////			Ex: calculate(10, 2, "*") ==> 20;
    ////				calculate(20, 2, "~") ==> invalid operator


    public static void calculate(int a , int b , String operators){

        boolean result=!operators.equals("-") && !operators.equals("+") && !operators.equals("*")
                && !operators.equals("/") && !operators.equals("%") ;

        if(result){
            System.out.println("Invalid Operator");
            return;
        }
        if(operators.equals("-")){
            System.out.println(a-b);
        }else if(operators.equals("+")){
            System.out.println(a+b);
        }else if(operators.equals("*")){
            System.out.println(a*b);
        }else if(operators.equals("/")){
            System.out.println(a/b);
        }else if(operators.equals("%")){
            System.out.println(a%b);
        }
//        else{
//            System.out.println("invalid operator");
//        }

    }










} //end here
