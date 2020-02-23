package day55.AKBAR.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        List<String> lst=new ArrayList<>(Arrays.asList("muge","sumeyye","hasan","astrit","vlad","zehra"))  ;

        List<String> lst2= lst;
        List<String> lst3= new ArrayList<>(Arrays.asList("muge","sumeyye","hasan","astrit","vlad","zehra"));

        System.out.println(lst==lst2); //true
        System.out.println(lst.equals(lst2)); //true
        System.out.println(lst==lst3);  //false
        System.out.println(lst.equals(lst3)); //true

        System.out.println("lst = " + lst);
        System.out.println("lst2 = " + lst2);



        //Course java= new Course("Java",lst);
        Course java= new Course("Java",new ArrayList<>(Arrays.asList("muge","sumeyye","hasan","astrit","vlad","zehra")));
        System.out.println("java = " + java);


        java.studentNames.add("Gail");
        java.studentNames.add("Mohammed");
        java.studentNames.add("Ayjeren");
        java.studentNames.add("Ayse");
        java.studentNames.addAll(Arrays.asList("Serife","Israfil","Toyly"));


        System.out.println("java.studentNames = " + java.studentNames);

        System.out.println(lst);











    }

////        List<String> lst =
//////                new ArrayList<>(Arrays.asList("Muge", "Sumeyye","Hasan","Astrit","Vlad","Zehra") ) ;
//////
//////        Course java = new Course("Java",lst) ;
//
//        Course java = new Course("Java",
//                new ArrayList<>(Arrays.asList("Muge", "Sumeyye", "Hasan", "Astrit", "Vlad", "Zehra")));
//
//        //System.out.println("java before adding = \n" + java);
//        java.addStudent("Gail");
//        java.addStudent("Mohammed");
//
//        java.addManyStudents(Arrays.asList("Serife", "Israfil", "Toyly"));
//
//        //System.out.println("Course java = \n" + java);
//        System.out.println("java.studentNames = " + java.studentNames);
//
////        java.studentNames.add("Gail");
////        java.studentNames.add("Mohammed");
////        java.studentNames.add("Ayjeren");
////        java.studentNames.add("Ayse");
////        java.studentNames.addAll( Arrays.asList("Serife","Israfil","Toyly") );
//
//
//    }

}
