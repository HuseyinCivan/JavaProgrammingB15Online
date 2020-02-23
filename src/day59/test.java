package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        String name= "Huseyin";

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter an index number to get the character of "+name);
        boolean check= false;

        do {
            try {
                int indexNumber = scan.nextInt();
                System.out.println("The character at " + indexNumber + " is " + name.charAt(indexNumber));
                check=true;

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Your input is out of bonds ");
                System.out.println("Please enter a number between 0 and " + (name.length() - 1) + " to get a valid character !!!");
            } catch (InputMismatchException e) {
                System.out.println("Your input is not a valid number ");
                System.out.println("Please enter a valid number between 0 and " + (name.length() - 1) + " to get a valid character !!!");
              //  scan.nextLine();
            }
        }
            while (check==false);

    }
}
