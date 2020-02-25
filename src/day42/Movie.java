package day42;

public class Movie {
   private String name;
   private double length;
   private String type;

    public Movie(){
        System.out.println("EMPTY MOVIE");
    }

    //write a  constructor to set all the fields value


    public Movie(String name, double length, String type){
        this.name=name;
        this.length=length;
        this.type=type;
    }

    //short-way rigth click ,generate, constructor,select al

//    public Movie(String name, double length, String type) {
//        this.name = name;
//        this.length = length;
//        this.type = type;
//    }

    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setLength(double length){
        this.length=length;
    }
    public void setType(String type){
        this.type=type;
    }




}
