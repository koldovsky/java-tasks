package countwaystojump;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {
    @Test
    public void countWaysToJump4() throws Exception {
        int actual = BetterProgrammerTask.countWaysToJump(4);
        assertEquals(5, actual);
    }

    @Test
    public void countWaysToJump3() throws Exception {
        int actual = BetterProgrammerTask.countWaysToJump(3);
        assertEquals(3, actual);
    }

    @Test
    public void countWaysToJump6() throws Exception {
        int actual = BetterProgrammerTask.countWaysToJump(6);
        assertEquals(10, actual);
    }

    @Test
    public void countWaysToJump7() throws Exception {
        int actual = BetterProgrammerTask.countWaysToJump(7);
        assertEquals(13, actual);
    }
}