import java.util.Scanner; //Add Scanner from util library

/*!!!UNCOMMENT ANY PART YOU WANT TO SEE AND COMMENT BACK PART YOU DON'T WANT!!!*/

public class MathClass {
    public static void main(String[] args) {
        //Max Function ----- Finds the bigger of two numbers
        /*
        double x = 3.14;
        double y = -10;

        double output = Math.max(x, y);

        System.out.println(output);
        */


        //Min Function ----- Finds the smaller of two numbers
        /*
        double x = 3.14;
        double y = -10;

        double output = Math.min(x,y);

        System.out.print(output);
         */

        //Absolute Value Function ----- Finds the absolute value of a number (turns negative to non-negative numbers)
        /*
        double x = -10;

        double output = Math.abs(x);

        System.out.println(output);
         */

        //Square Root Function ----- Finds the square root of a number
        /*
        double x = 3.4;

        double output = Math.sqrt(x);

        System.out.println(output);
         */

        //Round Function ----- Rounds a number up or down to the nearest whole number. .49999 = round down, .5 = round up
        /*
        double x = 3.14;

        double output = Math.round(x);

        System.out.println(output);
        */

        //Ceiling Function ----- Always rounds up to the nearest whole number
        /*
        double x = 3.14;

        double output = Math.ceil(x);

        System.out.println(output);
         */

        //Floor Function ----- Always rounds down to the nearest whole number
        /*
        double x = 3.14;

        double output = Math.floor(x);

        System.out.println(output);
         */

        /* !!!!!!!!!!!!!!!HYPOTENUSE PROJECT!!!!!!!!!!!!!!!*/

        double side1; //Declaring variable of side 1
        double side2; //Declaring variable of side 2
        double hypotenuse; //Declaring variable for hypotenuse

        Scanner calculation = new Scanner(System.in); //Initializing the Scanner and naming it 'calculation'

        System.out.println("Length of Side 1: "); //Question to user on Length of side 1
        side1 = calculation.nextDouble();   //User interacts with our Scanner and inputs value of side 1

        System.out.println("Length of Side 2: "); //Question to user on Length of side 2
        side2 = calculation.nextDouble(); //User interacts with our Scanner and inputs value of side 2

        hypotenuse = Math.sqrt((side1*side1) + (side2*side2)); //Variable for 'hypotenuse' does the hypotenuse equation using the variables given from the user

        System.out.println("Your hypotenuse is: " + hypotenuse); //Prints out the variable hypotenuse given the length from it

        calculation.close(); //Good practice to close the scanner by calling it to close

    }
}
