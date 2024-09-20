public class Expressions {
    public static void main(String[] args) {
        int addition = 10;
        int subtraction = 10;
        int multiplication = 10;
        int division = 10;
        int module = 10;


        //Long Method
        /*
        addition = addition + 4;
        subtraction = subtraction - 4;
        multiplication = multiplication * 4;
        division = division / 4;
        module = module % 4;
         */

        //Short Method
        /*
        addition += 4;
        subtraction-= 4;
        multiplication *= 4;
        division /= 4;
        module %= 4;
        */

        //Incrementing or Decrementing
        /*
        addition++;     <-- addition += 1;
        subtraction--;  <-- subtraction -= 1;
         */


        System.out.println("Here is the initial value 10 with all operation by 4:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Module: " + module);

        System.out.println();



        /*
        expressions = operands & operators
        operands = values, variables, numbers, quantity
        operators = + (addition)    - (subtraction)    * (multiplication)    / (division)    % (module)
        Integer division truncated the decimals. Truncating means ignoring the decimals
        Casting a value from int to double would be doing (double) (int value)
        Casting a value from double to int would be doing (int) (double value)
         */


    }
}
