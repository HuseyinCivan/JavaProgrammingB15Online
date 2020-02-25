package repl;

import java.util.Scanner;

public class Repl_104 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String json = scan.nextLine();

         String json="   \"id\": 1934, \"firstName\": \"James\", \"lastName\": \"May\", \"role\": \"student-team-member\"  ";

         String name= json.substring(  json.indexOf("firstName") + 13 , json.indexOf("lastName") - 4  );

        String surname= json.substring(  json.indexOf("lastName") + 12 , json.indexOf("role") - 4  );

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);

        //{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
        //{"id": 1944, "firstName": "Cecil", "lastName": "Nacey", "role": "student-team-leader"}
        //{"id": 1963, "firstName": "Molly","lastName": "Cossor", "role": "student-team-member"}
String firsName,lastName;
        json=json.replace(" ","");
        firsName= json.substring(  json.indexOf("firstName") + 12 , json.indexOf("lastName") - 3  );

        lastName= json.substring(  json.indexOf("lastName") + 11 , json.indexOf("role") - 3  );








    }
}
