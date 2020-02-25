package day11;

public class LogicalOperators {
    public static void main(String[] args) {

// combining multiple condition together
// in java there is no range check directly like math
// for example   int x = 70
// in math  :     60 < x < 100   -->>  true < 100
// in Java  :      x > 60  && x <100
// && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time
// Think about login example
// only when your username is right and your password is right at the same time
// then you will be able to login

///*                  true       true
//* int x = 70 ;    x > 60  && x <100 ;  true
//*
//                    false      true
//* int x = 10 ;    x > 60  && x <100 ;  false
//*
//                    true       false
// *int x = 110 ;   x > 60  && x <100 ;  false
// *
//                    true       true
// *int x = 99 ;    x > 60  && x <100 ;  true
// *
// *
//* */
// ||  2 pipe  or  | 1 pipe is used for compiling 2 conditions  : Logical  OR Operator
//        If you have 2 conditions to check
//        When will this be true  :  As long as one side is true , whole result will be true
//// think about buying milk from 2 stores :
//        As long as you found the milk in one store , you got the milk then you get out !
//                How do I type  pile character on keyboard   |   —>> shift \
//        As long as one side is true   whole result will be true
//                / *
//        true             false
//        int x = 70 ;     x>10   ||   x < 5      —>> true
//        false.      false
//        int x = 7 ;     x>10   ||   x < 5      —>> false
//        true.      false
//        int x = 17 ;     x>10   ||   x < 5      —>> true
//        false        true
//        int x = -8 ;     x>10   ||   x < 5      —>> true
//                * /
//
//        System.out.println("TRUTH TABLE");
//        System.out.println("RESULT OF true && true is "+(true && true));
//        System.out.println("RESULT OF false && true is "+(false && true));
//        System.out.println("RESULT OF true && false is "+(true && false));
//        System.out.println("RESULT OF false && false is "+(false && false));
//
//        System.out.println("TRUTH TABLE");
//        System.out.println("RESULT OF true || true is "+(true || true));
//        System.out.println("RESULT OF false || true is "+(false || true));
//        System.out.println("RESULT OF true || false is "+(true || false));
//        System.out.println("RESULT OF false || false is "+(false || false));
//
//        //create a var called num with type int
//        //find out whether this number us more than 100 or less than 10
//
//        //find out the mumber is the range of 10-60
//        //and print out the results
//
//        int number=61;
//int x=55;
//        System.out.println(number>100 || number<10 );
//        System.out.println(number>10 && number<60);
//
//        //more than 2 conditions at the same time
//
//                           //   true     false------->true
//        System.out.println(true || false ||false );
//                          //    true   false -------->false
//        System.out.println(true && true && false );
//
//        System.out.println(x==50 || x==51 ||x==55);
//
//
//        // check x is more than 50 and x is not 51 or x equal to 57
//
//        System.out.println(x>50 && x!=51 || x==57);
//        System.out.println(x>50  || x!=52 && x==57);

//
        // combining multiple condition togerge r
        // in java there is no range check directly like math
        // for example   int x = 70
        // in math  :     60 < x < 100   -->>  true < 100
        // in Java  :      x > 60  && x <100
        // && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time
        // Think about login example
        // only when your username is right and your password is right at the same time
        // then you will be able to login
        /*                  true       true
        * int x = 70 ;    x > 60  && x <100 ;  true
        *
                            false      true
        * int x = 10 ;    x > 60  && x <100 ;  false
        *
                            true       false
         *int x = 110 ;   x > 60  && x <100 ;  false
         *
                            true       true
         *int x = 99 ;    x > 60  && x <100 ;  true
         *
         *
        * */
        System.out.println("TRUTH TABLE &&");
//
//        System.out.println( true && true    );
//        System.out.println( false && true    );
//        System.out.println( true && false   );
//        System.out.println( false && false  );
        System.out.println("RESULT OF true && true  is " + (true && true));
        System.out.println("RESULT OF false && true  is " + (false && true));
        System.out.println("RESULT OF true && false  is " + (true && false));
        System.out.println("RESULT OF false && false  is " + (false && false));
        System.out.println("TRUTH TABLE ||"); //How do I type  pipe character on keyboard   |   —>> shift \
        System.out.println("RESULT OF true || true  is " + (true || true));
        System.out.println("RESULT OF false || true  is " + (false || true));
        System.out.println("RESULT OF true || false  is " + (true || false));
        System.out.println("RESULT OF false || false  is " + (false || false));
        // Create a variable called num with type int
        // find out whether this number is more than 100 or less than 10
        // find out the number is within the range of 10-60
        // and print out the result zk
        int x = 55;
        System.out.println(x > 100 || x < 10);
        System.out.println(x > 10 && x < 60);
        // more than 2 conditions at the same time ,  3 conditions
        //true || falsae --->> true
        System.out.println(  true || false || false  );
        //   true  && false  ----->> false
        System.out.println(  true && true && false  );
    }
}





