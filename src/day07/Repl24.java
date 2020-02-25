package day07;
import java.util.Scanner;
public class Repl24 {

    public static void main(String[] args) {


    String firstName, lastName, fullName, email, street, state, city, address, contacts;
    int age,zipCode;
    double height,weight;
    boolean isMarried;
    long workPhoneNumber, personalPhoneNumber;

    Scanner scan=new Scanner(System.in);

    System.out.println("Welcome to the patient portal!");
    System.out.println("Please enter your personal information");

    System.out.println("Enter your first name");
    firstName=scan.next();

    System.out.println("Enter your last name");
    lastName=scan.next();

    System.out.println("Enter your email");
    email=scan.next();

    System.out.println("Enter your street");
        scan.nextLine();
    street= scan.nextLine();


    System.out.println("Enter your city");
    city =scan.next();

    System.out.println("Enter your state");
    state =scan.next();

    System.out.println("Enter your zip code");
    zipCode=scan.nextInt();

    System.out.println("Enter your work phone number");
    workPhoneNumber=scan.nextLong();

    System.out.println("Enter your personal phone number");
    personalPhoneNumber=scan.nextLong();

    System.out.println("Enter your age");
    age=scan.nextInt();

    System.out.println("Enter your height");
    height=scan.nextDouble();

    System.out.println("Enter your weight");
    weight=scan.nextInt();

    System.out.println("Are you married?");
    isMarried=scan.nextBoolean();

    contacts="work phone number - "+workPhoneNumber+",personal phone number - "+personalPhoneNumber+
            ", email: "+email;

    fullName=firstName+", "+lastName;

    address=street+", "+city+", "+state+" ,"+zipCode;

    System.out.println("Patient personal information");
    System.out.println("Full name: "+fullName);
    System.out.println("Address: "+address);
    System.out.println("Contacts: "+contacts);
    System.out.println("Age: "+age);
    System.out.println("Height: "+height);
    System.out.println("Weight: "+weight+" pounds");
    System.out.println("Married?: "+isMarried);
//Patient personal information
//Full name: May, James
//Address: 7925 Jones Branch Dr, McLean, VA 22102
//Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
//Age: 35
//Height: 5.1
//Weight: 173.2 pounds
//Married?: true
}
}
