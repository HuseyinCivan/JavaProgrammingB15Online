package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

//        List<String > lst =
//                new ArrayList<>(Arrays.asList("Muge","Sumeyye","Hasan","Astrit","Vlad","Zehra"));

        //Course java = new Course("Java",lst);
        Course java = new Course("Java", new ArrayList<>(Arrays.asList("Muge","Sumeyye","Hasan","Astrit","Vlad","Zehra")));

        System.out.println("java = " + java);

//
//        java.studentNames.add("Gail");
//        java.studentNames.add("Mohammed");
       java.addStudent("Gail");
       java.addStudent("Mohammed");

        java.studentNames.add("Ayjeren");
        java.studentNames.add("Ayse");

        java.addManyStudent(Arrays.asList("Metin","Ebrar","sdasdsds"));



        java.studentNames.addAll(Arrays.asList("Seda","Huseyin"));

        System.out.println("java studentNames  = " + java.studentNames);
        System.out.println("my original list  = " + java);





    }

}
