package practice12_05_19;

public class FindDogInASentence {
    public static void main(String[] args) {

        String msg= "I like Dogs, Dogs are cute ,Dogs are friendly";
        String test="";
        int lastIndex=msg.length()-1;
        int count=0;
        for(int x=0;x<=lastIndex-2;x++){
            test=msg.substring(x,x+3);
            System.out.println("test = " + test);
            if ( test.contains("Dog")  ){
                //System.out.println(msg.substring(x,x+3));
                count=count+1;

            }
            System.out.println("count = " + count);

        }













    }
}
