package day64.review;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map< String , List<String>> groupMap = new HashMap<>();

        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge"));
        groupMap.put("Achievers", Arrays.asList("Maiia", "Anastasia", "Zaki", "Toyly", "Like"));
        groupMap.put("BugHunter", Arrays.asList("Ayse", "Rabiyam", "Gulzina"));
        groupMap.put("BugBusters", Arrays.asList("Rukhshona", "Fariza", "Seyma", "Sumeyyra", "Huvayda"));

        System.out.println("groupMap = " + groupMap);

        groupMap.forEach( (groupCode,GroupMembers)-> System.out.println("Group name is "+groupCode+" and the members are "+ GroupMembers   )  );

        System.out.println("groupMap.get(\"Achievers\").get(3) = " + groupMap.get("Achievers").get(3));

        System.out.println("groupMap.get(\"BugHunter\").contains(\"Gulzina\") = " + groupMap.get("BugHunter").contains("Gulzina"));

        groupMap.put("Justice League",new ArrayList<>(Arrays.asList("Superman","Batman","WonderWoman")));
        System.out.println("groupMap = " + groupMap);
        groupMap.get("Justice League").add("Flash");
        System.out.println(groupMap.get("Justice League"));

        //       System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));


//        Collection<List<String>> members = groupMap.values();
//        Iterator<List<String>> membersIter = members.iterator();
//        while (membersIter.hasNext()){
//            List<String> currentMembers = membersIter.next();
//            if(currentMembers.contains("Toyly")){
//                System.out.println(currentMembers);
//            }
//        }


    }
}
