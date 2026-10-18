package part05;
import java.util.Scanner;
import java.util.Random;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Ask for the player's name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // 2. Roll two six-sided dice (1 to 6)
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int total = die1 + die2;

        // 3. Print the name, both dice, and the total
        System.out.println(name + " rolled a " + die1 + " and a " + die2);
        System.out.println("Total: " + total);

        // 4. Print the higher die using Math.max
        int higherDie = Math.max(die1, die2);
        System.out.println("Higher die: " + higherDie);

        // 5. Print the lower die using Math.min
        int lowerDie = Math.min(die1, die2);
        System.out.println("Lower die: " + lowerDie);

        // 6. Print the difference using Math.abs
        int difference = Math.abs(die1 - die2);
        System.out.println("Difference: " + difference);

        // 7. Print the average using 2.0 for decimal division
        double average = total / 2.0;
        System.out.println("Average: " + average);

        // 8. Print the average rounded using Math.round
        long roundedAverage = Math.round(average);
        System.out.println("Average, rounded: " + roundedAverage);

        scanner.close();

    }

}
