package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задача № 1

        int[] arrayOne = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arrayOne));

        double[] boxes = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(boxes));

        int[] arraysTwo = {5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arraysTwo));

        // Задача № 2

        int[] arraysOne = new int[]{1, 2, 3};
        for (int i = 0; i < arraysOne.length; i++) {
            if (i == arraysOne.length - 1) {
                System.out.print(arraysOne[i]);
            } else {
                System.out.print(arraysOne[i] + ",");
            }
        }

        System.out.println();

        double[] boxes1 = new double[]{1.57, 7.654, 9.986};
        for (int a = 0; a < boxes1.length; a++) {
            if (a == boxes1.length - 1) {
                System.out.print(boxes1[a]);
            } else {
                System.out.print(boxes1[a] + ",");
            }
        }

        System.out.println();

        int[] arrays3 = {5, 6, 7, 8, 9};
        for (int y = 0; y < arrays3.length; y++) {
            if (y == arrays3.length - 1) {
                System.out.print(arrays3[y]);
            } else {
                System.out.print(arrays3[y] + ",");
            }
        }

        System.out.println();

        // Задача № 3

        int[] arrays4 = new int[]{1, 2, 3};
        for (int i = arrays4.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrays4[i]);
            } else {
                System.out.print(arrays4[i] + ",");
            }
        }

        System.out.println();

        double[] boxes2 = new double[]{1.57, 7.654, 9.986};
        for (int a = boxes2.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.print(boxes2[a] + " ");
            } else {
                System.out.print(boxes2[a] + ",");
            }
        }

        System.out.println();

        int[] arrays5 = {5, 6, 7, 8, 9};
        for (int y = arrays5.length - 1; y >= 0; y--) {
            if (y == 0) {
                System.out.print(arrays5[y] + " ");
            } else {
                System.out.print(arrays5[y] + ",");
            }
        }

        System.out.println();
// Задача № 4
        int[] arrays6 = new int[]{1, 2, 3};
        for (int d = 0; d < arrays6.length; d++) {
            if (arrays6[d] % 2 != 0) {
                System.out.print(arrays6[d] + 1);
            } else {
                System.out.print(arrays6[d]); }
            if (d != arrays6.length - 1) {
                System.out.print(","); }
            else {
                System.out.print(" ");
                    }
                }
            }
        }