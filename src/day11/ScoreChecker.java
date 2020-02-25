package day11;

public class ScoreChecker {
    public static void main(String[] args) {

        int score=50;

        if(score<0 || score>100 ){
            System.out.println("INVALID SCORE!!");
        }else if(score==100){
            System.out.println("PERFECT SCORE");
        } else if (score>=70 && score<=100){
            System.out.println("YOU HAVE PASSED");
        } else if (score<20){
            System.out.println("COME TO MY OFFICE");
        }else if (score>=30 && score<=40){
            System.out.println("ATTEND ADDITIONAL CLASSES");
        }else if (score>40 && score<70){
            System.out.println("LITTLE BIT MORE STUDY WILL LET YOU PASS");
        } else{
            System.out.println("YOU HAVE FAILED!!");
        }







    }
}
