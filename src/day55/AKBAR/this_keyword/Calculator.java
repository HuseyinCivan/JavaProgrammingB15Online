package day55.AKBAR.this_keyword;

public class Calculator {

    private int result;

    // addNum is a method to add number to current result
    // and return same Calculator object
    // this will allow method chaining
    // we can keep calling the method with same object
    // obj.add(100).add(50).add(200)
    // only one object . multiple method calls with chaining
    // this is called BUILDER PATTERN in Java
    public Calculator addNum(int num) {

        this.result += num;
        // below code will create new object different than the current object
//        Calculator c = new Calculator();
//        return c;
        // in order to just return current object after adding number
        // we can use this -->> THE CURRENT OBJECT WE ARE WORKING ON !
        // it will return the same object you used to call this method
        // it will allow method chaining using same object
        return this;
    }

    public Calculator minus(int num) {

        this.result -= num;

        return this;
    }
    public Calculator multiply(int num){
        this.result*=num;

        return this;
    }

    public Calculator division(int num){
        this.result/=num;
        return this;
    }



    public void displayFinalResult(){
        System.out.println("final result = "+result);
    }


}
