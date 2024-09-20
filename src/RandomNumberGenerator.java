import java.util.Random; //Imports random class from util library

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random(); //Initializes the Random data to a variable called random

        int x = random.nextInt(6) + 1; //Generates a pseudorandom integer between 1-6. The inner number is the boundary. (We do +1 because computers do zero index counting where they start from 0).
        double y = random.nextDouble(); //Generates a pseudorandom double between 0 and 1
        boolean z = random.nextBoolean(); //Generates a pseudorandom boolean either true or false

        System.out.println("This is a random integer between 1 and 6: " + x); //Prints out the pseudorandom integer
        System.out.println("This is a random double between 0 and 1: " + y); //Prints out the pseudorandom double
        System.out.println("This is a random boolean between true or false: " + z); //Prints out the pseudorandom boolean
    }
}
