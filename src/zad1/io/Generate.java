package zad1.io;

import zad1.data.Subtitle;

import java.util.Random;

public class Generate {


    public static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Random range is not correct");
        }
        return new Random().nextInt(max - min + 1) + min;
    }


    private static String generate1To99(int number) {
        if (number == 0)
            return "";

        if (number <= 9)
            return Subtitle.ONE_TO_NINE[number - 1];
        else if (number <= 19)
            return Subtitle.TEN_TO_NINETEEN[number % 10];
        else {
            return Subtitle.TENS_NAMES[number / 10 - 1] + " " + generate1To99(number % 10);
        }
    }


    public static String generate(int number) {
        if (number >= 100 && number < 200) {
            return "sto" + generate(number % 100);
        } else if (number >= 200 && number < 300) {
            return "dwieście" + generate(number % 100);
        } else if (number >= 300 && number < 500) {
            return generate(number / 100) + "sta " + generate(number % 100);
        } else if (number >= 500) {
            return generate(number / 100) + "set" + generate(number % 100);
        }
        return generate1To99(number);
    }


    public static String solution(int number) {
        if (number == 0)
            return Subtitle.ZERO;

        return generate(number).trim();
    }

}

