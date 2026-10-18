package part05;
import java.util.Random;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3546s
//        rewatch 59:06–61:29 for the Math methods, 64:54–68:28 for Random
// Guide: GUIDE.md in this folder, steps 2–6 and 12–16
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {

    public static void main(String[] args) {
        System.out.println(Math.max(7, -3));
        System.out.println(Math.min(2.5, 9));
        System.out.println(Math.abs(-8));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(-2.1));
        /*
        7
        2.5
        8
        7 wrong
        3 wrong
        3
        2
        3 wrong
        -3 wrong
         */
        /* I was wrong at the doubles I forgot square roots always end in a double for the others
         everytime it rounds to a whole number i default to writing an int */

        Random roll = new Random();
        Scanner circle = new Scanner(System.in);

        //B2
        int dice = roll.nextInt(6)+1;
        System.out.println("\nYou rolled a " + dice);
        int radius = circle.nextInt();
        System.out.println("Enter the radius: " + radius);
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
        long round = Math.round(area);
        System.out.println("Area, rounded: " + round);

        //B3

        double x1 = 1, y1 = 2;
        double x2 = 4, y2 = 6;

        //distance between points 1,2 and 4,6
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("\nDistance: " + distance);

    }

}
