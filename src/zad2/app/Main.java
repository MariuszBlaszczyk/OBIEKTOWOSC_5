package zad2.app;

import zad2.logic.ArrayOperations;
import zad2.logic.Generate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr1 = Generate.generateArray();
        int[][] arr2 = Generate.generateArray();

        displayArray(arr1);
        displayArray(arr2);

        ArrayOperations array = new ArrayOperations(arr1, arr2);
        displayArray(array.getConcatArr());

        System.out.println("a.");
        System.out.println(array.getPrimeNumbersQuantity());
        System.out.println();

        System.out.println("b.");
        System.out.println("row: " + array.getRowNumberWithHighestNeighbours());
        System.out.println("col: " + array.getColNumberWithHighestNeighbours());
        System.out.println();

        System.out.println("c.");
        System.out.println("row: " + array.getRowNumberWithHighestNumber());
        System.out.println("col: " + array.getColNumberWithHighestNumber());
        System.out.println();

        System.out.println("d.");
        System.out.println(array.getSum());
    }

    private static void displayArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

}
