package repl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_187 {

        public static String lameDb(String db, String op,String id,String data)
        {
//            //lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
//            if(op.equals("add") ){
//                db=db+"#"+id+data;
//                //         db            op   id   data
//            //lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
//            }if(op.equals("edit")) {
//            db = db.substring(0, db.indexOf(id)) + id + data + db.substring(db.indexOf(id) + data.length()+1);
//
//            //lameDb("1tst#2bla#3foo","delete","1","")+"\n"
//            }if(  op.equals("delete")) {
//            db=db.replace()
//       }
            String [] arrDb=db.split("#");
           // System.out.println("arrDb = " + Arrays.toString(arrDb));
            List<String> lstDb= new ArrayList<>();
            for (int x = 0; x <arrDb.length ; x++) {
                lstDb.add(arrDb[x]);

            }
           // System.out.println("lstDb = " + lstDb);

            if(op.equals("add")){
                lstDb.add(id+data);
              //  System.out.println("lstDb = " + lstDb);
            }if(op.equals("delete")){
                lstDb.remove(Integer.parseInt(id)-1);
        }if(op.equals("edit")){
                lstDb.set(Integer.parseInt(id)-1 ,id+data    );
        }
String result="";
            for (int x = 0; x <lstDb.size() ; x++) {
                result=""+result+lstDb.get(x);
                if( ! lstDb.get(x).equals(lstDb.get(lstDb.size()-1)) ){
                    result+="#";
                }

            }

return result;
        }//end lameDb


        public static void main(String[] args)
        {


            System.out.print(
                    lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
            );
            //returns:  1etsy#2wooden#3spoon#4aaa

            System.out.print(
                    lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
            );
            //returns:  1test#2bbb#3foo
            System.out.print(
                    lameDb("1tst#2bla#3foo","delete","1","")+"\n"
            );
            ////returns:  #2bla#3foo
            System.out.print(
                    lameDb("1tst#2bla#3foo","none","1","")+"\n"
            );
            //returns:  1tst#2bla#3foo
        }

    }
//m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")

//(since operation is 'add', we added '#4aaa' to the end and return)
//


//(since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)
//
//
//m.lameDb("1tst#2bla#3foo","delete","1","")

//
//m.lameDb("1tst#2bla#3foo","none","1","")
//returns:  1tst#2bla#3foo

