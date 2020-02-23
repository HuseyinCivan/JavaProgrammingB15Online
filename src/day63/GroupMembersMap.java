package day63;

import java.util.*;

public class GroupMembersMap {
    public static void main(String[] args) {

        //Alisa Zakirova

        //Ayse Golcu

        //Ahmet Baltaci

        //Daria Ozer

        //Fatih Demir

        //Fatma Ulusal

        //Furkan Tan

        //Gulzina Pakzat

        //Huseyin Civan

        //Guvanch Kurbanov

        //Muge Orman

        //Rabiyam Rustam

        //Semra Bahadir

        //Serife Kilic



        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Alisa Zakirova","Ayse Golcu","Ahmet Baltaci","Daria Ozer",
                "Fatih Demir","Fatma Ulusal","Furkan Tan","Gulzina Pakzat","Huseyin Civan","Guvanch Kurbanov","Muge Orman",
                "Rabiyam Rustam","Semra Bahadir","Serife Kilic"));

        Map<String,Integer> nameCharCountPair = new HashMap<>();

        for (String eachMember : names) {
            nameCharCountPair.put(eachMember,eachMember.length());
        }

        System.out.println("nameCharCountPair = " + nameCharCountPair);









    }
}
