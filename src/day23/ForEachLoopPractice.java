package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        // create a long array of 5 items called salaries
        // put your salaries amounts that ok for your offer

        //use for each loop to iterate over them
        //and print them out

        //optionally
        //print only the salary more tahn 100000

        long[] salaries={100000,200000,150000,115000,60000 };

//       for(int x=0 ; x<=salaries.length-1;x++){
//           System.out.println(salaries[x]);
//
//       }
//        System.out.println("________________________________________________________");
//        for(int x=0 ; x<=salaries.length-1;x++){
//            long eachSallary= salaries[x];
//
//            if(eachSallary>100000){
//                System.out.println(eachSallary);
//            }

        //}
        System.out.println("________________________________________________________");

        for(long eachSalary   : salaries ){
            System.out.println(" eachSalary =  " + eachSalary);
        }

for (long salary : salaries) {

//    if (salary>100000){
//        System.out.println("salary = " + salary);
//    }
// how can i skip sallaries less than or equal to 100k

    if (salary <= 100000){
        continue;
    }
    System.out.println("salary over 100k = " + salary);

}

    }
}
