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
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

        System.out.println(Math.max(7, -3));
        System.out.println(Math.min(2.5, 9));
        System.out.println(Math.abs(-8));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(-2.1));

        /*
        i guess that all the things will be outputted  because the variables are blue
         */

        int dice = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + dice);

        System.out.println();

        System.out.println("Enter the radius: ");
        double radius = scnr.nextDouble();
        double area = (Math.PI * radius * radius);
        System.out.println("Area: " + area);
        int areaRounded = Math.toIntExact(Math.round(area));
        System.out.println("Area, rounded: " + areaRounded);

        System.out.println();

        double distance = Math.sqrt((4-1) * (4-1) + (6-2) * (6-2));
        System.out.println("Distance: " + distance);






    }

}
