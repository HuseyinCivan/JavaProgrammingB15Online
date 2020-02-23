package day63.review;

import java.util.*;

public class GroupMemberCharSeq {
    //        List<String> names = new ArrayList<>();
    //        names.addAll(Arrays.asList("Alisa Zakirova","Ayse Golcu","Ahmet Baltaci","Daria Ozer",
    //                "Fatih Demir","Fatma Ulusal","Furkan Tan","Gulzina Pakzat","Huseyin Civan","Guvanch Kurbanov","Muge Orman",
    //                "Rabiyam Rustam","Semra Bahadir","Serife Kilic"));
    //
    //        Map<String,Integer> nameCharCountPair = new HashMap<>();
    //
    //        for (String eachMember : names) {
    //            nameCharCountPair.put(eachMember,eachMember.length());
    //        }
    //
    //        System.out.println("nameCharCountPair = " + nameCharCountPair);

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Alisa Zakirova","Ayse Golcu","Ahmet Baltaci","Daria Ozer",
                                "Fatih Demir","Fatma Ulusal","Furkan Tan","Gulzina Pakzat","Huseyin Civan","Guvanch Kurbanov","Muge Orman",
                               "Rabiyam Rustam","Semra Bahadir","Serife Kilic"));

        System.out.println("names = " + names);

        Map<String ,Integer> namesAndCharNum= new HashMap<>();

        for (String eachName : names) {
            namesAndCharNum.put(eachName,eachName.length());

        }

        System.out.println("namesAndCharNum = " + namesAndCharNum);

        for (String s : namesAndCharNum.keySet()) {
            System.out.println(s +" --> "+ namesAndCharNum.get(s));
        }



    }
}
