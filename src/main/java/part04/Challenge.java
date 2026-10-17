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

        // 2. Ask three questions using showInputDialog
        String mealInput = JOptionPane.showInputDialog("Enter the cost of the meal:");
        String tipInput = JOptionPane.showInputDialog("Enter the tip percent:");
        String peopleInput = JOptionPane.showInputDialog("Enter the number of people:");

        // 3. Parse using Double.parseDouble and Integer.parseInt
        double mealCost = Double.parseDouble(mealInput);
        int tipPercent = Integer.parseInt(tipInput);
        int numPeople = Integer.parseInt(peopleInput);

        // 4. Calculate tip, total, and individual share using *, /, and +
        double tipAmount = mealCost * tipPercent / 100.0;
        double totalCost = mealCost + tipAmount;
        double eachPersonPays = totalCost / numPeople;

        // 5. Use an (int) cast to get the whole-dollar amount each person can pay
        int wholeDollarPay = (int) eachPersonPays;

        // 6. Use % to find how many dollars short you are if everyone pays the whole-dollar amount
        int totalCents = (int) Math.round(totalCost * 100);
        int peopleCents = numPeople * 100;
        int shortCents = totalCents % peopleCents;
        int shortDollars = shortCents / 100;

        // 7. Show answers using showMessageDialog with at least two boxes
        String box1 = "Tip: $" + tipAmount + "\n" + "Total: $" + totalCost + "\n" + "Each person pays $" + eachPersonPays;

        String box2 = "If everyone pays $" + wholeDollarPay + ", you are still $" + shortDollars + " short.";

        JOptionPane.showMessageDialog(null, box1);
        JOptionPane.showMessageDialog(null, box2);
    }
}




