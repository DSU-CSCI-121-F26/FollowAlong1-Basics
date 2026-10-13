package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3546s
//        rewatch 59:06–61:29 for the Math methods, 64:54–68:28 for Random
// Guide: GUIDE.md in this folder, steps 2–6 and 12–16
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

import java.util.Random;
import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
        print 7,2.5,8,7,3,2,3,-3
         */
        System.out.println(Math.max(7, -3));
        System.out.println(Math.min(2.5, 9));
        System.out.println(Math.abs(-8));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(-2.1));

        Random random = new Random();
        int roll = random.nextInt(6)+1;
        System.out.println("You rolled a "+roll);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");

        double radius = scanner.nextDouble();

        double area = Math.PI*radius*radius;

        System.out.println("Area: "+area);

        long roundedArea = Math.round(area);

        System.out.println("Rounded area: "+roundedArea);

        int x1 = 1;
        int y1 = 2;

        int x2 = 4;
        int y2 = 6;

        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance: "+distance);
    }

}
