package ispalindrome;

public class BetterProgrammerTask {

    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
        StringBuffer buf = new StringBuffer(s);
        String reversed = buf.reverse().toString();
        return s.equals(reversed);
    }
}