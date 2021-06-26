package zad1.app;

import zad1.io.Generate;

public class App {

    private final static int MIN = 0;
    private final static int MAX = 999;

    public static void main(String[] args) {


        int number = Generate.generateNumber(MIN, MAX);
        System.out.println("The number drawn is: " + number);

        String result = Generate.solution(number);
        System.out.println(result);


    }
}
