public class SwappingVariable {
    public static void main(String[] args) {
        String x = "Water";         //Value 1
        String y = "Kool-Aid";      //Value 2
        String temp;                //Adding a Temporary variable

        temp = x;       //Take x and put it into a temporary variable
        x = y;          //Take y and put it into the x variable
        y = temp;       //Take the temporary variable that replaced x and put it into y

        System.out.println( "x: " + x);     //Print out the value of x
        System.out.println("y: " + y);      //Print out the value of y
    }
}
