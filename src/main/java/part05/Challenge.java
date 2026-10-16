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
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);


        System.out.println("What is your name: ");
        String name = scnr.nextLine();

        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println(name + " rolled a " + dice1 + " and " + dice2);

        int total = dice1 + dice2;
        System.out.println("Total: " + total);

        System.out.println("Higher Die: " + Math.max(dice1, dice2));
        System.out.println("Lower Die: " + Math.min(dice1, dice2));

        System.out.println("Difference: " + Math.abs((dice1 - dice2)));

        double average = (double) (dice1 + dice2) / 2;
        System.out.println("Average: " + average);

        int avgRound = Math.toIntExact(Math.round(average));
        System.out.println("Average, rounded: " + avgRound);



    }

}
