package day10;

import java.util.Scanner;

public class SeasonActionScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("hey what is the season !!? ");
        String season = scan.next();
        switch (season) {

            case "spring":
                System.out.println("hike! easter! nawruz blossom");
                break;
            case "summer":
                System.out.println("swim,vacation,bbq,holiday");
                break;
            case "fall":
                System.out.println("black friday , hiking , harvest ,haloween , shopping");
                break;
            case "winter":
                System.out.println("snowboarding, ski ,christmas ,new year");
                break;

            default:
                System.out.println("unknown season !!");


        }
    }
}
