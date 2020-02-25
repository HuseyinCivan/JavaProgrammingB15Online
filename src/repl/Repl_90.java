package repl;

import java.util.Scanner;

public class Repl_90 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();



        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

//The program should display the following information based on the user input:
//Split or No split
//Number of people entered: &&&&
//Service Quality:
//Total to pay:
//Total tip:
//Total per person:
//Tip per person:
        if (split.equals("Yes")) {

            String countOfPeople = "";
            for (int x = 1; x <= numberOfPeople; x++) {

                countOfPeople = countOfPeople + "&";
            }
            System.out.println("Number of people entered: " + countOfPeople);


            if (serviceQuality.equals("Excellent")) {
                System.out.println("Total to pay: " + checkAmount * 1.25);
                System.out.println("Total tip: " + checkAmount * 0.25);
                System.out.println("Total per person: " + checkAmount * 1.25 / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.25 / numberOfPeople);

            } else if (serviceQuality.equals("Great")) {
                System.out.println("Total to pay: " + checkAmount * 1.20);
                System.out.println("Total tip: " + checkAmount * 0.20);
                System.out.println("Total per person: " + checkAmount * 1.20 / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.20 / numberOfPeople);

            } else if (serviceQuality.equals("Good")) {
                System.out.println("Total to pay: " + checkAmount * 1.15);
                System.out.println("Total tip: " + checkAmount * 0.15);
                System.out.println("Total per person: " + checkAmount * 1.15 / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.15 / numberOfPeople);

            } else if (serviceQuality.equals("Fair ")) {
                System.out.println("Total to pay: " + checkAmount * 1.10);
                System.out.println("Total tip: " + checkAmount * 0.10);
                System.out.println("Total per person: " + checkAmount * 1.10 / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.10 / numberOfPeople);

            } else if (serviceQuality.equals("Poor ")) {
                System.out.println("Total to pay: " + checkAmount * 1.05);
                System.out.println("Total tip: " + checkAmount * 0.05);
                System.out.println("Total per person: " + checkAmount * 1.05 / numberOfPeople);
                System.out.println("Tip per person: " + checkAmount * 0.05 / numberOfPeople);
            }

        } else if (split.equals("No")) {
            String countOfPeople = "";
            for (int x = 1; x <= numberOfPeople; x++) {

                countOfPeople = countOfPeople + "&";
            }
            System.out.println("Number of people entered: " + countOfPeople);


            if (serviceQuality.equals("Excellent")) {
                System.out.println("Total to pay: " + checkAmount * 1.25);
                System.out.println("Total tip: " + checkAmount * 0.25);
                System.out.println("Total per person: " + checkAmount * 1.25);
                System.out.println("Tip per person: " + checkAmount * 0.25);

            } else if (serviceQuality.equals("Great")) {
                System.out.println("Total to pay: " + checkAmount * 1.20);
                System.out.println("Total tip: " + checkAmount * 0.20);
                System.out.println("Total per person: " + checkAmount * 1.20);
                System.out.println("Tip per person: " + checkAmount * 0.20);

            } else if (serviceQuality.equals("Good")) {
                System.out.println("Total to pay: " + checkAmount * 1.15);
                System.out.println("Total tip: " + checkAmount * 0.15);
                System.out.println("Total per person: " + checkAmount * 1.15);
                System.out.println("Tip per person: " + checkAmount * 0.15);

            } else if (serviceQuality.equals("Fair ")) {
                System.out.println("Total to pay: " + checkAmount * 1.10);
                System.out.println("Total tip: " + checkAmount * 0.10);
                System.out.println("Total per person: " + checkAmount * 1.10);
                System.out.println("Tip per person: " + checkAmount * 0.10);

            } else if (serviceQuality.equals("Poor ")) {
                System.out.println("Total to pay: " + checkAmount * 1.05);
                System.out.println("Total tip: " + checkAmount * 0.05);
                System.out.println("Total per person: " + checkAmount * 1.05);
                System.out.println("Tip per person: " + checkAmount * 0.05);


            }


        }
    }
}