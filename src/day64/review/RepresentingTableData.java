package day64.review;

import java.util.*;

public class RepresentingTableData {
    public static void main(String[] args) {

    Map<String,String> row1= new LinkedHashMap<>();
        row1.put("first_name","Regan");
        row1.put("email","rboichat0@1688.com");
        row1.put("gender","Female");

        Map<String,String> row2= new HashMap<>();
        row2.put("first_name","Carleen");
        row2.put("email","cmorillas1@blog.com");
        row2.put("gender","Female");

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        List<Map<String,String>> rowMapList = new ArrayList<>();
        rowMapList.add(row1);
        rowMapList.add(row2);
        System.out.println("rowMapList = " + rowMapList);

        System.out.println(rowMapList.get(1).get("email"));
        rowMapList.get(0).replace("first_name","Hulk");
        rowMapList.get(1).replace("first_name","Jane");

        System.out.println("rowMapList = " + rowMapList);



    }
}
