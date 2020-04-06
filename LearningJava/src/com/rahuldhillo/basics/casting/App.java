package com.rahuldhillo.basics.casting;

public class App {
    public static void main(String[] args) {

        byte byteValue = 34;
        int intValue = 456;
        long longValue = 4567;
        float floatValue = 34.5f;
        float floatValue1 = (float) 76.8;
        double doubleValue = 765.897;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;
        System.out.println(intValue);

        doubleValue = intValue;

        System.out.println(doubleValue);

        intValue = (int) floatValue;

        System.out.println(intValue);

        byteValue = (byte) 128;

        System.out.println(byteValue);
    }
}
