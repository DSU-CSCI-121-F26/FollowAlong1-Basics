package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
import javax.swing.*;
public class Challenge {
    public static void main(String[] args) {
// Ask for meal cost (double)
        double mealCost = Double.parseDouble(
                JOptionPane.showInputDialog("Enter the meal cost:")
        );

        // Ask for tip percent (int)
        int tipPercent = Integer.parseInt(
                JOptionPane.showInputDialog("Enter the tip percent:")
        );

        // Ask for number of people (int)
        int people = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of people:")
        );

        // Tip calculation
        double tip = mealCost * tipPercent / 100.0;

        // Total cost
        double total = mealCost + tip;

        // Amount each person pays (decimal)
        double eachPerson = total / people;

        // Whole-dollar amount each person pays (using cast)
        int wholeDollarsEach = (int) eachPerson;

        // Use % to find how many dollars short you are
        // Total whole dollars collected:
        int totalWholeCollected = wholeDollarsEach * people;

        // How many dollars short?
        double shortAmount = total - totalWholeCollected;

        // First message box
        JOptionPane.showMessageDialog(
                null,
                "Tip: $" + tip + "\nTotal: $" + total + "\nEach person pays $" + eachPerson
        );

        // Second message box
        JOptionPane.showMessageDialog(
                null,
                "If everyone pays $" + wholeDollarsEach + ", you are still $" + shortAmount + " short."
        );
    }


}
