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
Hi I am skye this is my story on life
 */
public class Challenge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Hi, what is your name?");
        String userName = scnr.nextLine();

        System.out.println("Whats up " + userName + "! How much money you got twin?");
        System.out.println("(ENTER A NUMERICAL VALUE)");
        long userMoney = scnr.nextLong();

        if (userMoney <= 1000) {
            System.out.println("Dang brother get your funds up");
        }
        else if (userMoney >= 100000) {
            System.out.println("Okayyyyy " + userName + " I see you send me some zelle: 9728365319");
        }
        else {
            System.out.println("You for real dog???");
        }

        System.out.println();
        System.out.println("Well, " + userName + " it was nice to meet you you have a great day man");

    }

}
