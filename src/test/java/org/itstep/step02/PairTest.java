package org.itstep.step02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PairTest {

    @Test
    public void testPairConstuctorRuns() {
        Pair<String, Integer> p1 = new Pair<>("A", 1);
        Pair<Integer, String> p2 = new Pair<>(1, "A");
    }

    @Test
    public void testPairGetFirst() {
        Pair<String, Integer> p1 = new Pair<>("A", 1);
        assertEquals("A", p1.getFirst());

        Pair<Integer, String> p2 = new Pair<>(1, "A");
        assertEquals(Integer.valueOf(1), p2.getFirst());

    }

    @Test
    public void testPairGetSecond() {
        Pair<String, Integer> p1 = new Pair<>("A", 1);
        assertEquals(Integer.valueOf(1), p1.getSecond());

        Pair<Integer, String> p2 = new Pair<>(1, "A");
        assertEquals("A", p2.getSecond());
    }

    @Test
    public void testPairToString() {
        Pair<String, Integer> p1 = new Pair<>("A", 1);
        assertEquals("<A, 1>", p1.toString());
    }
}
