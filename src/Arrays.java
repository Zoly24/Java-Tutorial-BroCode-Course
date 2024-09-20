public class Arrays {

    public static void main(String[] args) {

        //array = used to store multiple values in a single variable
        //Make sure that the data type you are adding are the same as what is in the array

        //One way to array
        /*
        String[] cars = {"Chevrolet Camaro", "Lamborghini Aventador", "Bugatti Chiron", "Ferrari LaFerrari"}; //Initializing the String to an array, calling it to a name such as 'cars', then listing the array with commas

        System.out.println(cars[0]); //Prints out the first car in the array because of the zero index counting that computers do
        */

        //Another way to array

        String[] cars = new String[4]; //Make the String an object and adds declares 4 elements for it

        cars[0] = "Chevrolet Camaro"; //Initializing the first element in the array (always start with 0)
        cars[1] = "Lamborghini Aventador"; //Initializing the second element in the array
        cars[2] = "Bugatti Chiron"; //Initializing the third element in the array
        cars[3] = "Ferrari LaFerrari"; //Initializing the element object in the array

        for(int i = 0; i < cars.length; i++) { //Read as for i is equal to 0, check that i is less than the entire length of the list of cars in the array, if it passes then run the code then increment i by 1
            System.out.println(cars[i]); //Prints out the different car elements as i goes up in value.
        }


    }
}
