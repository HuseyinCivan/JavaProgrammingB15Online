package day12;

public class Logintest {
    public static void main(String[] args) {

        String userName , password ;
        userName="user12";
        password="pass12";

if(userName.equals("user123") && password.equals("pass123")){
    System.out.println("Login Succesfull");
}else if (!userName.equals("user123") && password.equals("pass123")){
    System.out.println("USERNAME NOT CORRECT");
}else if(userName.equals("user123")&& !password.equals("pass123")){
    System.out.println("PASSWORD NOT CORRECT");
}else{
    System.out.println("USERNAME AND PASSWORD ARE BOTH WRONG !!!");
}











    }
}
