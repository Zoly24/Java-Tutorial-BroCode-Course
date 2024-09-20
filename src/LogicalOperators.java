import java.util.Scanner; //Imports Scanner from the Util class

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Logical Operators = used to connect two or more expressions
                && = (AND) both conditions must be true
                || = (OR) either condition must be true
                !  = (NOT) reverses boolean value of condition
         */


        //AND Operator
        /*
        int temp = 25; //Initializing 'temp' to 25 (degrees)

        if(temp > 30) { //Read as if 'temp' is greater than 30, then run what is inside the if statement
            System.out.println("It is hot outside"); //Prints out if 'temp' is greater than 30
        }
        else if(temp >= 20 && temp <= 30) { //Read as else if 'temp' is greater than 20 AND less than 30, then run what is inside the if statement
            System.out.println("It is warm outside"); //Print out if 'temp' is greater than 20 AND less than 30
        }
        else { //Read as if all else fail, run what is inside the else statement
            System.out.println("It is cold outside"); //Prints out if 'temp' does not meet any of the if statement requirements
        }
        */

        //OR Operator
        /*
        Scanner keypress = new Scanner(System.in); //Initializes Scanner to a variable keypress and gives the User the ability to input in Console

        System.out.println("Welcome to my game! Press q or Q to enter!"); //Prints out statement for the User
        String response = keypress.next(); //Initializing the String 'response' to record what the user has inputed

        if(response.equals("q") || response.equals("Q")) { //Read as if the user's response is q OR Q, then run what is inside the if statement
            System.out.println("Welcome! Have fun!"); //Prints out if the condition above is meet
        }
        else { //Read as if the user inputs anything else besides q OR Q, run what is inside the else statement
            System.out.println("See ya later!"); //Prints out if the user does not input q OR Q
        }
        */

        //NOT Operator
        Scanner keypress = new Scanner(System.in); //Initializes Scanner to a variable keypress and gives the User the ability to input in Console

        System.out.println("Welcome to my game! Press q or Q to enter!"); //Prints out statement for the User
        String response = keypress.next(); //Initializing the String 'response' to record what the user has inputed

        if(!response.equals("q") && !response.equals("Q")) { //Read as if the user's input is NOT equal to q AND NOT equal to Q, then run what is inside the if statement
            System.out.println("See ya later!"); //Prints out if condition above is meet
        }
        else { //Read as if the user's input is anything else besides q OR Q, then run what is inside the else statement
            System.out.println("Welcome! Have Fun!"); //Prints out if the user does input q OR Q
        }
    }
}
