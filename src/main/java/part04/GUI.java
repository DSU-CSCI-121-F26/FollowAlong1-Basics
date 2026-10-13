package part04;
import javax.swing.JOptionPane;
// imports resources to create pop up boxes for a GUI

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.
// publicly accessed class for a GUI
public class GUI {
    //start of the program
    public static void main(String[] args) {
        // initializes a string name assigned to the joptionpane which will pull up a menu asking for your name with an ok to exit
        String name = JOptionPane.showInputDialog("Enter your name");

        // null just places the gui in the middle of the screen
        //show message dialog makes a message on the screen outputting hello and your name
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // wrap the JOptionPane inside an Integer.parseInt so it turns the String into an int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        // will show a message in the gui saying you are the age you passed to the gui years old
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        // when using a double its Double.parse double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        // prints to gui you are the height you entered cm tall
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }

}
