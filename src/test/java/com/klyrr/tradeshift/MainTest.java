package com.klyrr.tradeshift;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final ByteArrayInputStream validInput = new ByteArrayInputStream("12\n33\n44\n".getBytes());

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void itShouldPrintTheGreeting() {

        System.setIn(validInput);
        Main.main(null);

        assertTrue(outContent.toString().startsWith("Please enter the length of the three triangle sides:"));
    }
}