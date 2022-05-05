package com.company;

public class Main {


    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        boolean firstNegative = false;
        double[] array = {1, 1, -2, -3, 4, 5, 6, 7, 8, -9, 2, 4, -2, 2, 4};
        for (double i : array) {
            if (i < 0) {
                firstNegative = true;
                continue;
            }
            if (i > 0 && firstNegative) {
                sum = sum + i;
                count = count + 1;
            }

        }
        System.out.println(sum / count);

    }

}


