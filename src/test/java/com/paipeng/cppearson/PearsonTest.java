package com.paipeng.cppearson;

import org.junit.jupiter.api.Test;

import java.util.Random;

class PearsonTest {
    @Test
    void calculate() {
        byte[] x_data = new byte[32];
        byte[] y_data = new byte[32];

        Random rand = new Random();
        for (int i = 0; i < 32; i++) {
            x_data[i] = (byte) i;
            y_data[i] = (byte) (rand.nextInt(32));
        }
        Pearson pearson = new Pearson();
        double p = pearson.calculatePearson(x_data, y_data);
        System.out.println("pearson: " + p);
    }
}