/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

public class MyWrapperClass {
    static int value;

    public MyWrapperClass(int sayi){
        value = sayi;
    }

    public MyWrapperClass(String str){
       value = strToint(str);
    }

    public int strToint(String str){
        int result = 0;
        for (int i = 0; i < str.trim().length(); i++) {
            result *= 10;
            result += str.charAt(i) - 48; //ASCII code table for '0'
        }
        return result;
    }
    public int intValue(){
        return value;
    }
    public byte byteValue(){
        return (byte) value;
    }
    public short shortValue(){
        return (short) value;
    }
    public String stringValue(){
        return value + "";
    }
    public double doubleValue(){
        return (double) value;
    }
    public static void valueOf(int sayi){
        value = sayi;
    }
}
