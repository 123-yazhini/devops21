package com.example.oddnumbers;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OddNumbersTest {
    @Test
    public void testOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                assertTrue(i % 2 != 0);
            }
        }
    }
}
