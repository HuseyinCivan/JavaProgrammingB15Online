package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        //getting the part of the String out of another String
        ////          0123456789012345
        String movie="Lord Of The Ring";

        // i want to get the word <Of> from this movie

        String wordOf=movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);

        String wordThe=movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);


        //get from the second word till last word
        ///   /          0123456789012345
        // String movie="Lord Of The Ring";

        int startingPoint=movie.indexOf(" ")+1;
        int endingPoint=movie.length();

        System.out.println(movie.substring(startingPoint,endingPoint));

        String seconfWordTillLast=movie.substring(5,16);
        System.out.println("seconfWordTillLast = " + seconfWordTillLast);

        String wordLordOf=movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

        //
        //
        // if you provide only one paramether to substring method
        //it will just start from that location and get till the end
        String secondToLast=movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);


        ///   /          0123456789012345
        // String movie="Lord Of The Ring";
        //with this in mind:
        // reverse lord of the ring ------> Ring Of The Lord

        String ring=movie.substring(12,16);
        String of=movie.substring(5,7);
        String the=movie.substring(8,11);
        String lord=movie.substring(0,4);

        System.out.println(ring+" "+of+" "+the+" "+lord);























    }
}
