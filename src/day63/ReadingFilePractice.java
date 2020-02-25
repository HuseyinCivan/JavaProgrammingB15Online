package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String> allData= Files.readAllLines(Paths.get("C:\\Users\\h_civ\\IdeaProjects\\JavaProgrammingB15Online\\src\\day63\\EmployeeFile.txt"));

//        for (String eachLine : allData) {
//            System.out.println("eachLine = " + eachLine);
//        }

  //      allData.forEach(each-> System.out.println("each line = " + each));

        //1,Lilian   --- 1 lilian

        Map<Integer, String> idNamePair =new HashMap<>();
        for (String eachLine : allData) {
            int id = Integer.parseInt(eachLine.split(",")[0]);
            String name= eachLine.split(",")[1];
            idNamePair.put(id,name);

        }

        System.out.println("idNamePair = " + idNamePair);
















    }
}
