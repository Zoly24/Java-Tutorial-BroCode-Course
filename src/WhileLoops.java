import java.util.Scanner; //Imports Scanner Class from the Utili library

public class WhileLoops {

    public static void main(String[] args) {

        //while loop = executes a block of code as long as it's condition remains true

        //WHILE loop
        Scanner namescan = new Scanner(System.in); //Initialize Scanner to 'namescan' and allowing the Scanner to take in System.in
        String name = ""; //Initializing String 'name' (doesn't have to have a value because the user has to fill this in

        while(name.isEmpty()) { //Read as while the String 'name' is empty, run the code below
            System.out.println("Enter your name: "); //Prints out asking user for their name
            name = namescan.nextLine(); //Stores the user's input into the 'name' variable and continue
        } //When this is at the end, it checks the condition that the name is not blank, while it is blank, it repeats the process until it is not.

        System.out.println("Hello, " + name); //Prints out the name when the user gives it


        //DO Loop
        /*
        Scanner namescan = new Scanner(System.in); //Initialize Scanner to 'namescan' and allowing the Scanner to take in System.in
        String name = ""; //Initializing String 'name' (doesn't have to have a value because the user has to fill this in

        do { //Read as DO the block of code below
            System.out.println("Enter your name: "); //Prints out the prompt to enter name
            name = namescan.nextLine(); //Stores the user's name in the String 'name'
        } while(name.isEmpty()); //At the end, while the name is empty (blank), we repeat the DO statement until the while look is satisfied

            System.out.println("Hello, " + name); //Prints out the name when the user gives it
        */
    }
}
