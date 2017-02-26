package com.klyrr.tradeshift;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleValidatorTest {

    private final int A_TRIANGLE_SIDE = 42;
    private final int ANOTHER_TRIANGLE_SIDE = A_TRIANGLE_SIDE + A_TRIANGLE_SIDE;
    private final int AND_ANOTHER_TRIANGLE_SIDE = A_TRIANGLE_SIDE + A_TRIANGLE_SIDE + A_TRIANGLE_SIDE;

    @Test
    public void itShouldFindAnEquilateralTriangle() throws Exception {
        Assert.assertEquals(TriangleType.EQUILATERAL, TriangleValidator.evaluateType(A_TRIANGLE_SIDE, A_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldNotFindAnEquilateralTriangle() throws Exception {
        Assert.assertNotEquals(TriangleType.EQUILATERAL, TriangleValidator.evaluateType(ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldFindAnIsoscelesTriangle() throws Exception {
        Assert.assertEquals(TriangleType.ISOSCELES, TriangleValidator.evaluateType(ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldNotFindAnIsoscelesTriangle() throws Exception {
        Assert.assertNotEquals(TriangleType.ISOSCELES, TriangleValidator.evaluateType(ANOTHER_TRIANGLE_SIDE, AND_ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldFindAnScaleneTriangle() throws Exception {
        Assert.assertEquals(TriangleType.SCALENE, TriangleValidator.evaluateType(ANOTHER_TRIANGLE_SIDE, AND_ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }
}