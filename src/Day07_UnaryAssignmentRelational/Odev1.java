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
        a = ++x;
        b = y++;
        c = x + y++ + ++z;
    }
}
