package day60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {

        // calling a method that declare to throws checked exception

        readMyFile();
        Thread.sleep(3000);
        System.out.println("The End");


    }

    //FileNotFoundException extends IOException
    public static void readMyFile() {

        System.out.println("Reading the file in my computer ");
        try {
            //we are throwing a checked exception
            //so IT MUST BE HANDLED OR DECLARED , Here we chose to handle it with try catch
           // throw new FileNotFoundException("Kaboom !! File is not here !!! ");
          List<String > allLines = Files.readAllLines(Paths.get("src/day60/hero.txt"));
           System.out.println("allLines = " + allLines);
      // Files.readAllLines(Paths.get("src/hero.txt"));

        } catch (IOException e) {
            System.out.println("AHA !! Caught you in readMyFile !!!");
        }
    }


}

