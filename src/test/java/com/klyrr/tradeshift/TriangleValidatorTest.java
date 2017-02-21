package com.klyrr.tradeshift;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleValidatorTest {


    @Test
    public void itShouldFindAnEquilateralTriangle() throws Exception {
        Assert.assertEquals(TriangleType.EQUILATERAL, TriangleValidator.evaluateType(20, 20, 20));
    }
}