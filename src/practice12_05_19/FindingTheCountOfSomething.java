package practice12_05_19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        int counter=0;
        for(int x=1;x<=100;x++){
            if(x%15==0){
                counter=counter+1;
                System.out.println(x);
            }
        }
        System.out.println("counter = " + counter);

        int counterA=0;
        String name= "Huaseayian Caivaaaana";
        for(int x=0;x<name.length();x++){
            if(name.charAt(x)=='a'){
              counterA+=1;
            }

        }
        System.out.println("counterA = " + counterA);






    }
}
