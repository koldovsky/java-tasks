package removeduplicates;

import ispalindrome.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {

    BetterProgrammerTask task = new BetterProgrammerTask();

    @Test
    public void removeDuplicates_Array_Removed() throws Exception {
        int[] parameter = new int[] {2,1,2,3};
        int[] expected = new int[] {2,1,3};
        int[] actual = task.removeDuplicates(parameter);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeDuplicates_Array_NotRemoved() throws Exception {
        int[] parameter = new int[] {2,1,5,3};
        int[] expected = new int[] {2,1,5,3};
        int[] actual = task.removeDuplicates(parameter);
        assertArrayEquals(expected, actual);
    }

}