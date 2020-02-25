package repl;

public class Repl_123 {
    public static void main(String[] args) {


        // your code
        // ----------------------------
        int sum=0;
        for(int x=1;x<=3;x++){
            sum++;
            System.out.println("year "+x+" growth 1 cm");
            System.out.println("tree size: "+sum+" cm");
        }
        for(int x=4;x<=10;x++){
            System.out.println("year "+x+" growth 2 cm");
            sum+=2;
            System.out.println("tree size: "+sum+" cm");

        }
    }
}

