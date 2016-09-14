package countwords;


public class BetterProgrammerTask {

    public static int countWords(String s) {
        /*
          Please implement this method to return the word count in a given String.

          The words in the parameter String can be separated from each other by any nubmer
          of whitespace symbols (Character.isWhitespace()).
         */
        return s.split("\\s+").length;
    }
}
