/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

import java.text.DecimalFormat;

public class FloatFormatter {
    /*
    Float ve Double tipi değerlerin formatlı gösterimi
     */
    public static void main(String[] args){
        System.out.println("Float ve Double tipi değerlerin formatlı gösterimi.");
        float floatDeger = 25.34537f;
        double doubleDeger = 3455678934534346364564598237892759287598759837498573498579835857457567567567567D;

        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);

        //printf() metodu ile
        System.out.println("printf()-Yöntemiyle formatlı gösterim.");
        System.out.printf("%.4f\n",floatDeger); // "\n" new line escape sequence
        // System.out.println();

        //String.format() metodu ile
        System.out.println("String.format--> yöntemiyle gösterim.");
        System.out.println(String.format("%.3f",floatDeger));

        //DecimalFormat Class ile
        System.out.println("DecimalFormat class yöntemi ile.");
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("floatDeger(DecimalFormat) = " + df.format(floatDeger));
    }
}
