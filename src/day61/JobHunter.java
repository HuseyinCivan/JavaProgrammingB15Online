package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {

        List<Job> jobs=new LinkedList<>();
        //store 5 your favorite Jobs
        //assign it to jobList variable with List<Job> reference

        jobs.add(new Job("GA",120000,"WellsFargo"));
        jobs.add(new Job("VA",110000,"Amazon"));
        jobs.add(new Job("NY",140000,"FaceBook"));
        jobs.add(new Job("CA",150000,"Apple"));
        jobs.add(new Job("WA",145000,"Microsoft"));



        System.out.println("BEFORE jobs = " + jobs);

        Collections.sort(jobs);

        System.out.println("AFTER jobs = " + jobs);

        //Collections.reverseOrder() will give you a object with reversed comparing logic
       // Collections.sort(jobs,Collections.reverseOrder());

        //System.out.println("AFTER 2 jobs = " + jobs);

        //Comparator.reverseOrder() will give you a object with reversed comparing logic
        Collections.sort(jobs, Comparator.reverseOrder());
        System.out.println("AFTER 3 jobs = " + jobs);















    }
}
