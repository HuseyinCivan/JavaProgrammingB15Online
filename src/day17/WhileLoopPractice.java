package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {

        // count 1 to 5 then count 5to 1
        int counter=1;

        while (counter<=5){
            System.out.print(counter+" ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter = " + counter);

        // from 5 to 1
        System.out.println("--------------------------------------");
        while(counter>1){
            --counter;
            System.out.print(counter+" ");
        }





    }
}
