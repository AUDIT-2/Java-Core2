/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

import java.util.Scanner;

public class CarpimTablosuScanner {
    //Klavyeden girilen sayının çarpım tablosunu yazan bir for loop yapısı oluşturunuz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.print("Çarpım tablosunu oluşturacağım sayıyı giriniz : ");
        sayi = scanner.nextInt();

        // 5'ler çarpım tablosu
        // 5 * 1 = 5
        // 5 * 2 = 10
        // 5 * 3 = 15
        //.. * .. = ..
        //.. * .. = ..
        //.. * .. = ..
        // 5 *  10 = 50

        if(sayi >= 1 && sayi <= 10){//true
            System.out.println(sayi + " sayısının çarpım tablosu");
            for (int i = 1; i <= 10; i++) {
                System.out.println(sayi + " * " + i + " = " + (sayi * i));
            }
        } else System.out.println("sayı 1-10 olmalıdır!"); //false
    }
}
