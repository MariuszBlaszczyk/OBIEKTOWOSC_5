package zad3.logic;

public class ArrayOperations {

    public static void showArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

}
