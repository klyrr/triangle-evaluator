package com.klyrr.tradeshift;

import org.junit.Assert;
import org.junit.Test;

public class TriangleEvaluatorTest {

    private final int A_TRIANGLE_SIDE = 42;
    private final int ANOTHER_TRIANGLE_SIDE = A_TRIANGLE_SIDE + A_TRIANGLE_SIDE;
    private final int AND_ANOTHER_TRIANGLE_SIDE = A_TRIANGLE_SIDE + A_TRIANGLE_SIDE + A_TRIANGLE_SIDE;

    @Test
    public void itShouldFindAnEquilateralTriangle() throws Exception {
        Assert.assertEquals(TriangleType.EQUILATERAL, TriangleEvaluator.evaluateType(A_TRIANGLE_SIDE, A_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldNotFindAnEquilateralTriangle() throws Exception {
        Assert.assertNotEquals(TriangleType.EQUILATERAL, TriangleEvaluator.evaluateType(ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldFindIsoscelesTriangles() throws Exception {
        Assert.assertEquals(TriangleType.ISOSCELES, TriangleEvaluator.evaluateType(ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
        Assert.assertEquals(TriangleType.ISOSCELES, TriangleEvaluator.evaluateType(A_TRIANGLE_SIDE, ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
        Assert.assertEquals(TriangleType.ISOSCELES, TriangleEvaluator.evaluateType(A_TRIANGLE_SIDE, A_TRIANGLE_SIDE, ANOTHER_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldNotFindAnIsoscelesTriangle() throws Exception {
        Assert.assertNotEquals(TriangleType.ISOSCELES, TriangleEvaluator.evaluateType(ANOTHER_TRIANGLE_SIDE, AND_ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }

    @Test
    public void itShouldFindAnScaleneTriangle() throws Exception {
        Assert.assertEquals(TriangleType.SCALENE, TriangleEvaluator.evaluateType(ANOTHER_TRIANGLE_SIDE, AND_ANOTHER_TRIANGLE_SIDE, A_TRIANGLE_SIDE));
    }
}