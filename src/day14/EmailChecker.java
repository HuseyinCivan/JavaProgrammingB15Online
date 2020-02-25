package day14;

public class EmailChecker {
    public static void main(String[] args) {


        String email = "hfsdfsdffdgd@mail.ru";

        boolean mustContain = email.contains("@");
        boolean mustNotContain = !email.contains(" ");

        if (!mustContain || !mustNotContain){
            System.out.println("INVALID EMAIL");
        }else if(email.endsWith("@gmail.com")) {
            System.out.println("Gmail");
        }else if(email.endsWith("@yahoo.com")) {
                System.out.println("Yahoo email");
            }else if(email.endsWith("@mail.ru")) {
            System.out.println("Russian email");
        }
    }







}
