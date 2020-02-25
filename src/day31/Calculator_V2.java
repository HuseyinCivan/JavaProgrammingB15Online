package day31;

public class Calculator_V2 {
    public static void main(String[] args) {

//char operator='*'; // it can be + - * /
//int num1=15;
//int num2=3;

        calculate('-',10,30);
        calculate('+',20,10);
        calculate('*',40,3);
        calculate('/',40,4);
        calculate('A',40,4);


    }

    public static void calculate (char operator,int num1,int num2){
        switch (operator){
            case'+':
                System.out.println("addition result is "+(num1+num2));
                break;
            case'-':
                System.out.println("substraction result is "+(num1-num2));
                break;
            case'*':
                System.out.println("multiplication result is "+(num1*num2));
                break;
            case'/':
                System.out.println("division result is "+(num1/num2));
                break;
            default:
                System.out.println("invalid operator");

        }
    }
}
