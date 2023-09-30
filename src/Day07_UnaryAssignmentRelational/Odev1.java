/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day07_UnaryAssignmentRelational;

public class Odev1 {
    public static void main(String[] args) {
        System.out.println("Tanımlanan x,y,z ve a,b,c değişkenlerini kullanarak işlem sonrası bu değişkenlerin değerlerini yazdıran bir program yazın.");
        int x = 50;
        int y = 100;
        int z = 200;

        int a, b, c;
        a = ++x; //x becomes 50 + 1 = 51 then a = 51
        b = y++; // b = 100 after this line y becomes 100 + 1 = 101
        c = x + y++ + ++z;  // c = 51 + 101 + (200 + 1) ---> c = 353

        System.out.println("x = " + x); //---> 51
        System.out.println("y = " + y); //---> 102
        System.out.println("z = " + z); //---> 201
        System.out.println("a = " + a); //---> 51
        System.out.println("b = " + b); //---> 100
        System.out.println("c = " + c); //---> 353

    }
}
