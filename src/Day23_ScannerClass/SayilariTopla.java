/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.util.Scanner;

public class SayilariTopla {
    public static void main(String[] args) {
        Scanner sayiOku = new Scanner(System.in);

        System.out.print("Klavyeden 3 adet sayı giriniz : "); // 34 56 70 bu şekilde aralarında boşluk
                                                              // birakarak veri girişi de yapılabilir
        // her bir veri girşinden sonra enter a basıp diğer veri girişi de yapılabilir
        double sayi1 = sayiOku.nextDouble();
        double sayi2 = sayiOku.nextDouble();
        double sayi3 = sayiOku.nextDouble();

        double toplam = sayi1 + sayi2 + sayi3;
        System.out.println("Toplam = " + toplam);
    }
}
