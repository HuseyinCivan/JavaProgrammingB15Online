package practice02_25_20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqOfChar {
    public static void main(String[] args) throws IOException {

        String str= "aaaaabbbbccddefffgg";

        Map<Character ,Integer> freq = new HashMap<>();

        for (int x = 0; x < str.length() ; x++) {
            Character currentChar= str.charAt(x);

            if(! freq.containsKey(currentChar)){
                freq.put(currentChar,1);
            }else{
                freq.replace(currentChar,freq.get(currentChar)+1);

            }
        }
        System.out.println("freq = " + freq);

        System.out.println("\n____________________________\n");

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\h_civ\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\EmployeeFile.txt"));

        System.out.println("allLines = " + allLines);

        Map<Integer,String > mapEmployee = new HashMap<>();

        for (String eachLine : allLines) {
                    Integer id= Integer.parseInt(eachLine.split(",")[0] );
                    String employee= eachLine.split(",")[1];
                    mapEmployee.put(id,employee);

        }
        System.out.println("mapEmployee = " + mapEmployee);

















    }
}
