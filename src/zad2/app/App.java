package zad2.app;

import zad2.logic.ArrayOperations;
import zad2.logic.Generate;

public class App {


    public static void main(String[] args) {

        int[][] array1 = Generate.generateArray();
        int[][] array2 = Generate.generateArray();
        int[][] array = ArrayOperations.concatArray(array1, array2);
        ArrayOperations.showArray(array);

    }
}
