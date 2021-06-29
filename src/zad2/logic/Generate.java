package zad2.logic;

import java.util.Random;

public class Generate {

    private final static int MIN = 1;
    private final static int MAX = 9;
    private static int min = generateNumbers(MIN, MAX);;
    private static int max = generateNumbers(MIN, MAX);;


    private static int generateNumbers(int MIN, int MAX) {
        if (MIN > MAX) {
            throw new IllegalArgumentException("Min is bigger than max");
        }
        return new Random().nextInt(MAX - MIN + 1) + MIN;
    }

    public static int[][] generateArray() {
        int rows = generateNumbers(min, max);
        if (rows <= 0) {
            throw new IllegalArgumentException("Rows value is not correct");
        }
        int cols = generateNumbers(min, max);
        if (cols <= 0) {
            throw new IllegalArgumentException("Cols value is not correct");
        }
        int array[][] = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = generateNumbers(min, max);
            }
        }
        return array;
    }

}

