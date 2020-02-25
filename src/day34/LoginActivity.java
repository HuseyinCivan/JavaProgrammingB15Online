package day34;

public class LoginActivity {



    public static void main(String[] args) {

        loginVoid("my username", "abc123");
        loginVoid("user", "abc123");
        boolean result = loginReturn("user", "abc123");
        System.out.println("result = " + result);

        System.out.println("second run " + loginReturn("aaaa", "bbb"));
        // System.out.println(    loginVoid("aaaa" , "bbb")    ); CAN NOT DO IT WITH VOID METHOD
        //boolean result2 = loginVoid("abc","efg");

        if (loginReturn("user1", "abc123")) {

            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View The order ");

        } else {
            System.out.println("NO SHOPPING UNLESS YOU SIGNED IN!!!!!!");
        }

    }

    public static void loginVoid(String user, String password) {

        if (user.equals("user") && password.equals("abc123")) {
            System.out.println(" LOG IN SUCCESSFUL");
        } else {
            System.out.println(" LOG IN FAILED");
        }

    }

    public static boolean loginReturn(String user, String password) {

        return user.equals("user") && password.equals("abc123");

    }

//        if (user.equals("user") && password.equals("abc123")  ){
//            return true;
//        }else {
//            return false;
//        }

}




//    public static void main(String[] args) {
//        loginActivity("user","abc123");
//        System.out.println("______________");
//
//        loginActivity("usdetweer","abc123");
//        System.out.println("______________");
//
//        loginActivity("user","abc123erwr");
//        System.out.println("______________");
//
//
//        loginActivity("usrweer","abc1rewr23");
//        System.out.println("______________");
//
//
//
//
//    }
//
//    //1, login1 :  static void method
//    //	it has two String method paramters
//    //			called username and password
//    //	(it accept 2 String object as argument when being called)
//    //	it check whther username and password  "user" and "abc123"
//    //	if yes
//    //		print login successful
//    //	else
//    //		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
//
//    public static void loginActivity (String username, String password){
//        if(username.equals("user") && password.equals("abc123")){
//            System.out.println("login successful");
//
//        }else if( username.equals("user") && !password.equals("abc123")){
//            System.out.println("login failed");
//            System.out.println("wrong password");
//        }else if( !username.equals("user") && password.equals("abc123")){
//            System.out.println("login failed");
//            System.out.println("wrong username");
//        }else if( !username.equals("user") && !password.equals("abc123")){
//            System.out.println("login failed");
//            System.out.println("wrong password and username");
//        }
//
//    }
//}
