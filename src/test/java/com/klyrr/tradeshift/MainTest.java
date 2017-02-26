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
    private final ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();

    private final ByteArrayInputStream validIsoscelesTriangleInput = new ByteArrayInputStream("12\n44\n44\n".getBytes());
    private final ByteArrayInputStream invalidInput = new ByteArrayInputStream("12\n33\nbunny\n".getBytes());

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errorOutput));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setIn(null);
        System.setErr(null);
    }

    @Test
    public void itShouldPrintTheGreeting() {
        System.setIn(validIsoscelesTriangleInput);
        Main.main(null);

        assertTrue(outContent.toString().startsWith("Please enter the length of the three triangle sides:"));
        assertEquals("", errorOutput.toString());
    }

    @Test(timeout = 1000)
    public void itShouldShowAnErrorIfNotANumberWasEntered() {
        System.setIn(invalidInput);
        Main.main(null);

        assertTrue(errorOutput.toString().contains("was not a number but"));
    }

    @Test(timeout = 1000)
    public void itShouldNotShowTheSuccessMessage() {
        System.setIn(invalidInput);
        Main.main(null);

        assertFalse(errorOutput.toString().contains("The given triangle is"));
    }

    @Test(timeout = 1000)
    public void itShouldCalculateTheTriangleType() {
        System.setIn(validIsoscelesTriangleInput);
        Main.main(null);

        assertTrue(outContent.toString().contains(TriangleType.ISOSCELES.toString()));
        assertEquals("", errorOutput.toString());
    }
}