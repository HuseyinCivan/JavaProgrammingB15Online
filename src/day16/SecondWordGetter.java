package day16;

public class SecondWordGetter {
    public static void main(String[] args) {

     // given a sentence with 3 words
     // get the second word

     // step :
     // second word is between forst sapce and the last space
        //getting location of space remind me of indezOf
                //getting string inside another string by beginning and ending index
        //remind me of substring

//     String sentence= "I love JAVA";
//     String secondWord;

        String sentence= "You Understand JAVA";
        String secondWord;


     int firstSpaceIndex= sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);
int lastSpaceIndex=sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(2,6));
        secondWord=sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);

        //first word

        String firstWord=sentence.substring(0,firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);

        String lastWord=sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);















    }
}
