package day21;

public class SearchingSomethingInString3 {
    public static void main(String[] args) {
        String name = "Amelia Israfil Hajitev mehmet Hajitev Amelia Behlia Ashr";
int count=0;
        // find location of lia
        for (int x = 0; x <= name.length() - 3; x++) {
            String threeWord = name.substring(x, x + 3);

            if (threeWord.equals("lia")) {
                System.out.println("index of <lia> is " + x);
                count++;
            }


        }
        System.out.println("number of <lia> in sentence is "+count);
    }
}
