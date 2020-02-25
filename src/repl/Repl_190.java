package repl;
import java.util.Arrays;
public class Repl_190 {

        public static int[] mergR(int[] a,int[] b) {
                int[] merged= new int[a.length + b.length];
                for(int x=0; x< a.length; x++){
                    merged[x]=a[x];
                }
                for(int x=0; x<b.length;x++){
                    merged[x+a.length]=b[x];
                }

                return merged;

            }//end mergR

            public static void main(String[] args)
            {
                int[] a={1, 2, 3, 4};
                int[] b={5, 6, 7, 8};
                int[] mergedNum= mergR(a,b);
                System.out.println(Arrays.toString(mergedNum));

            }
        }
