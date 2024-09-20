import java.util.Scanner; //Imports Scanner class from Utilities library

public class IfStatements {
    //if statement = performs a block of code if it's condition evaluates to be true
    public static void main(String[] args) {
        Scanner detector = new Scanner(System.in); //Initialize Scanner class and allows User to interact through the System.in function

        System.out.println("How old are you?"); //Questions the user about their age
        int age = detector.nextInt(); //Allows user to enter an age, storing it into the age variable

        if(age >= 18) { //Read as "if the variable age they put in is greater than 18, then do what is below
            System.out.println("You can now legally be tried as an adult in the US!");
        }
        else{ //Read as "else if the variable age they put in is less than 18, then do what is below.
            System.out.println("You can only be tried at a juvenile court in the US!");
        }
    }
}
