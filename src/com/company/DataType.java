package com.company;

public class DataType {
    public static void main(String[] args) {
        boolean b = Boolean.TRUE;
        System.out.printf("Boolean: min=%b, max=%b, range=%d\n", Boolean.FALSE, Boolean.TRUE, 1);
        System.out.printf("Byte: min=%d, max=%d, range=%d\n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES);
        System.out.printf("Short: min=%d, max=%d, range=%d\n", Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
        System.out.printf("Integer: min=%d, max=%d, range=%d\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES);
        System.out.printf("Long: min=%d, max=%d, range=%d, size=%d\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.BYTES, Long.SIZE);
        System.out.printf("Float: min=%e, max=%e, range=%d, size=%d\n", Float.MIN_VALUE, Float.MAX_VALUE, Float.BYTES, Float.SIZE);
        System.out.printf("Double: min=%e, max=%e, range=%d, size=%d\n", Double.MIN_VALUE, Double.MAX_VALUE, Double.BYTES, Double.SIZE);

        /*
        It's a good weather today.
        I'm 30 years old
        The world population is ...
        The 5 times (multiplication) table
        5 apples, 3 peaches and 2 cherries
        The interest on deposit is 5%
        Today is the 5th day of week
        The first letter of my name is A
        The cycle is running 10 times
        The weight of apples is 1.2 kilos
        My name is Alex
        This year has 365 days
        There are 7 rainbow colors
        The BATE won this match:
        The first digit in the number is greater than the second:
        The library consists of 1005 books
        My height is 175 centimeters
         */

        boolean weather = true;
        int age = 30;
        long population = 7_500_000_000L;
        byte number = 5;
        byte apples = 5, peaches = 3, cherries = 2;
        float interes = 0.05f;
        int day = 1;
        char first_letter_name = 'A';
        int count = 10;
        double weight = 1.2;
        String name = "Alex";
        boolean won = true;



    }
}
