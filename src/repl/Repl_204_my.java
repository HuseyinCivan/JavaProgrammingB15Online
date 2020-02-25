package repl;
//"okaannt","okaantt"
public class Repl_204_my {
    public static void main(String[] args) {
        System.out.println(isAnagram("okaannt","okaantt"));

    }
    public static boolean isAnagram(String word1, String word2) {

        word1= word1.toLowerCase().replace(" ","");
        word2=word2.toLowerCase().replace(" ","");


            for (int x = 0; x <word1.length() ; x++) {

             word2=  word2.replaceFirst(""+word1.charAt(x),"");
              }
                return word2.equals("");

                }
            }


//  public static boolean isAnagram(String word1, String word2) {
//
//       word1= word1.toLowerCase().replace(" ","");
//       word2=word2.toLowerCase().replace(" ","");
//
//      boolean isAnagram=true;
//       if(word1.length()!=word2.length()){
//           isAnagram=false;
//       }
//       else{
//           for (int x = 0; x <word1.length() ; x++) {
//            if(word2.contains(""+word1.charAt(x))){
//               word2.removeFirst(word1.charAt(x));
//              }
//
//            if(!word2.contains(""+word1.charAt(x))){
//               isAnagram=false;
//              }
//           }
//       }
//    return isAnagram;
//    }
//}