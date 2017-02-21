package com.klyrr.tradeshift;

/**
 * As I am looking at triangles right now there might be the possibility that we might need such
 * an evaluator for other geometrical figures as well.
 *
 * But regarding the YAGNI concept I ignore this until we really need this.
 */
public class TriangleValidator {

    /**
     *
     * @param sideA
     * @param sideB
     * @param sideC
     * @return
     */
    public static TriangleType evaluateType(int sideA, int sideB, int sideC) {
        return TriangleType.EQUILATERAL;
    }

}
