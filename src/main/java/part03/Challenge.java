package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a hero");
        String hero = scanner.nextLine();

        System.out.println("Name a villian");
        String villian = scanner.nextLine();

        System.out.println("Pick a whole number:");
        int number = scanner.nextInt();
    //Fix for the trap
    //nextInt() leaves a left over new line
        scanner.nextLine();

        System.out.println("Name a place:");
        String place = scanner.nextLine();

        //Story of atleast 3 senetences
        System.out.println(hero + " traveled braverlu across "+ place+ ".");
        System.out.println("There were"+number+" challenges,and "+villian);
        System.out.println("The final battle shook the entiore land.");

        //Swap two answers
        String temp = hero;
        hero = villian;
        villian = hero;

        //plot twist
        System.out.println("Plot twist: " + hero + " was the true hero all along, and " + villian + " was the real villain!");

    }

}
