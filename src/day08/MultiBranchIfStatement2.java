package day08;

public class MultiBranchIfStatement2 {
    public static void main(String[] args) {

        //pseudo   sudo code
        /*
        *given your currentSpeed , speedLimit
        *
        * check whether current speed is
        *
        *    more than 90 --->jail
        *    more than 80 and less than 90 ----> reckless driving
        *         *    more than 70 and less than 80------>point taken
         *    more than 60 and less than 70------->warning
         ///if not keep driving
         */



        int currenSpeed=91;
        int speedLimit=60;

        if(currenSpeed>90){
            System.out.println("GO TO THE JAIL");
        }else if(currenSpeed>80){
            System.out.println("RECKLESS DRIVER");
        }else if(currenSpeed>70){
            System.out.println("POINT TAKEN");
        }else if(currenSpeed>60){
            System.out.println("WARNING");
        }else{
            System.out.println("KEEP DRIVING");
        }















    }
}
