/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

public class WrapperClass {
    public static void main(String[] args) {
        System.out.println("Wrapper classes in Java.");
        System.out.println("Primitive data types.");
        System.out.println("---------------------");
        boolean devamMi = true;
        byte b = 127;
        short s = 32000;
        int i = 24400000;
        long l = 213983481891270L;
        float f = 15.5645646464646989889879797878F;
        double d = 3.9812398712931293019231239817298371928378912738912739812;
        char c = 'A';

        System.out.println("devamMi = " + devamMi);
        System.out.println("byte = " + b);
        System.out.println("short = " + s);


        System.out.println("Wrapper class data types.");
        System.out.println("-------------------------");

        String str = "Java öğreniyorum.";
        String str1 = new String("Ankara");
        String str2 = String.valueOf("SDET");

        Integer intWrapper = new Integer(12345);//
        Integer intWrapper1 = Integer.valueOf(12345);
        Integer intWrapper2 = 12345;
        Integer intWrapper3 = new Integer("12345");
        Integer intWrapper4 = Integer.valueOf("12345");

        System.out.println("intWrapper = " + intWrapper);
        System.out.println("intWrapper1 = " + intWrapper1);
        System.out.println("intWrapper2 = " + intWrapper2);
        System.out.println("intWrapper3 = " + intWrapper4);
        System.out.println("intWrapper4 = " + intWrapper4);

        System.out.println("(intWrapper == intWrapper2) = " + (intWrapper == intWrapper2));
        System.out.println("intWrapper.equals(intWrapper1) = " + intWrapper.equals(intWrapper1));
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);


        Integer toplam = 0;
        toplam = intWrapper1 + intWrapper2 ;
        System.out.println("toplam = " + toplam);
        System.out.println("---------------------------");
        System.out.println("Double wrapper class");
        System.out.println();

        Double dblWrapper = new Double(12.456);
        Double dblWrapper1 = Double.valueOf(12.456);
        Double dblWrapper2 = Double.valueOf("12.456");
        Double dblWrapper3 = 12.456;
        Double dblWrapper4 =Double.valueOf("12.456") ;
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        Double dblToplam = 0.0;
        dblToplam = dblWrapper + dblWrapper1;
        System.out.println("dblToplam = " + dblToplam);


    }
}
