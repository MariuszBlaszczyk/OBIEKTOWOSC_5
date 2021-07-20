package zad2.logic;

import java.util.Random;

public class Generate {

    private final static int MIN = 1;
    private final static int MAX = 9;

    private static int generateNumbers() {
        return new Random().nextInt(MAX - MIN + 1) + MIN;
    }

    public static int[][] generateArray() {
        int rows = generateNumbers();
        int cols = generateNumbers();

        int[][] array = new int[rows][cols];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = generateNumbers();
            }
        }
        return array;
    }
}