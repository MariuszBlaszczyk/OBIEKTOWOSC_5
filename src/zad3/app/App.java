package zad3.app;

import zad3.logic.ArrayOperations;
import zad3.logic.Generate;

public class App {

    public static void main(String[] args) {

        int [][] array = Generate.generateArray();
        ArrayOperations.showArray(array);
     }
}
