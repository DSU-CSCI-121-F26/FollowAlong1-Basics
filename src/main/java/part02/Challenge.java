package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args) {
    String name;
    name = "Thunder Dragon";


    int level = 27;
    long gold = 900000000000000L;
    double health = 92.75;
    float speed = 4.5f;
    boolean files = true;
    char rank = 'S';

    //Title
        System.out.println("=======  Character Card ======");
        System.out.println("Name:\t"+name);
        System.out.println("Level:\t"+level);
        System.out.println("Gold:\t"+gold);
        System.out.println("Health:\t"+health);
        System.out.println("Speed:\t"+speed);
        System.out.println("Files:\t"+files);
        System.out.println("Rank:\t"+rank);
    }

}
