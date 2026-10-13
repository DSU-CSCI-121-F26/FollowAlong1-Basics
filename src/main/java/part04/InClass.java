package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        rewatch 48:08–52:25 for + - * / % ++ and casting
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we do the pizza party math together, here.
        int totalSlices = 21;
        int slicesPerPizza = 8;

        int wholePizzas = totalSlices / slicesPerPizza;
        int leftovers = totalSlices % slicesPerPizza;
        double exactPizzas = totalSlices / 8.0;

        System.out.println("Slices needed: " + totalSlices);
        System.out.println("Whole pizzas: " + wholePizzas);
        System.out.println("Slices left over: " + leftovers);
        System.out.println("Exact pizzas: " + exactPizzas);

// One more friend shows up
        int friends = 7;
        friends++;

        System.out.println("A friend shows up. Friends: " + friends);



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error (or the wrong output). Fix it. Run it. Then do the next line.

        int share = (int)(10 / 4.0);//cast
        System.out.println("Total: " + (5 + 3));//so it actually ads
        System.out.println(totalSlices / (friends - 1));

    }
}
