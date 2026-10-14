package com.fantrade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ScoreTest {

    @Test
    public void testPPRScoring() {

        PlayerStats stats =
            new PlayerStats(7, 105, 1);

        double result =
            ScoreTest.calculatePPRPoints(stats);

        assertEquals(23.5, result);
    }
}
