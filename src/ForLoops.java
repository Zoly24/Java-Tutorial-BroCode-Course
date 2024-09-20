public class ForLoops {

    public static void main(String[] args) {

        //for loop = executes a block of code a limited amount of times
        //for loops setup = for(index, condition, increment/decrement)

        for(int i = 1; i<= 10; i++) { //Read as for i is equal to 1, check i is less than or equal to 10. If true then run the block of code and increment by 1
            System.out.print(i + " "); //Prints out current i plus a space
        } //When the for loop reaches the end, it loops back around to the top and checks if the condition is still meet. If so then run it again. If not then continue down the page.

        System.out.println(); //Prints new line for organization

        for(int i = 10; i >= 1; i--) { //Read as for i is equal to 10, check i is greater than or equal to 1. If true then run the block of code and decrement by 1
            System.out.print(i + " ");  //Prints out current i plus a space
        } //When the for loop reaches the end, it loops back around to the top and checks if the condition is still meet. If so then run it again. If not then continue down the page.

        System.out.println(); //Prints new line for organization

        for(int i = 1; i<= 10; i += 2) { //Read as for i is equal to 1, check i is less than or equal to 10. If true then run the block of code and increment by 2
            System.out.print(i + " ");  //Prints out current i plus a space
        } //When the for loop reaches the end, it loops back around to the top and checks if the condition is still meet. If so then run it again. If not then continue down the page.

        System.out.println(); //Prints new line for organization

        for(int i = 1; i <= 10;) {//Read as for i is equal to 1, check i is less than or equal to 10. If true then run the block of code.
            System.out.print(i + " ");  //Prints out current i plus a space
            i += 2; //Increments the i value by 2 just like the loop above. They do the same thing.
        } //When the for loop reaches the end, it loops back around to the top and checks if the condition is still meet. If so then run it again. If not then continue down the page.
    }
}
