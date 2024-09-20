import java.util.ArrayList; //Imports ArrayList class from util library

public class ArrayLists {

    //Array List = A resizeable array
    //             Elements can be added and removed after compilation phase
    //             Store reference data types

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>(); //How to initialize ArrayList starting by calling ArrayList and setting the inside to the String. Then making ArrayList Object

        food.add("Pizza"); //Adding Pizza to the ArrayList
        food.add("Tacos"); //Adding Tacos to the ArrayList
        food.add("Steak"); //Adding Steam to the ArrayList

        food.set(0, "Hotdog"); //Sets the index (for this example 0) value and replaces it with the String "Hotdog"
        food.remove(1); //Removes the certain index that you give it (zero-based indexing
        //food.clear(); //This command clears the ArrayList (uncomment if you want to clear the ArrayList)

        for(int i = 0; i < food.size(); i++ ) { //Read as for i is equal to j, check if i is less than the size of the ArrayList. If so, then run the block below it and increment i by 1
            System.out.println(food.get(i)); //Prints out the food as i grows to the size of the ArrayList, essentially printing out everything in the ArrayList

        }
    }
}
