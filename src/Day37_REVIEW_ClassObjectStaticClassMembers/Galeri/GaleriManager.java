/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Galeri;

import static Day37_REVIEW_ClassObjectStaticClassMembers.Galeri.Galeri.*;

import java.util.Scanner;

public class GaleriManager {

    public static void arabaEkle(){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String model = "";
        String VIN = "";
        String plaka= "";
        System.out.println("Galeriye eklemek istediğiniz arabanın bilgilerini giriniz.");
        System.out.print("Arabanın Markasını giriniz : ");
        name = scanner.nextLine();
        System.out.print("Arabanın Modelini giriniz : ");
        model = scanner.nextLine();
        System.out.print("Arabanın VIN numarasını giriniz : ");
        VIN = scanner.nextLine();
        System.out.print("Arabanın Plaka Numarasını giriniz : ");
        plaka = scanner.nextLine();

        Galeri.arabaEkle(new Araba(name,model,VIN,plaka));
    }
    public static void main(String[] args) {
        Araba araba = new Araba("Mercedes","CLK 670","MRC-443434","06ZZ4468");

        System.out.println(araba);
        System.out.println("Galeri.name = " + Galeri.name);
        System.out.println("Galeri.address = " + Galeri.address);

        // Galeri.showArabalar();
        Galeri.listArabalarByName("ford");
        Galeri.listArabalarByName("toyota");
        Galeri.listArabalarByNameModel("toyota","corolla");

        System.out.println();
        System.out.println("Galerideki toplam araba sayısı = " + Galeri.getArabaSayisi());
        Galeri.arabaEkle(new Araba("Volvo","970","VLV","HB-123-345"));
        System.out.println("Galerideki toplam araba sayısı = " + Galeri.getArabaSayisi());

        Galeri.arabaSilVIN("TYT-781234");
        System.out.println("Galerideki toplam araba sayısı = " + Galeri.getArabaSayisi());

        arabaEkle();
        System.out.println("Galerideki toplam araba sayısı = " + Galeri.getArabaSayisi());
    }
}
