package com.paipeng.cppearson;

/**
 * Pearson Correlation Coefficient
 *
 * 皮尔森相关系数也称皮尔森积矩相关系数(Pearson product-moment correlation coefficient)，
 */
public class Pearson {
    private double calculateMean(byte[] data) {
        int sum = 0;
        for (byte value : data) {
            sum += Byte.toUnsignedInt(value);
        }
        return sum*1.0/data.length;
    }

    public double calculatePearson(byte[] x, byte[] y) {
        double x_mean = calculateMean(x);
        double y_mean = calculateMean(y);
        double x_pow = 0, y_pow = 0;
        double sum_top = 0, sum_bottom = 0;

        for (int i = 0; i < x.length; i++) {
            sum_top += (Byte.toUnsignedInt(x[i]) - x_mean) * (Byte.toUnsignedInt(y[i]) - y_mean);
        }

        for (int i = 0; i < x.length; i++) {
            x_pow += Math.pow((Byte.toUnsignedInt(x[i]) - x_mean), 2);
            y_pow += Math.pow((Byte.toUnsignedInt(y[i]) - y_mean), 2);
        }

        sum_bottom = Math.sqrt(x_pow * y_pow);
        double pearson = sum_top/sum_bottom;
        return pearson;
    }
}
