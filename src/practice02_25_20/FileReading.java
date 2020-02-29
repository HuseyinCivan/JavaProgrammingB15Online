package practice02_25_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {


        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\h_civ\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\map.txt"));
        System.out.println("allLines = " + allLines);

        for(String eachLines : allLines){
            System.out.println("eachLines = " + eachLines);
        }














    }
}
