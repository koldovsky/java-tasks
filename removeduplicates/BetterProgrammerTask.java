package removeduplicates;


import java.util.LinkedList;

public class BetterProgrammerTask {

    public static int[] removeDuplicates(int[] a) {
        /*
          Please implement this method to
          remove all duplicates from the original array. Retain the order of the elements and
          always retain the first occurrence of the duplicate elements.
          For example, parameter: {2,1,2,3}, result: {2,1,3}
         */
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (!result.contains(a[i])) {
                result.add(a[i]);
            }
        }
        int[] retArray = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            retArray[j] = result.get(j);
        }
        return retArray;
    }
}
