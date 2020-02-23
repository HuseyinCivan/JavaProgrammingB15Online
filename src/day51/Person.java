package day51;


// person IS-A comparable
//yes because it implements Comparable interface
//it's a inheritance | IS-A | super-sub relationship
public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




    //now this become a natural order for comparing Person Object
    public int compareTo(Person otherPerson   ){

//        if(this.age > otherPerson.age){
////            return 1;
////        }else if(this.age<otherPerson.age){
////            return -1;
////        }
////        return 0;

        //modify this to make your natural order , comparing by name

        if(this.name.charAt(0)>otherPerson.name.charAt(0)){
            return 1;
        }
        if(this.name.charAt(0)<otherPerson.name.charAt(0)){
            return -1;
        }else{
            return 0;
        }

    }


}
