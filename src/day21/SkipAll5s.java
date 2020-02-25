package day21;

public class SkipAll5s {
    public static void main(String[] args) {

    // count 1 to 100
    //skip all the numbers div by 5;

//        for (int x = 1; x <=100 ; x++) {
//
//            if(x%5==0){
//                System.out.println(x+" Skipping 5 ");
//                continue;
//            }
//            System.out.println(x);
//        }

        for (int x = 1; x <=100 ; x++) {
            if(x%5!=0){
                System.out.println(x);
            }else{
                System.out.println("skipping "+x);
            }

        }










    }
}
