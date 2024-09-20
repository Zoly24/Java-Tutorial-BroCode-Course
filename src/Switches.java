public class Switches {
    public static void main(String[] args) {
        //switch = statement that allows a variable to be tested for equality against a list of values
        String day = "Monday"; //String that defines one of the days of the week

        switch(day) { //Putting the String variable 'day' in the parenthesis tests for equality between the cases.
            case "Sunday": System.out.println("It is Sunday!"); //If Sunday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            case "Monday": System.out.println("It is Monday!");//If Monday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            case "Tuesday": System.out.println("It is Tuesday!");//If Tuesday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            case "Wednesday": System.out.println("It is Wednesday!");//If Wednesday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            case "Thursday": System.out.println("It is Thursday!");//If Thursday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            case "Friday": System.out.println("It is Friday!");//If Friday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            case "Saturday": System.out.println("It is Saturday!");//If Saturday is in the string, then this case goes.
            break; //Ends this case so that it doesn't claim other cases as true if the above case is true.
            default: System.out.println("That is not a day of the week!");//If there is no case that equals the 'String day' statement, this will output by DEFAULT
        }
    }
}
