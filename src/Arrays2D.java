public class Arrays2D {
    public static void main(String[] args) {
        //2D Array = an array of arrays

        //One Way to write a 2D Array
        /*
        String[][] cars = new String[3][3]; //Takes the String with 2 arrays and makes it a new object with 3 elements in each

        cars[0][0] = "Camaro";      //stores car in array 0,0 (row 0, column 0)
        cars[0][1] = "Corvette";    //stores car in array 0,1 (row 0, column 1)
        cars[0][2] = "Silverado";   //stores car in array 0,2 (row 0, column 2)
        cars[1][0] = "Mustang";     //stores car in array 1,0 (row 1, column 0)
        cars[1][1] = "Ranger";      //stores car in array 1,1 (row 1, column 1)
        cars[1][2] = "F-150";       //stores car in array 1,2 (row 1, column 2)
        cars[2][0] = "Ferrari";     //stores car in array 2,0 (row 2, column 0)
        cars[2][1] = "Lamborghini"; //stores car in array 2,1 (row 2, column 1)
        cars[2][2] = "Tesla";       //stores car in array 2,2 (row 2, column 2)

        for(int i = 0; i < cars.length; i++) {  //Read as for i is equal to 0, check if i is less than the elements in the first-dimensional array (the first[]), if it passes, execute the block below, then increment i by 1
            System.out.println(); //Print new line for design and readability
            for(int j = 0; j < cars[i].length; j++) { //Read as for j is equal to 0, check if j is less than the elements in the second-dimensional array (the second[]), if it passes, execute the block below, then increment j by 1
                System.out.print(cars[i][j] + " "); //Prints out an i row with j columns, moves to the next row after i increments and iterates through and j prints out the columns again.
            }
        }
         */
        //Another way to write a 2D Array

        //This is the same as the one above. The main difference is that instead of giving each array a set amount of elements, we write the amount of elements we want inside both arrays.
        String[][] cars =   {   {"Camaro", "Corvette", "Silverado"},
                                {"Mustang", "Ranger","F-150"},
                                {"Ferrari", "Lamborghini", "Tesla"}
                            };

        for(int i = 0; i < cars.length; i++) { //Read as for i is equal to 0, check if i is less than the elements in the first-dimensional array (the first[]), if it passes, execute the block below, then increment i by 1
            System.out.println(); //Print new line for design and readability
            for(int j = 0; j < cars[i].length; j++) { //Read as for j is equal to 0, check if j is less than the elements in the second-dimensional array (the second[]), if it passes, execute the block below, then increment j by 1
                System.out.print(cars[i][j] + " "); //Prints out an i row with j columns, moves to the next row after i increments and iterates through and j prints out the columns again.
            }
        }
    }
}
