/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Magaza;

import java.util.Date;

public class MagazaProg {
    public static void main(String[] args) throws InterruptedException {
        Product product1 = new Product("Elma",15,1.5,"Meyve");
        Product product2 = new Product("Armut",25,1.5,"Meyve");
        Product product3 = new Product("Tavuk",45,1,"Şarküteri");
        Product product4 = new Product("Süt",15,1,"İçecek");
        Product product5 = new Product("Domates",12,3,"Sebze");
        Product product6 = new Product("Çay",115,1,"Muhtelif");
        Product product7 = new Product("Zeytin",65,2,"Şarküteri");
        Product product8 = new Product("Peynir",165,2,"Mandıra");
        Product product9 = new Product("Deterjan",115,1,"Temizlik");
        Product product10 = new Product("Tere Yağ",175,1,"Mandıra");

        Sepet sepet = new Sepet();
        sepet.addSepetUrun(product1);
        sepet.addSepetUrun(product2);
        sepet.addSepetUrun(product3);
        sepet.addSepetUrun(product4);
        sepet.addSepetUrun(product5);
        sepet.addSepetUrun(product6);
        sepet.addSepetUrun(product7);

        //varArgs
        sepet.addSepetUrun(product8,product9,product10);
        sepet.addSepetUrun(new Product("Sıvı Yağ",135,1,"Gıda"));

        Fatura fatura = new Fatura(new Date(),sepet);
        System.out.println(fatura);

        //3 saniye bakleyip yeni bir fatura yazdırıyoruz
        System.out.println();
        Thread.sleep(3000);

        Product product20 = new Product("Deterjan",115,3,"Temizlik");
        Product product21 = new Product("Tere Yağ",175,1.5,"Mandıra");

        Sepet sepet1 = new Sepet();
        sepet1.addSepetUrun(product20);
        sepet1.addSepetUrun(product21);
        Fatura fatura1 = new Fatura(new Date(),sepet1);

        System.out.println(fatura1);
    }
}
