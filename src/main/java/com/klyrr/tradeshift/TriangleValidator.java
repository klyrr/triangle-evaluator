package com.klyrr.tradeshift;

/**
 * As I am looking at triangles right now there might be the possibility that we might need such
 * an evaluator for other geometrical figures as well.
 *
 * But regarding the YAGNI concept I ignore this until we really need this.
 */
class TriangleValidator {

    /**
     *
     * @param sideA side A of the triangle
     * @param sideB side A of the triangle
     * @param sideC side A of the triangle
     *
     * @return the actual type of the triangle
     */
    static TriangleType evaluateType(int sideA, int sideB, int sideC) {

        if (sideA == sideB && sideB == sideC) {
            return TriangleType.EQUILATERAL;
        }

        if (sideA == sideB || sideB == sideC) {
            return TriangleType.ISOSCELES;
        }

        return TriangleType.SCALENE;
    }

}
