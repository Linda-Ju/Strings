package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String a = "apple";
//      concatenation is joining 2 strings together to form a new string
        String me = "I love ";
        String sentence = me + a.toUpperCase();
//        System.out.println(sentence);

//      byte, short, int, long, float, double
//      you can covert from bigger type to small, however,
//      in case of converting from bigger to smaller you can loose some data
        int eight = 8;
        long number = eight;
        System.out.println("number = " + number);

//      int, long, short, byte, double, float ==> Integer, Long ...   in java.lang
//      Integer number = new Integer(7)
        String five = "5";
        int five5 = Integer.parseInt(five);
//        System.out.println(Integer.max(five5, 7)); //can compare only integers (no doubles and other)

//      HOMEWORK
//        1. write a program that takes a string
//        and prints the number of vowels in that string
//        2. write a program that adds the value two strings
//        using the wrapper classes to parse the strings.
    }
}
