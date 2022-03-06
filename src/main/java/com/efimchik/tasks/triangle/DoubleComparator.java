package com.efimchik.tasks.triangle;

import static com.efimchik.tasks.triangle.MathConstant.EPSILON;

public class DoubleComparator {
    public static int doubleCompare(Double firstNumber, Double secondNumber) {
        if (Math.abs(firstNumber - secondNumber) < EPSILON) {
            return 0;
        } else if (firstNumber > secondNumber) {
            return 1;
        } else {
            return -1;
        }
    }
}
