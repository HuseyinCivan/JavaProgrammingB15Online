package day26;

public class ToCharArrayPractice {
    public static void main(String[] args) {

        // 2 additional String methods related to array
        //toCharArray(), another is split(bySomething);

        String survey = "Complete B15 Online 1 Month Survey";


        char[] surveyChars = survey.toCharArray();
//        for (char eachsEurveyChar : surveyChars) {
//            System.out.println(eachsEurveyChar);
//
//        }
// while loop :
        int x = 0;
//        while (x < surveyChars.length) {
//        System.out.println("each char is " + surveyChars[x]);
//
//        x++;
//    }
//for loop

//        for(x=0;x<surveyChars.length;x++) {
//            System.out.println("each char is " + surveyChars[x]);
//
//
//        }

        int y=0;
do{
    System.out.println("each char is " + surveyChars[y]);
y++;
}while(y<surveyChars.length);














    }
}
