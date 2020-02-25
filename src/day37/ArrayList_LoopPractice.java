package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice {
    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<>();

        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        // find longest word

        String longestName="";            //nameLst.get(0);
        for (int x = 0; x <  nameLst.size(); x++) {
            if(nameLst.get(x).length()>=longestName.length()){
                //> will give you first longest name if you have more than one
                //>= will give you last longest name if you have more than one

                longestName=nameLst.get(x);
            }

        }

        System.out.println("longestName = " + longestName);

        //how do i get the concentenation of all longest words if there are more than one,
        //first find out the longest word, and get the character count
        //then loop through each names and check whether character count equal to longest word character count
        String longestWords="";
        for (int x = 0; x < nameLst.size() ; x++) {
            if(nameLst.get(x).length()==longestName.length()){
                longestWords+=nameLst.get(x)+ " ";
            }

        }
        System.out.println("longestWords = " + longestWords);

// length : counting the elements inside array , it is a property of array object
        //last item of an array : arr.[arr.length-1];
// length() :counting the character inside String, it is a method of String object
        //last char of a String : str.charAt( str.length()-1
// size() : counting the elements inside ArrayList object
        //last element of an arrayList: lst.get ( lst.size()-1 )

        //HOW DO WE USE FOR EACH LOOP TO GO THROUGH EACH ITEMS
        System.out.println("____________________________");
        for( String currentName     : nameLst){
            System.out.println("currentName = " + currentName);

        }










    }
}
