package PoiskFibbonachi;

import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        if(n == 0) return "0.00";
        float summ = (float) 1.0;
        for (int i = 0; i < n - 1; i++) {
            summ += (1.0 / (4.0 + (3.0 * i)));
        }
        return String.format("%.2f", summ);
    }
}


