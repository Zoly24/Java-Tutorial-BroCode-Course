public class WrapperClasses {
    //Wrapper Class = provides a way to use primitive data types as reference data types
    //                reference data types contain useful methods can be used with
    //                collections (ex.ArrayList)

    //Primitive             //Wrapper
    //---------             //-------
    //boolean               //Boolean
    //char                  //Character
    //int                   //Integer
    //double                //Double

    //autoboxing = the automatic conversaion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
    //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
    public static void main(String[] args) {
        Boolean a = true;       //Autoboxing boolean into a Boolean
        Character b = '#';      //Autoboxing char into Character
        Integer c = 123;        //Autoboxing int into Integer
        Double d = 3.14;        //Autoboxing double into Double
        String e = "Zoly";      //String is just here for show


        if(a == true) { //Showing that you can unbox these back to their primitive states.
            System.out.println("This reference type Boolean can be a primitive boolean too!");
        }

        if(b == '#'){ //Showing that you can unbox these back to their primitive states.
            System.out.println("This reference type Character can be a primitive char too!");
        }

        if(c == 123){ //Showing that you can unbox these back to their primitive states.
            System.out.println("This reference type Integer can be a primitive int too!");
        }

        if(d == 3.14){ //Showing that you can unbox these back to their primitive states.
            System.out.println("This reference type Double can be a primitive double too!");
        }
    }



}

