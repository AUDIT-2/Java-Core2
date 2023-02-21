/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class Odev2 {
    public static void main(String[] args) {
        /* 1-Soru

        //Her unary işlemde x in aldığı değeri ve işlem sonucunda hesaplanan m değerini yazdıran bir program yazınız.
        int x = 10;
        int m = ++x * x++;

         */
        System.out.println("1.Sorunun çözümü: ");
        int x = 10;
        int m = ++x * x++; // m = 11 * 11

        System.out.println("x = " + x);
        System.out.println("m = " + m);

        /* 2-Soru

         //Her unary işlemde x in aldığı değeri ve işlem sonucunda hesaplanan y değerini yazdıran bir program yazınız.

         int x1 = 20;
         int y1 = ++x1 * 10 / x1++ + ++x1;
         */
        System.out.println("2.Sorunun çözümü: ");
        int x1 = 20;
        int y1 = ++x1 * 10 / x1++ + ++x1;
        //y1 = 21 * 10 / x1++ + ++x1
        //y1 = 210 / 21 + 23
        //y1 = 10 + 23
        //y1 = 33
        //x1 = 23
        System.out.println("y1 = " + y1);
        System.out.println("x1 = " + x1);
    }
}
