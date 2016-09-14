package getCorrectChange;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterProgrammerTaskTest {

    @Test
    public void getChangeTest() {
        int cents = 164;
        BetterProgrammerTask.Change expected = new BetterProgrammerTask.Change(1, 2, 1, 0, 4);
        BetterProgrammerTask.Change actual = BetterProgrammerTask.getCorrectChange(cents);
        assertEquals(expected.getDollars(), actual.getDollars());
        assertEquals(expected.getQuarters(), actual.getQuarters());
        assertEquals(expected.getNickels(), actual.getNickels());
        assertEquals(expected.getDimes(), actual.getDimes());
        assertEquals(expected.getCents(), actual.getCents());
    }


}