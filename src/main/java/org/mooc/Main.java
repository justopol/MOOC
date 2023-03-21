package org.mooc;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Duck[] ducks = createListOfDucks();


        int size = 20;
        int shellWidth = 50;
        int biggestDucksHeight = 0;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        for (int i = 0; i < Math.pow(2, size); i++) {
            int sumOfWidth = 0;
            int sumOfHeight = 0;
            String bits = fillWithZeros(Integer.toBinaryString(i), size);
            int j = 0;
            for (char ch : bits.toCharArray()) {
                if (ch == '1') {
                    Duck currentDuck = ducks[j];
                    sumOfWidth += currentDuck.width;
                    sumOfHeight+= currentDuck.height;
                }
                j++;
            }
            if(sumOfWidth <=shellWidth){
                if(biggestDucksHeight<sumOfHeight){
                    biggestDucksHeight = sumOfHeight;
                }

            }
        }
        System.out.println(biggestDucksHeight);
        now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public static String fillWithZeros(String input, int size) {
        return createZeroString(size - input.length()) + input;
    }

    public static String createZeroString(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += "0";
        }
        return result;
    }

    public static Duck[] createListOfDucks() {
        Duck result[] = new Duck[20];
        result[0] = new Duck(3, 2);
        result[1] = new Duck(5, 4);
        result[2] = new Duck(7, 6);
        result[3] = new Duck(2, 1);
        result[4] = new Duck(8, 5);
        result[5] = new Duck(4, 3);
        result[6] = new Duck(6, 7);
        result[7] = new Duck(9, 9);
        result[8] = new Duck(1, 2);
        result[9] = new Duck(5, 4);
        result[10] = new Duck(7, 6);
        result[11] = new Duck(8, 8);
        result[12] = new Duck(3, 3);
        result[13] = new Duck(4, 5);
        result[14] = new Duck(6, 7);
        result[15] = new Duck(2, 1);
        result[16] = new Duck(1, 2);
        result[17] = new Duck(5, 4);
        result[18] = new Duck(8, 6);
        result[19] = new Duck(9, 8);

        return result;
    }

}
