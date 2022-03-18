package calculator;

import java.lang.Math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqrt_div(int a, int b) {
        Double temp;
        try {
            temp = Math.sqrt((double)(a) / (double)(b));
        } catch (Exception e) {
            temp = -1.0;
        }
        if (temp.isNaN() || temp.isInfinite())
            temp = -1.0;
        return temp;
    }
}
