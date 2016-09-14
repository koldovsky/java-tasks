package retainpositivenumbers;

import java.util.*;


public class BetterProgrammerTask {

    public static int[] retainPositiveNumbers(int[] a) {
        /*
          Please implement this method to
          return a new array with only positive numbers from the given array.
          The elements in the resulting array shall be sorted in the ascending order.
         */
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                list.add(a[i]);
            }
        }
        Collections.sort(list);
        int[] result = new int[list.size()];
        int j = 0;
        for (Integer element: list) {
            result[j] = element;
            j++;
        }
        return result;
    }
}
