package day50;


//	Create sub class Addition    //concrete class
//		it has one constructor to set
//			num1 and num2
//			it should also set questionType to "addition"
//								operator to  "+"
//		it should implement calculate method
//		toString method in below format
//			return num1 + operator +  num2  =  "" if not calculated yet
//			return num1 + operator +  num2  =  answer if already calculated


public class Addition extends Question{
    public Addition(int num1,int num2){

        //    int num1;
        //    int num2;
        //    String operator;
        //    int answer;
        //    boolean calculated;
        //    String questionType="Unknown";  //setting default value to unknown directly to avoid null


        super("addition question ","+");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate() {

        answer = num1 + num2;
        this.calculated=true;

    }
    public String toString(){

       return calculated? super.toString()+" "+ num1+operator+num2+" = "+answer : super.toString()+" "+num1+operator+num2+" = ";

    }
}
