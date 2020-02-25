package day19;

public class FoorLoopStairCase {
    public static void main(String[] args) {

        String star = "* ";
        System.out.println(star);

        star=star+"* ";
        System.out.println(star);

        star=star+"* ";
        System.out.println(star);star=star+"* ";

        star=star+"* ";
        System.out.println(star);star=star+"* ";

        star=star+"* ";
        System.out.println(star);star=star+"* ";

        for(int i=1;i<=30;i++){

           // star=star+"* ";
            star+="* ";
            System.out.println(star);

        }

    }
}
