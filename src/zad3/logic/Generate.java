package zad3.logic;

import java.util.Random;

public class Generate {

    private static final int MIN_NUMBER_OF_NUMERICAL_SEQUENCES = 3;
    private static final int MAX_NUMBER_OF_NUMERICAL_SEQUENCES = 7;

    private static final int MIN_NATURAL_NUMBERS = 100;
    private static final int MAX_NATURAL_NUMBERS = 999;

    private static final int MIN_NUMBER_ELEMENTS_IN_THE_NUMERICAL_SEQUENCES = 5;
    private static final int MAX_NUMBER_ELEMENTS_IN_THE_NUMERICAL_SEQUENCES = 10;

    public static int generateNumbers(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is bigger than max");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    public static int[][] generateArray() {
        int rows = generateNumbers(MIN_NUMBER_OF_NUMERICAL_SEQUENCES,
                MAX_NUMBER_OF_NUMERICAL_SEQUENCES);
        if (rows <= 0) {
            throw new IllegalArgumentException("Rows value is not correct");
        }
        int array[][] = new int[rows][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[generateNumbers(MIN_NUMBER_ELEMENTS_IN_THE_NUMERICAL_SEQUENCES,
                    MAX_NUMBER_ELEMENTS_IN_THE_NUMERICAL_SEQUENCES)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = generateNumbers(MIN_NATURAL_NUMBERS, MAX_NATURAL_NUMBERS);
            }
        }
        return array;
    }
}