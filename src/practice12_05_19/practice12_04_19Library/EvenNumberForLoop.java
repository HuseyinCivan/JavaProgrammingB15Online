package practice12_05_19.practice12_04_19Library;

public class EvenNumberForLoop {
    public static void main(String[] args) {
        //skip counting by 2 0-100

        for(int x=0; x<100 ; x+=2){
            System.out.println(x);
        }

        for(int x=0;x<100; x+=3){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("__________________________________________");

        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(i+" is even number");
            }else if(i%2!=0){
                System.out.println(i+" is odd number ");
            }

        }


    }
}
