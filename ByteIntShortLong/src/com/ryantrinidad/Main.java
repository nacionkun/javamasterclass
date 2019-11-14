package com.ryantrinidad;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN VALUE =" + myMinIntValue);
        System.out.println("Integer MIN VALUE =" + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMinIntValue + 1));
        System.out.println("Busted MIN value = " + (myMaxIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN VALUE =" + myMinByteValue);
        System.out.println("Byte MIN VALUE =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIN VALUE =" + myMinShortValue);
        System.out.println("Short MIN VALUE =" + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MIN VALUE =" + myMinLongValue);
        System.out.println("Long MIN VALUE =" + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

    }
}
