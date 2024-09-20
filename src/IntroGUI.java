import javax.swing.JOptionPane; //imports JOptionPane Class Library

public class IntroGUI {


    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter a your name");                 //Adds question about the User's Name using showInputDialog from JOptionPane
        JOptionPane.showMessageDialog(null, "Hello, " + name);  //Results from the Dialog are show through showMessageDialog

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));                      //Adds question about the User's Age but using an Integer parse to change it from String to Integer value so we can store in an int variable 'age'
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");   //Results from the Dialog are shown through showMessageDialog

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm)"));   //Add question about the User's Height but using a Double parse to change it from String to Double value so we can store in a double variable 'height'
        JOptionPane.showMessageDialog(null, "You are " + height + " cm");       //Results from the Dialog are shown through showMessageDialog

    }
}
