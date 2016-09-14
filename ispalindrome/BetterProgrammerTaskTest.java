package ispalindrome;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {

    @org.junit.Test
    public void isPalindrome_Palindrome() throws Exception {
        BetterProgrammerTask cut = new BetterProgrammerTask();
        String palindrome = "helleh";
        assertTrue(cut.isPalindrome(palindrome));
    }

    @org.junit.Test
    public void isPalindrome_NotPalindrome() throws Exception {
        BetterProgrammerTask cut = new BetterProgrammerTask();
        String palindrome = "hello";
        assertFalse(cut.isPalindrome(palindrome));
    }

}