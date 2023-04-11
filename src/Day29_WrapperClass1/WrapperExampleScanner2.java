/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

import java.util.Scanner;

public class WrapperExampleScanner2 {
    public static void main(String[] args) {
        //Scanner class known problem and Wrapper class solution.
        Scanner verGir = new Scanner(System.in);

        String urunAdi = "";
        double fiyat = 0.0;
        int miktar = 0;

        System.out.print("Ürünün fiyatını giriniz  : ");
        fiyat = Double.parseDouble(verGir.nextLine());

        System.out.print("Ürünün miktarını giriniz : ");
        miktar = Integer.parseInt(verGir.nextLine());

        System.out.print("Ürünün adınını giriniz   : ");
        urunAdi = verGir.nextLine();
    }
}
