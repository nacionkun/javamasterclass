package com.ryantrinidad;

public class Main {

    public static void main(String[] args) {
        //Challenge exercise
        byte anyByteVar = 10;
        short anyShortVar = 20;
        int anyIntVar = 30;

        long myLongVar = 50000L + ((anyByteVar + anyShortVar + anyIntVar) * 10L);
        System.out.println("Result: " + myLongVar);

        short myShortVar = (short) (1000 + 10 * (anyByteVar + anyShortVar + anyIntVar));
        System.out.println("Result: " + myShortVar);
    }
}
