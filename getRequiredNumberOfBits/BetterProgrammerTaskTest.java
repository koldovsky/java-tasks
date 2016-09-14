package getRequiredNumberOfBits;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {
    @Test
    public void getRequiredNumberOfBits_5() throws Exception {
        int n = 5;
        int expected = 3;
        int actual = BetterProgrammerTask.getRequiredNumberOfBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void getRequiredNumberOfBits_6() throws Exception {
        int n = 6;
        int expected = 3;
        int actual = BetterProgrammerTask.getRequiredNumberOfBits(n);
        assertEquals(expected, actual);
    }

    @Test
    public void getRequiredNumberOfBits_7() throws Exception {
        int n = 7;
        int expected = 4;
        int actual = BetterProgrammerTask.getRequiredNumberOfBits(n);
        assertEquals(expected, actual);
    }

}