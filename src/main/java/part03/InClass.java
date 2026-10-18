package part03;
//
import java.util.Scanner;
// Type the Scanner import line here, on the empty line below.


// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we ask for two team names together, here, and swap them.

        // Creates a scanner object to read user input from the console
         Scanner scanner = new Scanner(System.in);
        // Get team names from user input
        System.out.println("Home team: ");
        String home = scanner.nextLine();

        System.out.println("Away team: ");
        String away = scanner.nextLine();
        // Outputs initial game state
        System.out.println("Home team: " + home);
        System.out.println("Away team: " + away);
        System.out.println("Before: " + home + " vs " + away);

        /*Swap home and away teams (currently missing temporary variable logic)
        String temp = home;
        home = away;
        away = home; */

        // Output game state after swap
        System.out.println("After halftime: " + home + " vs " + away);

        // Swap the two vari


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        System.out.println("Home: " + home);
        Scanner keyboard = new Scanner(System.in);
        String coach = "Coach K";

    }
}
