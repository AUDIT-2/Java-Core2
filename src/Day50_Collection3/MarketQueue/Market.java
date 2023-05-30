/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection3.MarketQueue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Market {
    public static void main(String[] args) {
       // Queue<String> bekleyenMusteriler = new LinkedList<>();
        Queue<String> bekleyenMusteriler = new LinkedBlockingQueue<>(); //Multi threaded olduğundan thread safe bir Collection kullanmak daha sağlıklıdır.

        bekleyenMusteriler.add("Mehmet");
        bekleyenMusteriler.add("Ali");
        bekleyenMusteriler.add("Zeynep");
        bekleyenMusteriler.add("Zeki");
        bekleyenMusteriler.add("Cengiz");
        bekleyenMusteriler.add("Aydın");
        bekleyenMusteriler.add("Melek");
        bekleyenMusteriler.add("Aziz");
        bekleyenMusteriler.add("Behiye");
        bekleyenMusteriler.add("Can");

        System.out.println("Bekleyen müşteriler : " + bekleyenMusteriler);

       /* Kasiyer kasiyer1 = new Kasiyer(1,bekleyenMusteriler);
        kasiyer1.start();

        Kasiyer kasiyer2 = new Kasiyer(2,bekleyenMusteriler);
        kasiyer2.start();

        Kasiyer kasiyer3 = new Kasiyer(3,bekleyenMusteriler);
        kasiyer3.start();*/

        int kasiyerSayisi = 3; //Multi thread çalışacak kasiyer sayısı
        for (int i = 1; i <= kasiyerSayisi; i++) {
            Kasiyer kasiyer = new Kasiyer(i,bekleyenMusteriler);
            kasiyer.start();
        }
    }
}
