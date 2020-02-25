package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

        int[] scores=new int[4];

        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

//        System.out.println(  scores[0]     );
//        System.out.println(  scores[1]     );
//        System.out.println(  scores[2]     );
//        System.out.println(  scores[3]     );

        // how do we get the size of any array object
        // array object has a property called length

     int itemCount=scores.length;  // length den sonra parantez olmaz ARRAY OBJELERINDE !!

        // how do we get the char count of a String
        System.out.println("____________________________________________________________");
      //  String name="Jon Snow";
        //int itemCount=name.length();



        for (int x = 0; x < itemCount ; x++) {
            System.out.println(scores[x]);

        }

// reversing
        System.out.println("______________________________________");

        for(int x=scores.length-1;x>=0;x--){
            System.out.println(scores  [x]);
        }








    }
}
