package day18;

public class ForLoopIntro {
    public static void main(String[] args) {

        // count 1 to 5
        // for loop() has 3 parts seperated by
        // first part initialization
        //it will run only once when you enter the loop
        //second part termonation condition
        //loop will be stop if it is false
        //it will be checked everytime

        // third part increment or decrement to change condition eventually
        //it will run after each iteration

        for(  int i=1 ; i<=5  ;  i++    ){
            System.out.println("i = "+i);
            System.out.println("Happy Birthday SEDA CIVAN");

        }
for(int x=10;x>=1;--x){
    System.out.println(x);
}
        System.out.println("-------------------------------");
for (int number=0;number<=100 ;number+=2){
    System.out.print(number+" ");
}
        System.out.println("-------------------------------");

for(int x=0 ; x<100 ; x+= 3 ){
    System.out.print(x+" ");
}
        System.out.println();
        System.out.println("-------------------------even number------");
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

            //THE SHORT CUT FOR GENERATING FOR LOOP IS : fori enter or tab

        }
        System.out.println();
        System.out.println("-------------------------------");
        for (int q = 0; q < 100; q++) {
            if (q%5==0 && q%3==0){
                System.out.println(q+" fizz buzz number");
            }

        }

//everything you can do with for loop --> can be done using while loop !!!!

    }
}
