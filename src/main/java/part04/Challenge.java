package part04;
import javax.swing.JOptionPane;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args) {
        // first make the inputs to ask the questions
        String inputMealCost = JOptionPane.showInputDialog(null, "Whats the meal cost");
        String inputTipPercent = JOptionPane.showInputDialog(null, "Whats the tip percent");
        String inputnumpeeps = JOptionPane.showInputDialog(null, "Whats the number of people");

        // then make the variables for the costs using double and int parsing
        double mealCost = Double.parseDouble(inputMealCost);
        int tipPercent = Integer.parseInt(inputTipPercent);
        int numPeeps = Integer.parseInt(inputnumpeeps);

        // then the math
        double tipAmount = mealCost * tipPercent / 100.0;
        double totalCost = mealCost + tipAmount;
        double costPerPerson = totalCost / numPeeps;

        // represent the whole dollar amount
        int wholeDollarPerPerson = (int) costPerPerson;

        // calculate how much money is collected if everyone only pays their whole dollar share
        int totalCollected = wholeDollarPerPerson * numPeeps;

        int dollarsShort = (int) (totalCost - totalCollected );

        // for the remaining dollars
        int totalCents = (int) (totalCost * 100);
        int centsRemainder = totalCents % (numPeeps * 100);

        //messages
        String message1 = "Meal Cost: $" + mealCost + "\n" + "Tip (" +  tipPercent + "%): $" + tipAmount + "\n" +
                "Total Bill: $" + totalCost + "\n" + "Exact per person: $" + costPerPerson;

        // passing message to showmessage dialog
        JOptionPane.showMessageDialog(null, message1);

        String message2 = "If everyone pays whole dollars:\n" +
                "Each person pays: $" + wholeDollarPerPerson + "\n" + "You are short: $" + dollarsShort;

        JOptionPane.showMessageDialog(null, message2);
    }
}
