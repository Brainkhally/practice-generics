package org.itstep.step02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class PairDriverTest {

    @Test
    public void testPairDriverLargestStadiumLargestAtEnd() {
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<String, Integer>("A", 1);
        stadiums[1] = new Pair<String, Integer>("B", 2);
        stadiums[2] = new Pair<String, Integer>("C", 3);
        assertEquals("C", PairDriver.largestStadium(stadiums));
    }

    @Test
    public void testPairDriverLargestStadiumLargestAtStart() {
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<String, Integer>("A", 3);
        stadiums[1] = new Pair<String, Integer>("B", 2);
        stadiums[2] = new Pair<String, Integer>("C", 1);
        assertEquals("A", PairDriver.largestStadium(stadiums));
    }

    @Test
    public void testPairDriverLargestStadiumLargestInMiddle() {
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<String, Integer>("A", 3);
        stadiums[1] = new Pair<String, Integer>("B", 1);
        stadiums[2] = new Pair<String, Integer>("C", 2);
        assertEquals("A", PairDriver.largestStadium(stadiums));
    }
}
