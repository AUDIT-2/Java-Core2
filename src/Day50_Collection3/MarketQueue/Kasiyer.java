/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection3.MarketQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Kasiyer extends Thread {
    int kasiyerNo; //Kasiyerin numarası
    List<String> islemYapilanMusteriler; //Kasiyerin işlem yaptığı müşterilerin listesi
    Queue<String> musteriler; //Markette bekleyen müşteriler
    int toplamCalismaSure; //Kasiyerin toplam çalışma süresi

    public Kasiyer(int kasiyerNo,Queue musteriler){
        this.kasiyerNo = kasiyerNo;
        this.musteriler = musteriler;
        this.islemYapilanMusteriler = new ArrayList<>();
    }

    //.run() metodu herbir kasiyer için ayrı thread de çalışır. Multi threaded çalışacak kodlar bu metod içerisinde yazılmalıdır.
    @Override
    public void run() {
        while (!musteriler.isEmpty()){
            int sure = 1000 + (int) (Math.random() * 9000);//Rastgele bir süre oluşturur.(1-10 saniye)
            String musteri = musteriler.poll(); //Bu kasiyer bekleyen müşterilerden sıradakini çağırır
            islemYapilanMusteriler.add(musteri); //Bu kasiyer işlem yaptığı müşteriyi kendi listesine ekler
            toplamCalismaSure += sure; //Bu kasiyerin toplam çalışma süresi
            System.out.println("Kasiyer - " + kasiyerNo + " müşteri - " + musteri + " süre : " + sure);
            try {
                Thread.sleep(sure); //Rastgele belirlediğimiz süre bu thread ı bekletiyoruz.
            }catch (InterruptedException e){
                System.out.println("Hata oluştu....");
            }
        }
        System.out.println("İşlem yapan kasiyer : " + kasiyerNo + "---> Müşteriler : " +
                islemYapilanMusteriler + " -Toplam çalışma süresi : " + toplamCalismaSure);
    }
}
