package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sumOfNumbers = 0;
        if (array == null) {
            return 0;
        } else {
            for (int j : array) {
                if (j % 2 == 0) {
                    sumOfNumbers += j;
                }
            }
            return sumOfNumbers;
        }
    }
}
