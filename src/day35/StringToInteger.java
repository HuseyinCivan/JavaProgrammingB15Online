package day35;

public class StringToInteger {
    public static void main(String[] args) {
        // i have an employter number = FB-457
        // give me the employee number and store it into a number


        String strnum="100";
        int num = Integer.parseInt(strnum);
        System.out.println("num = " + num);

        String empId="FB-457";

        //Integer class is class coming from java.lang package
        //it is primarily used for wrapping up primitive value and treat it as an object
        //what we will focus here is though
        //many usefuk  static methods of Integer class
        //it will turn a String that has only numbers and return int result
        //if we have any non numerical character ---> it will throw NumberFormatException

       // int id=Integer.parseInt(empId.split("-")[1]);
        String[] empIdSplit=empId.split("-");
        int id=Integer.parseInt(empIdSplit[1]);

        System.out.println("id = " + id);

        // i hava a string called TwoNumbers
       // String twoNumbers="100,600";

        String strNum1="100";
        String strNum2="600";

        //in order to perform aritmetic operation
        // we must have numbers stored in int
        //so first we need to turn string into int
        //jdk already provide such methods
        //and it comes from Integer class java.lang package
        //Integer.parseInt("yourNumberInStrin");

        int num1=Integer.parseInt(strNum1);
        int num2=Integer.parseInt(strNum2);

        System.out.println("sum of num1+num2 "+(num1+num2));



        // i want you to add them and give the result






    }
}
//// Saturday class review
//Create a class called OverloadingPractice
//create 4 static void overloaded version of add method
//	1, add
//		has 1 int parameter and add 100 to that number
//		and print out the result
//	2, add
//		has 2 int parameters and add them to get sum
//		and print out the result
//	3, add
//		has 3 int parameters and add them to get sum
//		and print out the result
//	4, add
//		has 2 long parameters and add them to get sum
//		and print out the result
//Day 35 // Saturday class review Note
//Method practice with void and return type
//return keyword :
//	used to return a value from a method with return type
//	also terminate the method execution (any method)
//Using the methods already created in different classes
//	in order to use a class outside of your current packAge
//	import the class first
//		import packageName.className;
//	a special case for above statement is :
//		you dont have to import classes from java.lang package
//		for example String , System , Math
//			All the Wrapper classses we are about to learn
//	in order to use a static method of other classes
//		ClassName.methodName(.....)
//	in order to use a static method in current class
//		methodName(....) ;
//		OPTIONALLY
//		ClassName.methodName(.....)
//	Method Overloading :
//		methods with same name and different parameter list
//		IN SAME CLASS!!!!!!!!
//		Different parameter list can be :
//			different paremeters count
//			different paremeters type
//			or both
//	Method Signature : method name + paremeters list
//	method overloading only care about Method Signature
//	It does not care about access modifier, return type , static or not
//	fly(100);
//	fly(100L); -->> This method call expecting a fly method
//					that accept long paramter
//	class Plane{
//		public static void fly(){
//			// some code here
//		}
//		public static void fly(int mile){
//			// some code here
//		}
//		// CAN NOT HAVE 2 METHODS WITH SAME METHOD SIGNATURE
//		// THIS DOES NOT COMPILE
//		public static long fly(int mileX){
//			// some code here
//		}
//	}
//	class Car{
//		public static void fly(int mile){
//			// some code here
//		}
//	}