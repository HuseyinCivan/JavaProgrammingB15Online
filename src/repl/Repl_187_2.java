package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_187_2 {
    public static void main(String[] args)
        {

            String db="1etsy#2wooden#3spoon";
            String id="4";
            String op="add";
            String data="bbb";

            String [] arrDb=db.split("#");
            System.out.println("arrDb = " + Arrays.toString(arrDb));
            List<String> lstDb= new ArrayList<>();
            for (int x = 0; x <arrDb.length ; x++) {
                lstDb.add(arrDb[x]);

            }
            System.out.println("lstDb = " + lstDb);

            if(op.equals("add")){
                lstDb.add(id+data);
                System.out.println("lstDb = " + lstDb);
            }

//            List<String> lstDb= Arrays.asList(arrDb);  //lstDb = [1tst, 2bla, 3foo]
//            System.out.println(lstDb);
//            lstDb.add("3");
//            System.out.println(lstDb);
//
//            if(op.equals("add")) {
//                lstDb.add(Integer.parseInt(id),op);
//                System.out.println(lstDb);
//            }


//            System.out.print(
//                    lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
//            );
//
//            System.out.print(
//                    lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
//            );
//
//            System.out.print(
//                    lameDb("1tst#2bla#3foo","delete","1","")+"\n"
//            );
//
//            System.out.print(
//                    lameDb("1tst#2bla#3foo","none","1","")+"\n"
//            );

        }

    }