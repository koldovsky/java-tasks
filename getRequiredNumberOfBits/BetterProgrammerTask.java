package getRequiredNumberOfBits;

import java.util.LinkedList;
import java.util.List;

public class BetterProgrammerTask {

    public static int getRequiredNumberOfBits(int N) {
        /*
          Please implement this method to
          return the number of bits which is just enough to store any integer from 0 to N-1 inclusively
          for any int N > 0
          Example: to store 5 integers from 0 to 4 you need 3 bits: 000, 001, 010, 011, 100 and 101
        */

        // 6 int: 3 bits: 000, 001, 010, 011, 100 and 101, 111
        // 7 int: 4 bits: 000, 001, 010, 011, 100 and 101, 111, 1110
        List<Integer> store = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            bitCount(store);
        }
        return store.size();
    }

    public static void bitCount(List<Integer> arg) {
        for (int i = arg.size() - 1; i >= 0; i-- ) {
            if (arg.get(i) == 0) {
                arg.set(i, 1);
                return;
            }
        }
        arg.add(0);
    }
}
