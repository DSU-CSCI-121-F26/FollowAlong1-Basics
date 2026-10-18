package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {

    public static void main(String[] args) {
        /*My Guess:
            2
            2
            2.0
            11
            9
            3.0
            6
            correction:
            2.0 is 2.5 and 3.0 is 3.5
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

        //B1
        int people = 4;
        int bill = 50;
        double result = (double) bill / people;
        System.out.println("each person pays $" + result);

        // B2
        int secs = 500;
        int minutes = 60;

        System.out.println(secs + " seconds is " + secs / minutes + " minutes and " + secs % minutes + " seconds");

        // B3
        int num1 = 90;
        int num2 = 85;
        int num3 = 78;
        int resultt = num1 + num2 + num3;

        int avg = resultt / 3;
        // this prints 84 because the int division gets rid of the decimal
        System.out.println("int average: " + avg);

        double avg2 = (double) resultt / 3;
        // this prints 84.33333333333333 with a trailing decimal value because it was cast into a double before being divided
        System.out.println("double average: " + avg2);




    }

}
