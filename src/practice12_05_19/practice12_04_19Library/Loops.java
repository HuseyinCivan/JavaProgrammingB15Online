package practice12_05_19.practice12_04_19Library;

public class Loops {
    public static void main(String[] args) {

        int x= 10;

        while(x>=5){
            System.out.println(x+"  is more than 5");
            x--;
        }
        System.out.println("____________________________________________________");
        for(x=10;x>=5;x--){
            System.out.println(x+" is more than 5");
        }
        System.out.println("____________________________________________________");
x=10;
        do{
    System.out.println(x+" is more than 5");
    x--;
}while (x>=5);

    }
}
