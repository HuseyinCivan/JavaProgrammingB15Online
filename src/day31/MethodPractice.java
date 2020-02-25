package day31;

public class MethodPractice {

    // DO NOT CREATE A METHOD INSIDE ANOTHER METHOD
    public static void main(String[] args) {  // MEDHOD HEADER


        System.out.println("first method");
        hello7imes();   // JUST CALLING BY NAME IS THE EASIEST WAY IF WE ARE STILL IN SAME CLASS
        System.out.println("_______________");
        System.out.println("second method");
      MethodPractice.hello7imes();

        System.out.println("==================");

        MethodIntro.sayHello();




    }
public static void hello7imes(){   //i don't need anything to return.So used void
                                   //i don't call any object. So used static


    // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");

    System.out.println("----------------------");
    calculateMathProblem();

}
//int num1 = 5;
//double num2 = 3.0d;
//float num3 = 3.0f;
//double result1 = num1 + num2;
//double result2 = num1 - num2;
//double result3 = num1 * num2;
//double result4 = num1 / num2;
//float result5 = num1 / num3;
//System.out.println(result1);
//System.out.println(result2);
//System.out.println(result3);
//System.out.println(result4);
//System.out.println(result5);
//Create a method to take above action , call it calculateMathProblem()
    public static void calculateMathProblem(){

int num1 = 5;
double num2 = 3.0d;
float num3 = 3.0f;
double result1 = num1 + num2;
double result2 = num1 - num2;
double result3 = num1 * num2;
double result4 = num1 / num2;
float result5 = num1 / num3;
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);
System.out.println(result5);

    }

}
