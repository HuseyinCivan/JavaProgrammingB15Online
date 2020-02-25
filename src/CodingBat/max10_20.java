package CodingBat;

public class max10_20 {
    public static void main(String[] args) {


    }

    public int max1020(int a, int b) {

        boolean aIn1020 = a >= 10 && b <= 20;
        boolean bIn1020 = b >= 10 && b <= 20;

        if (a > b && aIn1020) {
            return a;
        } else if (b > a && bIn1020) {
            return b;
        }
        return 0;
    }
}







