package day10;

public class Calculator_V2 {
    public static void main(String[] args) {

        //what do you do in each season
        //*
        //spring ---> hike! easter! nawruz blossom
        //summer---->swim,vacation,bbq,holiday
        //fall------>black friday , hiking , harvest ,haloween , shopping
        //winter----> snowboarding, ski ,christmas ,new year

        String season="fall";

        switch (season){

            case "spring":
                System.out.println("hike! easter! nawruz blossom");
                break;
            case "summer":
                System.out.println("swim,vacation,bbq,holiday");
                break;
            case "fall":
                System.out.println("black friday , hiking , harvest ,haloween , shopping");
                break;
            case "winter":
                System.out.println("snowboarding, ski ,christmas ,new year");
                break;

            default:
                System.out.println("unknown season !!");




        }




    }
}
