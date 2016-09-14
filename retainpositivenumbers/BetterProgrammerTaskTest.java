package retainpositivenumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {
    @Test
    public void retainPositiveNumbers() throws Exception {
        int[] arr = new int[]{1,2,-1,5,-6,10,3};
        int[] expected = new int[]{1,2,3,5,10};
        int[] actual = BetterProgrammerTask.retainPositiveNumbers(arr);
        assertArrayEquals(expected, actual);
    }

}