/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day12_TernaryOperator;

import java.util.Scanner;

public class TernaryExample3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        String ogrenci = "";
        int diplomaNotu;
        int mulakatNotu;
        String sonuc;

        System.out.print("Öğrenci adını giriniz : ");
        ogrenci = klavye.nextLine();

        System.out.print("Diploma notunu girniz : ");
        diplomaNotu = klavye.nextInt();

        System.out.print("Mülakat notunu giriniz : ");
        mulakatNotu = klavye.nextInt();

        //Ternary operator
        sonuc = (diplomaNotu > 60 && mulakatNotu > 75) ? "kaydı kabul edilmiştir." : "kaydı reddedilmiştir.";
        System.out.println(ogrenci + " 'in " + sonuc);
    }
}
