package day62;

import day61.Job;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {

        //create a SortedSet of Job(from day 61) with TreeSet implementation

        SortedSet<Job> jobs = new TreeSet<Job>();

                jobs.add(new Job("GA",120000,"WellsFargo"));
                jobs.add(new Job("VA",110000,"Amazon"));
                jobs.add(new Job("NY",140000,"FaceBook"));
                jobs.add(new Job("CA",150000,"Apple"));
                jobs.add(new Job("WA",145000,"Microsoft"));

        Iterator<Job> iterator = jobs.iterator();

        for (Job each : jobs) {
            System.out.println("each = " + each);
        }
        
//        while(iterator.hasNext()){
//            System.out.println("iterator.next() = " + iterator.next());
//
//        }

        Boolean[] bool = new Boolean[2];
        bool[0]=Boolean.valueOf(Boolean.parseBoolean("true"));
        bool[1]=null;
        System.out.println(bool[0]+" "+bool[1]);

        boolean x =Boolean.valueOf("trUe");

        Boolean y = null;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        String a="fsd";
        System.out.println("a.isEmpty() = " + a.isEmpty());


        System.out.println("__________________________");
        System.out.println("__________________________");

        System.out.println("__________________________");



        String s1= new String("Summer");
        String s2= new String("Summer");

        String s3=s1;

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(s3) = " + s1.equals(s3));
        System.out.println("(s1==s2) = " + (s1==s2));
        System.out.println("(s1==s3) = " + (s1==s3));




    }
}
