package part04;

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
//imports the Joption Pane
import javax.swing.*;
//declares a public class called GUI
public class GUI {
    //the main where the program runs
    public static void main(String[] args) {
        //Shows an input dialog with the variable name
        String name = JOptionPane.showInputDialog("Enter your name");
        //Shows the message dialog that greets the user hello
        JOptionPane.showMessageDialog(null,"Hello "+name);
        //int variable called age but it comes in as a string so the parse int switches it to a number

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//Displays the message with the age
        JOptionPane.showMessageDialog(null,"You are "+age+" years old");
//double variable called height that parse the double first because it will input string
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height"));
        //displays a message showing teh user's height
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }


}
