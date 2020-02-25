package day16;

import org.w3c.dom.ls.LSOutput;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {




    //get teh second java from teh sentence
    // assume you already know there is 4 java in this sentence
    //second java means--->the Java showed up after first Java

    //first find out where is the location of the first Java showed up

    //in order to second one , instead of seaching beginniong , search from right after the location you found first Java
    //then it will give you the index of second java

    //but how i start from different location when using indexof
    //because index of always start from beginning

    //index of has 2 version 1 expect 1 extwernal data
    //another expect 2 external data----->yourString.indexof()

    String name="I love Java I love Java Java Java";
        System.out.println("Java starting from 0 "+name.indexOf("Java"));
        System.out.println("Java starting from 7 "+name.indexOf("Java",7));
        System.out.println("Java starting from 8 "+name.indexOf("Java",8));
        System.out.println("Java starting from 9 "+name.indexOf("Java",9));
        System.out.println("Java starting from 19 "+name.indexOf("Java",19));
        System.out.println("Java starting from 20 "+name.indexOf("Java",20));
        System.out.println("Java starting from 25 "+name.indexOf("Java",25));

        //how do i start from the locatiom thet get past first java
        //basically starting point different that 0 so that it get past first JAva
        System.out.println("---------------------------------");
        int firstJavaLocation=name.indexOf("Java"); // location of first Java in this case 7
        int startingPointToSearchSecondJava=firstJavaLocation+1; // or you can start here + 4(java kelimesi bittikten sonra- if we dont knoe the length of the word +word.length()
        int secondJavaLocation=name.indexOf("Java",startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);
        int startingPointToSearchThirdJava=secondJavaLocation+1;
        int thirdJavaLocation=name.indexOf("Java",startingPointToSearchThirdJava+1);
        System.out.println("thirdJavaLocation = " + thirdJavaLocation);

        //i dont know how many word in thios sentence. i only know there are 3+ words
        //i just want to know what is the second word
        //the word in between first space and secondspace is second word
        //th word in between first space and second space is second word
        System.out.println("---------------------------------");
        int firstSpaceLocation=name.indexOf(" ");
        System.out.println("firstSpaceLocation = " + firstSpaceLocation);
        int secondSpaceLocation=name.indexOf(" ",firstSpaceLocation+1);
        System.out.println("secondSpaceLocation = " + secondSpaceLocation);
        System.out.println("second word in this sentence is "+name.substring(firstSpaceLocation+1,secondSpaceLocation));




    } }
