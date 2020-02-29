package day64.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetView_Practice {
    public static void main(String[] args) {
        Map<String,String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene","Female");
        employeeMap.put("Winfred","Male");
        employeeMap.put("Jereme","Male");
        employeeMap.put("Glad","Female");
        employeeMap.put("Desirae","Female");
        employeeMap.put("Kakalina","Female");
        employeeMap.put("Bertrando","Male");
        employeeMap.put("Ajay","Female");
        employeeMap.put("Brigitte","Female");
        employeeMap.put("Derk","Male");
        employeeMap.put("Orlando","Male");
        employeeMap.put("Selle","Female");
        employeeMap.put("Marika","Female");
        employeeMap.put("Griffy","Male");
        employeeMap.put("Shanon","Female");
        employeeMap.put("Clerkclaude","Male");
        employeeMap.put("Rickard","Male");
        employeeMap.put("Job","Male");
        employeeMap.put("Aida","Female");
        employeeMap.put("Alonzo","Male");

        System.out.println("employeeMap = " + employeeMap);

        // Task 1 : get the name of all the Female from the map

        Set<Map.Entry<String ,String >>entrySetEmployee=employeeMap.entrySet();

        for (Map.Entry<String, String> each : entrySetEmployee) {
            if(each.getValue().equals("Female")){
                System.out.println(each.getKey());
            }
        }

        for (Map.Entry<String, String> eachEmployee : entrySetEmployee) {
            if(eachEmployee.getValue().equals("Female")){
                eachEmployee.setValue("Queen");
            }else{
                eachEmployee.setValue("King");
            }

        }

        employeeMap.forEach((name,gender)-> System.out.println("Employee  "+name+" is a "+gender));















    }
}
