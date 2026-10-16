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

        /*
        its going to output all the outputs so first is gonna be 2, then, 2 again because thats what is remaining,
        then its gonna output the actual answer 2.5 because its a double, adding 1 to n value so 11, subtracting 1 twice so
        equivalent to 9, dividing 7/2 and outputting 3.5 because its going to type cast into a double, and for the last one
        it is outputting 6 because its all integer division initially so 7/2 = 3 and * 2 = 6.
         */

        int people = 4;
        double bill = 50;

        double amountPaidEach = bill / people;
        System.out.println(amountPaidEach);

        int seconds = 500;
        int minutes = seconds / 60;
        int seconds2 = seconds % 60;
        System.out.println("Time = " + minutes + " minutes and " + seconds2 + " seconds");

        int testScore1 = 67;
        int testScore2 = 82;
        int testScore3 = 93;
        int average = (testScore1 + testScore2 + testScore3) / 3;
        double averageDub = ((double) (testScore1 + testScore2 + testScore3) / 3);
        System.out.println("Int average = " + average);
        System.out.println("Double average = " + averageDub);


    }

}
