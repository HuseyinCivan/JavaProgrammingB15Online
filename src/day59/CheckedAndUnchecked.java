package day59;

import java.io.IOException;

public class CheckedAndUnchecked {
    public static void main(String[] args) {

        String x="abc";
    //    System.out.println(x.charAt(100));

        //exception hierarchy

        // Throwable  --> child class --> Exception
        // Under exception class,
        //there is one sub class known as RunTimeException
        //Anything IS-A RunTimeException regarded as UNcheckedException
        //UncheckedExceptions are not required to be handled at compile time

        //how do we know the exception is uncheckedException
        //check whether it's a RunTimeException or sub class of RuntimeException

        //try to throw exception programmaticallyif it compile, it means it 's RunTimeException

      //  throw new RuntimeException("Just throwing it out ! ");

        //what is checked exception
        //an exception type that must be handled at compile time
        //everythoing that sub class of exception but not RunTimeException
        //programmers are required to handle (or declare) this type of exception

        // is the class Exception a type of checked exception or unchecked ?

        try {
            throw new IOException("Just throwing this away");
        } catch (IOException e) {
            System.out.println("Exception caugt");
        }


    }
}
