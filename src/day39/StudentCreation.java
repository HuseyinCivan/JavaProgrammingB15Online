package day39;

public class StudentCreation {
    public static void main(String[] args) {

     // how do we create an object out of template

     Student s1 = new Student();
     //set the values of s1 object attributes
     s1.name="Seda";
     s1.age=18;
     s1.gender='F';
        //get the values of s1 object attributes

        System.out.println("s1 name= " + s1.name);



     Student s2 = new Student();
     s2.name="Huseyin";
     s2.age=36;
     s2.gender='M';

        System.out.println("s2 name = " + s2.name);

        System.out.println(s2.name+" | "+s2.gender+ " | "+s2.age);

        s2.age=28;

        System.out.println(s2.name+" | "+s2.gender+ " | "+s2.age);


    }
}
