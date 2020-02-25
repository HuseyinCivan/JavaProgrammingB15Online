package office_hour;

public class Practice_12_27 {
    public static void main(String[] args) {
        System.out.println(Eligibility(19));


    }
 // access modifier       specifier         return type         name         parameters
    public                 static              double           method3         ()          {

       // float num1=10.5f;
       // byte num1=10;
       double num1=10.5d;
       //short num1=10;
        //int num1=10;


        return num1;
    }
public static boolean Eligibility (int age){

        if(age>=21){
            return  true;
        }
            return false;




}


}
//12/27/2019
//Practice topic: Methods
//methods: grouping a series of statements together to perform a specific action
//        methods can make our codes more reusable (don't need to repeat same set of statements)
//method Decleration:
//
//        access-modfiers  specifiers  return-Type  name(parameters){
//                statements...;
//        }
//        during this course:
//            access-mdofiers: public, protected, default, private
//            specifiers: static, final, abstract
//            return-type(mandatory): void, any  data-types(all primitives or non primitives)
//            parameters: any  data-types(all primitives or non primitives)
//
//
//        for Now we will only use public and static for the access midifier and specifier
//        if return-type is void: does not return any value
//        if return type is not void: the method MUST return a value
//                                    the returning value MUST be matched with the return-type of the method
//        Methods with parameters: sometime method needs specific information (from the user) to perform its function
//            the argument that we are passing MUST match with parameter's data type
//return statement: it's used for exiting the current method.  we can also use return statement to return a vlaue from the method