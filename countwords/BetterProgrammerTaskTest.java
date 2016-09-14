package countwords;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {
    @Test
    public void countWords() throws Exception {
        String testString = "Hello World    here   only 6 words";
        int actual = BetterProgrammerTask.countWords(testString);
        int expected = 6;
        assertEquals(expected, actual);
    }

}