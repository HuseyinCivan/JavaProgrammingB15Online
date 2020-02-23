package day63.review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {

        List< String > fromFile = Files.readAllLines(Paths.get("C:\\Users\\h_civ\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\map.txt"));
        System.out.println("fromFile = " + fromFile);

        String str= fromFile.toString();

        Map<String ,Integer> maps =CustomMethodForFrequency.freqWordMap(str);
        for (String s : maps.keySet()) {
            System.out.println(s+" --> "+maps.get(s));
        }


    }
}
