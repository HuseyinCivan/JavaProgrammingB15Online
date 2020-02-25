package day12;
import java.util.*;
public class repl_36 {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            int seniorCitizen , nonSeniorCitizen , age;
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
            seniorCitizen=scan.nextInt();
            nonSeniorCitizen=scan.nextInt();
            System.out.println("What is new citizen's age?");
            age=scan.nextInt();
            if(age>=65){
                System.out.println("Senior Citizen");
                seniorCitizen=seniorCitizen+1;

            }if(age<65){
                System.out.println("Non-Senior Citizen");
                nonSeniorCitizen=nonSeniorCitizen+1;
            }
            System.out.println("New seniorCitizens count "+seniorCitizen);
            System.out.println("New nonSeniorCitizens count "+nonSeniorCitizen);

        }
    }

