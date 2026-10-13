package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* My Guess:
        prints 2,2,2.5,11,9,3.5,6
         */
        int n = 10;
        System.out.println(n / 4);
        System.out.println(n % 4);
        System.out.println(n / 4.0);
        n++;
        System.out.println(n);
        n--;
        n--;
        System.out.println(n);
        System.out.println((double) 7 / 2);
        System.out.println(7 / 2 * 2);

        int people = 4;
        double bill = 50;

        double eachPersonPays = bill/people;
        System.out.println("Each person pays $"+ eachPersonPays);

        int totalSeconds = 500;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " second is "+minutes+" minutes and "+seconds+ " seconds");

        //B3
        int score1 = 90;
        int score2 = 85;
        int score3 = 78;

        int sum = score1+score2+score3;

        int averageSum = sum / 3;
        System.out.println("int average:"+averageSum);

        double averageDouble = (double)sum/3;
        System.out.println("double average:"+averageDouble);


    }
}
