package zad2.logic;

import java.util.Random;

public class Generate {

    public static int numbers(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min is bigger than max");
        }
        return new Random().nextInt(max - min + 1) + min;
    }




}

