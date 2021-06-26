package zad2.app;

import zad2.logic.ArrayOperations;

public class App {

    private final static int MIN = 1;
    private final static int MAX = 5;

    public static void main(String[] args) {

        int[][] array1 = ArrayOperations.createArray(MIN, MAX);
        int[][] array2 = ArrayOperations.createArray(MIN, MAX);
    }
}
