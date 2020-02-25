package repl;

public class Repl_169 {
    public static void main(String[] args) {
        System.out.println(threeLocks(false,true,false));
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean isTrue = false;
        int counter = 0;
        boolean[] arr={a,b,c};
        for(int x=0;x<3;x++){
            if(arr[x]==true ){
                counter++;
            }
        }
        if(counter>1){
           isTrue=true;

        }

return isTrue;
        }//end threeLocks
    }
