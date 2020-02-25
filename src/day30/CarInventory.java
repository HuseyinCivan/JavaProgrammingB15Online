package day30;

public class CarInventory {
    public static void main(String[] args) {
        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

        // task : count Chevrolet and civic
        int counterChevrolet = 0;
        int counterCivic = 0;
        for (int x = 0; x < cars.length; x++) {
            if (cars[x].toLowerCase().contains("chevrolet")) {
                counterChevrolet++;

            }
            if (cars[x].contains("Civic")) {
                counterCivic++;
            }


        }
        System.out.println("counterChevrolet = " + counterChevrolet);
        System.out.println("counterCivic = " + counterCivic);


    }
}
