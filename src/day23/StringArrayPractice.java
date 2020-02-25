package day23;

public class StringArrayPractice {
    public static void main(String[] args) {

        String[] shows={ "Orville","Gifted","Game of Thrones","Flash","Arrow","Super girl"};

        int showsCount= shows.length;
        System.out.println("showsCount = " + showsCount);

        for(int x=0;x<showsCount;x++){   //    <=shows.length-1
            String currenShow= shows[x];
            System.out.println(currenShow+ " has character count : "+currenShow.length());
        }



    }
}
