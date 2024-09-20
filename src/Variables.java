public class Variables {
    public static void main (String[] args){
        int x = 123; //4 bytes
        double y = 3.14; //8 bytes
        boolean z = true; //2 bytes
        char symbol = '@'; //1 byte
        String name = "Alexzander Wilburn"; // numChar + 1 bytes (19 bytes)

        System.out.println("My interger is " + x);  //Prints out statement with int x (primitive data)
        System.out.println("My double is " + y);    //Prints out statement with double y (primitive data)
        System.out.println("My boolean is " + z);   //Prints out statement with boolean z (primitive data)
        System.out.println("My char is " + symbol); //Prints out statement with char symbol (primitive data)
        System.out.println("My String is " + name); //Prints out statement with String name (reference data)
    
        /* 
        PRIMATIVE DATA TYPES (usually start with lowercase)
        byte = (number, 1 byte)
        short = (number, 2 bytes)
        int = (number, 4 bytes)
        long = (number, 8 bytes)
        float = (float number, 4 bytes)
        double = (float number, 8 bytes)
        char = (a character, 2 bytes)
        boolean = (true or false, 1 byte)

        REFERENCE DATA TYPES (usually start with uppercase)
        String = represents a sequence of characters
        Arrays = Store collections of elements of the same type
        Classes = User-defined data types with methods and fields
        Interfaces = Define a set of methods that a class must implement

         */
    }       
}
