package part03;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/*
my name is juwan
my madlibs story is going to be about a museum mystery where a thief stole an historical item
 */
public class Challenge {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name a detective");
    String detective = scanner.nextLine();

    System.out.println("Pick a number");
    int number = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Name a suspect");
    String suspect = scanner.nextLine();

    System.out.println("Name historic artifact");
    String artifacts = scanner.nextLine();

    System.out.println("Detective " + detective + " arrived at the museum to investigate a ballsy midnight robbery.");
    System.out.println("The thief had managed to steal " + number + " rare items, including the priceless " + artifacts + ", leaving " + suspect + " as the prime suspect.");

        String temp = detective;
        detective = suspect;
        suspect = temp;

    System.out.println("Plot twist: " + detective + " was the innocent investigator framing everyone, while " + suspect + " was the mastermind behind the entire heist!");

    scanner.close();




    }

}
