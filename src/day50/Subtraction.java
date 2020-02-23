package day50;

public class Subtraction extends Question{

    public Subtraction(int num1,int num2) {
        super("Subtraction","-");

//        this.num1=num1;
//        this.num2=num2;

        // need to make sure num1 is always more than num2
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        this.num1=num1;
        this.num2=num2;

    }

    @Override
    public void calculate() {
    answer=num1-num2;
    //calculated is the instance field to keep track of the Question
        //is calculated or not
    calculated=true;

    }

    public String toString(){

        return calculated? super.toString()+" "+ num1+operator+num2+" = "+answer : super.toString()+" "+num1+operator+num2+" = ";

    }



}
