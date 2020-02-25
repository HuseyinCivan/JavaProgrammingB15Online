package day27;

import java.util.Arrays;

public class MultiDimensionalArray_Practice2 {
    public static void main(String[] args) {
        String[] developersTeam ={"Vladislav","Hasan","Tolkun","Abide"};
        String[] testerTeam={"Zhibekchach","Mohammed Sohrabi","Hasan","Nursultan"};
        String[]businessAnalystTeam={"Lisa","Ershad","Naila"};

        String [][] scrumTeam={developersTeam,testerTeam,businessAnalystTeam};


        // find the shortest string of text

        String minLengthName= scrumTeam[0][0];

        for( String[] eachTeam  : scrumTeam   ){
            for (String eachName : eachTeam) {
                if(eachName.length()<minLengthName.length()){
                    minLengthName=eachName;

                }

            }
        }
        System.out.println("minLengthName = " + minLengthName);


        System.out.println(Arrays.deepToString(scrumTeam) );


    }
}
