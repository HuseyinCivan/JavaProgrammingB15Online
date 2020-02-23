package day55.AKBAR.this_keyword;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
//        c1.addNum(100);
        c1.addNum(100)
                .addNum(200)
                .addNum(100)
                .minus(50)
                .multiply(5)
                .division(3)
                .displayFinalResult();



        ;
//        c1.result = - 10000 ;
//        System.out.println(c1.result);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);


    }

}