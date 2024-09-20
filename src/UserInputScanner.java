import java.util.Scanner;       //Importing Scanner from Utilities library in Java

public class UserInputScanner {
    public static void main(String[] args) {

        //Initializing the scanner to variable 'lidar', invoke a Constructor of Scanner, taking the user input with 'System.in'
        Scanner lidar = new Scanner(System.in);

        System.out.println("What is your name?");   //Name Question
        String name = lidar.nextLine();             //Allows the user to input a String that is stored in variable name

        System.out.println("Enter a number between 1-10."); //Number Question
        int number = lidar.nextInt();                       //Allows the user to input a NUMBER that is stored in variable number
        lidar.nextLine();   //Since nextInt only reads the numbers, the \n is not read so to combat we use the Scanner to buffer it

        System.out.println("What is your favorite sport?"); //Sport Question
        String sport = lidar.nextLine();                    //Allows the user to input a String that is stored in variable sport

        System.out.println("Hi, " + name);  //Prints out a message with the input String from 'name'
        System.out.println("You are thinking of the number: " + number);    //Prints out a message with the input int from 'number'
        System.out.println("Your favorite sport is: " + sport); //Prints out a message with the input String from 'sport'
    }

    /*
    Import Scanner library
    Initialize the Scanner to a new scanner operation, such as System.in to get user input
    You can store the user input through the (scanner name).nextLine();
    When using (scanner name).nextInt or any other number, make sure to add (scanner name).nextLine(); to allow for more String inputs later
    You can recall the variables in a string at the end of the main method to create an interactive console app.
     */
}
