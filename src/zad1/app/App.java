package zad1.app;

import java.util.Random;

public class App {

    static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    private static final String[] numNames = {
            "",
            " zero",
            " jeden",
            " dwa",
            " trzy",
            " cztery",
            " pięć",
            " sześć",
            " siedem",
            " osiem",
            " dziewięć",
            " dziesięć",
            " jedenaście",
            " dwanaście",
            " trzynaście",
            " czternaście",
            " piętnaście",
            " szesnaście",
            " siedemnaście",
            " osiemnaście",
            " dziewiętnaście"
    };

    private static final String[] tensNames = {
            "",
            " dziesięć",
            " dwadzieścia",
            " trzydzieści",
            " czterdzieści",
            " pięćdziesiąt",
            " sześćdziesiąt",
            " siedemdziesiąt",
            " osiemdziesiąt",
            " dziewięćdziesiąt"
    };

    private final static int MIN = 0;
    private final static int MAX = 999;

    public static void main(String[] args) {

        int number = generateNumber(MIN, MAX);
        System.out.println("The number drawn is: " + number);


    }
}
