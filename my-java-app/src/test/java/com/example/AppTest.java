package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(6, App.add(3, 3));
        assertEquals(15, App.add(7, 8));
        assertEquals(0, App.add(0, 0));
        assertEquals(-1, App.add(2, -3));
    }
}
