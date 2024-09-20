import java.util.Scanner; //Import Scanner class from Utilities Library

public class NestedForLoops {

    public static void main(String[] args) {

        //nested loops = a loop inside a loop

        Scanner scanner = new Scanner(System.in); //Initialize Scanner to 'scanner' and use System.in to allow the user to interact

        int rows; //Declare rows as an int
        int columns; //Declare columns as an int
        String symbol = ""; //Initialize the String 'symbol' to an empty space for the user to fill in

        System.out.println("Enter the number of rows: "); //Declares the user to type in the amount of rows they want
        rows = scanner.nextInt(); //Records the user's input and stores it in rows

        System.out.println("Enter the number of columns: "); //Declares the user to type in the amount of columns they want
        columns = scanner.nextInt(); //Records the user's input and stores it in columns

        System.out.println("Enter a character: ");//Declares the user to type what character they want
        symbol = scanner.next(); //Records the user's input and stores it in symbol

        for(int i = 1; i <= rows; i++) { //Read as for when i is equal to 1, check to see if i is less than the rows the user picked, then run the block inside and increment i by 1
            for(int j = 1; j <= columns; j++) { //Read as for when j is equal to 1, check to see if j is less than the columns the user picked, then run the block inside and increment j by 1
                System.out.print(symbol); //Prints out the symbol the user picked as long as j is true
            }
            System.out.println(); //Prints out a new line for the next run through of i
        }
    }
}
