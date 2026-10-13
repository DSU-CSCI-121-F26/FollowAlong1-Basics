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
import java.math.*;
import static java.lang.Math.sqrt;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
          7
          2.5
          8
          7.0
          3
          2
          2
         -2
         I was wrong on the last two lines being 21 and 20. I was thinking if the floor of 2 is 1 then -2.1 has to be just -2.0,
         I also did not even realize it was a double.
         corrected:
         3.0
         -3.0
*/
        System.out.println(Math.max(7, -3));
        System.out.println(Math.min(2.5, 9));
        System.out.println(Math.abs(-8));
        System.out.println(sqrt(49));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.floor(-2.1));

        //B1
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        System.out.println("you rolled a " + dice);

        //B2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();

        scanner.nextLine();


        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);

        long roundedArea = Math.round(area);
        System.out.println("Area, rounded: " + roundedArea);

        //B3
        double distance = Math.sqrt((4-1)*(4-1)+(6-2)*(6-2));
        System.out.println("Distance: " + distance);


    }

}
