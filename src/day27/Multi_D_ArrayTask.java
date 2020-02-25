package day27;

import java.util.Arrays;

public class Multi_D_ArrayTask {
    public static void main(String[] args) {

        int[][] numbers ={ {12,11,10,19},{19,20,15}   };
        int max = numbers[0][0];  // assume that first element is the max

        for(int x=0;x<numbers.length;x++){
            for (int y=0;y<numbers[x].length;y++){
                if(numbers[x][y]>max){
                    max=numbers[x][y];
                }
            }
        }

        System.out.println("max number on the 2D_Array is = " + max);


        // solution 2

        int max2=numbers[0][0];
        for(int[] eachArray    : numbers    ){
            for(int eachNumber : eachArray){
                if(eachNumber>max2){
                    max2=eachNumber;

                }
            }
        }

        System.out.println("max2 = " + max2);

        System.out.println("_____________________________");
        int min= numbers[0][0];

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y <numbers[x].length ; y++) {
                if(numbers[x][y]<min){
                    min=numbers[x][y];
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("_____________________________________________________");

        String[] developersTeam ={"Vladislav","Hasan","Tolkun","Abide"};
        String[] testerTeam={"Zhibekchach","Mohammed Sohrabi","Hasan","Nursultan"};
        String[]businessAnalystTeam={"Lisa","Ershad","Naila"};

        String [][] scrumTeam={developersTeam,testerTeam,businessAnalystTeam};

        int maxLength= scrumTeam[0][0].length();

        for (int x = 0; x <scrumTeam.length ; x++) {

            for (int y = 0; y < scrumTeam[x].length; y++) {
                if(scrumTeam[x][y].length()>maxLength){
                    maxLength=scrumTeam[x][y].length();
                }

            }


        }
        System.out.println("maxLength = " + maxLength);
        for (int x = 0; x <scrumTeam.length ; x++) {

            for (int y = 0; y < scrumTeam[x].length; y++) {
                if(scrumTeam[x][y].length()==maxLength){
                    System.out.println(scrumTeam[x][y]);
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    scrumTeam[x][y]="Huseyin";
                }

            }

        }
        System.out.print(Arrays.deepToString(scrumTeam));
        System.out.println("_______________________");

    }
}
