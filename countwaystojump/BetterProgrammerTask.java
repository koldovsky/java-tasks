package countwaystojump;

import java.util.ArrayList;
import java.util.List;

public class BetterProgrammerTask {

    public static int countWaysToJump(int N) {
        /*
          A set of stairs has N steps.
          You can jump either 1 or 2 steps at a time.
          For example, if the stairs is N=4 steps, you can reach the end in 5 possible ways:
          1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2
          Please implement this method to
          return the count of the different ways to reach the end of the stairs with N steps.
         */

        // Max steps = N
        // Max Jumps N = j1 + j1 + j1 + j1
        // Replace two j1's with j2: N = j2 + j1 + j1
        // Next:
        // Move j2 till the end N = j1 + j2 + j1
        // Next introduce another j2
        // Move j2 till the end

        int counter = 1;
        ArrayList<Integer> jumps = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            jumps.add(1);
        }
        System.out.println(jumps);

        while (replaceJumps(jumps)) {
            counter++; // new way after replacing
            System.out.println(jumps);
            // move j2 toward the end
            for (int j = 0; j < jumps.size() - 1; j++) {
                if (switchPlaces(jumps, j, j+1)) {
                    counter++;
                    System.out.println(jumps);
                }
            }
        }
        return counter;
    }

    static boolean switchPlaces(List<Integer> list, int idx1, int idx2) {
        if (list.get(idx1) == list.get(idx2)) {
            return false;
        }
        Integer temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        return true;
    }

    // tries to replace two j1 with one j2
    static boolean replaceJumps(List<Integer> jumps) {
        for (int i = 0; i < jumps.size() - 1; i++) {
            if ( (jumps.get(i) == 1) && (jumps.get(i+1) == 1) ) {
                jumps.remove(i+1);
                jumps.remove(i);
                jumps.add(i, 2);
                return true;
            }
        }
        return false;
    }
}
