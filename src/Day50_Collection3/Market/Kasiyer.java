/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day50_Collection3.Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Kasiyer extends Thread {
    int kasiyerNo;
    List<String> islemYapilanMusteriler;
    Queue<String> musteriler;
    int toplamCalismaSure;

    public Kasiyer(int kasiyerNo,Queue musteriler){
        this.kasiyerNo = kasiyerNo;
        this.musteriler = musteriler;
        this.islemYapilanMusteriler = new ArrayList<>();
    }

    @Override
    public void run() {
        while (!musteriler.isEmpty()){
            int sure = 1000 + (int) (Math.random() * 9000);
            String musteri = musteriler.poll();
            islemYapilanMusteriler.add(musteri);
            toplamCalismaSure += sure;
            System.out.println("Kasiyer - " + kasiyerNo + " müşteri - " + musteri + " süre : " + sure);
            try {
                Thread.sleep(sure);
            }catch (InterruptedException e){
                System.out.println("Hata oluştu....");
            }
        }
        System.out.println("İşlem yapan kasiyer : " + kasiyerNo + "--->Müşteriler : " +
                islemYapilanMusteriler + " -Toplam çalışma süresi : " + toplamCalismaSure);
    }
}
