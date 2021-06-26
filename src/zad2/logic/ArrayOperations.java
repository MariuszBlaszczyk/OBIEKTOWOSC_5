package zad2.logic;

public class ArrayOperations {

    public static int[][] createArray(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is bigger then max");
        }
        int rows = Generate.numbers(min, max);
        int cols = Generate.numbers(min, max);
        int array[][] = new int[rows][cols];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Generate.numbers(min, max);
            }
        }
        return array;
    }
}
