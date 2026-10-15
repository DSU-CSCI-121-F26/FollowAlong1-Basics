package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/* Jaidyn
* Miraculous Quests*/
public class Challenge {
    public static void main(String[] args) {
        Scanner tab = new Scanner(System.in);
        System.out.println("Name Protagonist: ");
        String name = tab.nextLine();
        System.out.println("Name Antagonist: ");
        String Anatagonist = tab.nextLine();
        System.out.println("Pick a time: ");
        int time = tab.nextInt();
        tab.nextLine();
        System.out.println("Name a setting: ");
        String Background = tab.nextLine();
        System.out.println(name + " started patrol on " +
                Background + " \nat the time of " + time +", \nthere were huge problems prevelant and " + Anatagonist
        + " \nwas found responsible for them\n"
        +"Plot twist: " + Anatagonist + " was the hero all along, " + name + " was our villain the whole time");



    }

}
