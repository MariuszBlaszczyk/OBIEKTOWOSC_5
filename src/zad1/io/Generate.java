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


    public static String solution(int number) {
        if (number == 0)
            return Subtitle.ZERO;

        return generate(number).trim();
    }



    private static String generate1To99(int number) {
        if (number == 0)
            return "";

        if (number <= 9)
            return Subtitle.oneToNine[number - 1];
        else if (number <= 19)
            return Subtitle.tenToNineteen[number % 10];
        else {
            return Subtitle.tensNames[number / 10 - 1] + " " + generate1To99(number % 10);
        }
    }



    public static String generate(int number) {
        if (number >= 1000000000) {
            return generate(number / 1000000000) + " billion " + generate(number % 1000000000);
        } else if (number >= 1000000) {
            return generate(number / 1000000) + " million " + generate(number % 1000000);
        } else if (number >= 1000) {
            return generate(number / 1000) + " thousand " + generate(number % 1000);
        } else if (number >= 100) {
            return generate(number / 100) + " hundred " + generate(number % 100);
        }

        String result = generate1To99(number);
        return result;
    }

    private static String generate1To99(int number) {
        if (number == 0)
            return "";

        if (number <= 9)
            return Subtitle.oneToNine[number - 1];
        else if (number <= 19)
            return Subtitle.tenToNineteen[number % 10];
        else {
            String s = Subtitle.tensNames[number / 10 - 1] + " " + generate1To99(number % 10);
            return s;
        }
    }


}
