package day26;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ToCharArrayPracticeWithArraysClassMethod {
    public static void main(String[] args) {

        // 2 additional String methods related to array
        //toCharArray(), another is split(bySomething);

        String survey = "Complete B15 Online 1 Month Survey";


        char[] surveyChars = survey.toCharArray();
        System.out.print("BEFORE surveyChars "+ Arrays.toString(surveyChars));
        System.out.println();

        Arrays.sort(surveyChars);
        System.out.print("AFTER surveyChars "+ Arrays.toString(surveyChars));





    }
}
