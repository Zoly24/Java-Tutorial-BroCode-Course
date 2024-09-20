import java.util.Scanner; //Imports Scanner class from Utilities library

public class IfStatements {
    //if statement = performs a block of code if it's condition evaluates to be true
    public static void main(String[] args) {
        Scanner detector = new Scanner(System.in); //Initialize Scanner class and allows User to interact through the System.in function

        System.out.println("How old are you?"); //Questions the user about their age
        int age = detector.nextInt(); //Allows user to enter an age, storing it into the age variable

        if(age >= 79) { //Read as "if the variable age they put in is greater than 79, then do what is below"
            System.out.println("You are a Silent Generation!");
        }
        else if(age >= 60){ //Read as "else if the variable age they put in is greater than 60, then do what is below".
            System.out.println("You are a Baby Boomer!");
        }
        else if(age >= 44) { //Read as "else if the variable age they put in is greater than 44, then do what is below".
            System.out.println("You are Generation X!");
        }
        else if(age >= 28) { //Read as "else if the variable age they put in is greater than 28, then do what is below".
            System.out.println("You are a Millennial!");
        }
        else if(age >= 12) { //Read as "else if the variable age they put in is greater than 12, then do what is below".
            System.out.println("You are Generation Z!");
        }
        else { //Read as "if all else doesn't apply, then do what is below".
            System.out.println("You are Generation Alpha!");
        }
    }
}
