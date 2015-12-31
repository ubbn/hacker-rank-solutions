package algorithms.implementation.timeinwords;

import java.util.Scanner;

/**
 * Created by buyan on 30/12/15.
 */
public class Solution {
    static String[] numberNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " quarter",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };

    static String[] tenthNames = {"", "", "twenty", "half"};

    static String MinuteToWord(int minutes){
        if (minutes > 30)
            minutes = 60 - minutes;

        if (minutes < 20)
            return numberNames[minutes].trim();
        else
            return tenthNames[minutes / 10] + numberNames[minutes % 10];
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        byte hour = stdin.nextByte();
        byte minute = stdin.nextByte();

        if (minute == 0)
            System.out.println(numberNames[hour].trim() + " o' clock");
        else{
            System.out.print(MinuteToWord(minute));
            if (minute % 15 != 0)
                if (Math.min(minute, 60-minute)> 1)
                    System.out.print(" minutes");
                else
                    System.out.print(" minute");

            if (minute > 30) {
                System.out.print(" to");
                hour++;
            }
            else
                System.out.print(" past");

            System.out.println(numberNames[hour]);
        }
    }
}
