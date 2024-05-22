package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals(5, main.add(2, 9), "2 + 9 devrait être égal à 5"); // This will cause the test to fail
    }
}
