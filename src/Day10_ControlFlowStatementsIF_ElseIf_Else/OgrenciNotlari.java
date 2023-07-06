/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day10_ControlFlowStatementsIF_ElseIf_Else;

import java.util.Scanner;

public class OgrenciNotlari {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        System.out.println("Not hesaplama programı...");
        int dersNotu = 0;
        char gecmeNotu = 'F';

        System.out.print("Ders notunuzu giriniz : ");
        dersNotu = veriGir.nextInt();

        if (dersNotu >= 0 && dersNotu <= 100) {
            if (dersNotu >= 90) {
                gecmeNotu = 'A';
                // System.out.println("Sınıf geçme notunuz = " + gecmeNotu);
            } else if (dersNotu >= 80) {
                gecmeNotu = 'B';
                // System.out.println("Sınıf geçme notunuz = " + gecmeNotu);
            } else if (dersNotu >= 70) {
                gecmeNotu = 'C';
                // System.out.println("Sınıf geçme notunuz = " + gecmeNotu);
            } else if (dersNotu >= 60) {
                gecmeNotu = 'D';
                // System.out.println("Sınıf geçme notunuz = " + gecmeNotu);
            } else {
                gecmeNotu = 'F';
                // System.out.println("Sınıf geçme notunuz = " + gecmeNotu);
            }
            if (gecmeNotu == 'F') {
                System.out.println(dersNotu + " ile Sınıfta kaldınız.");
            } else System.out.println("Sınıf geçme notunuz = " + gecmeNotu);
        } else {
            System.out.println("Girilen ders notu = " + dersNotu);
            System.out.println("Girdiğiniz ders notu hatalıdır. 0 - 100 arası bir değer olmalıdır!");
        }
    }
}
