package day41;

public class Person {
    // private make it only accesible within the same class
   private String name;
    private int age;
    private long ssn;

    //what if i want only get the name
    public String getName(){
        return name;
    }

    //what if i want to only change the name

    public void setName(String newName){
        name=newName;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age=newAge;

    }

    public long getSsn(){
        return ssn;
    }

    public void setSsn(long newSsn){
        ssn=newSsn;
    }


    //write a method to give value to the field

    public void setAll(String newName, int newAge, int newSsn){

        // you can put whatever check here to make sure
        //the data is correct or any other logic

        name=newName;
        age=newAge;
        ssn=newSsn;

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
