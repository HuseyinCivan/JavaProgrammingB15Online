package day50;

public class Division extends Question {
    public Division(int num1,int num2) {
        super("Division question", "/");
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
// if num2 is 0 , instead of throwing error, lets just make answer 0
        if(num2==0){
            answer=0;
        }else{
            answer=num1/num2;
        }
     calculated=true;
    }
    public String toString(){

        return calculated? super.toString()+" "+ num1+operator+num2+" = "+answer : super.toString()+" "+num1+operator+num2+" = ";

    }
}
