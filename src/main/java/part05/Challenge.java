package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
import java.util.Random;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player Enter your name: ");

        String player1Name = scanner.nextLine();

        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;

        int dice2 = random.nextInt(6) + 1;

        int diceTotal = dice1 + dice2;

        int higherDice = Math.max(dice1, dice2);

        int lowerDice = Math. min(dice1, dice2);

        int difference = Math.abs(dice1 - dice2);

        double average = diceTotal / 2.0;

        long roundedAvg = Math.round(average);

        System.out.println("--- Dice Roll Results for " + player1Name + " ---");
        System.out.println("First Roll: " + dice1 + " | Second Roll: " + dice2);
        System.out.println("Combined Sum: " + diceTotal);
        System.out.println("Highest Value: " + higherDice);
        System.out.println("Lowest Value: " + lowerDice);
        System.out.println("Difference: " + difference);
        System.out.println("Average Score: " + average);
        System.out.println("Rounded Average: " + roundedAvg);

        scanner.close();


    }

}
