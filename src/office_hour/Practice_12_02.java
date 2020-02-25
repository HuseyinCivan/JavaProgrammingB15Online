package office_hour;

public class Practice_12_02 {
    public static void main(String[] args) {

        String item="Echo Show (5th gen) Charcoal";
        //get whatever inside the parenthesis

        int indexofP1=item.indexOf("(");
        int indexofP2=item.indexOf(")");
        System.out.println(item.substring(indexofP1+1,indexofP2));













    }
}
