/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day05_ArithmeticOperators;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        //write a java program to convert Celsius to Fahrenheit
        //Celsius = (5 * (fahrenheit -32 ) / 9
        //Fahrenheit = (celsius * 9) / 5  + 32

        float celsius;
        float fahrenheit;
        // Fahrenheit to Celsius
        fahrenheit = 100;
        celsius = 5 * (fahrenheit -32 ) / 9;
        float celsius1 = (fahrenheit - 32 ) / 1.8f;
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Celsius = " + celsius);
        System.out.println("Celsius1 = " + celsius1);
        System.out.println();

        // Celsius to Fahrenheit
        // fahrenheit = ((celsius * 9) / 5) + 32;
        celsius = 37.77778f;
        fahrenheit = celsius * 9 / 5 + 32;
        float fahrenheit1 = celsius * 1.8f + 32;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Fahrenheit1 = " + fahrenheit1);

    }
}
