/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day32_Constructors1;

import java.util.ArrayList;

public class Banka {
    String adi;
    String adresi;
    int hesapNo = 1000;

    ArrayList<Musteri> musteriler;

    public Banka(String adi, String adresi) {
        this.adi = adi;
        this.adresi = adresi;
        musteriler = new ArrayList<>();
    }

    public void musteriEkle(Musteri musteri){
        hesapNo++;
        musteri.hesapNo = this.hesapNo;
        musteriler.add(musteri);
        System.out.println(musteri.adi + " isimli müşterinin " +  musteri.hesapNo + " hesap no ile banka hesabı açıldı..");
    }

    public void musteriListesi(){
        for (Musteri musteri : musteriler){
            musteri.showInfoListe();
        }
    }

    public void paraYatir(Musteri musteri, double miktar){
        if(miktar > 0){
            musteri.bakiye += miktar;
        }
    }

    public void musteriBulHesapNo(int hesapNo){
        System.out.println("Hesap numarasından Müşteri bul metodu.");
        System.out.println("---------------------------------------");
        int count = 0;
        for (Musteri musteri :musteriler){
            if(musteri.hesapNo == hesapNo){
                count++;
                musteri.showInfo();
                //Hesap numaraları tekil olacağından bir hesapno bulduğunda listedeki diğerlerine bakmaya gerek yok.
               break;
            }
        }
        if(count == 0) {
            System.out.println("Bu hesapno ile kayıtlı müşteri yok!");
        }
    }

    public void musteriBulAd(String ad){
        System.out.println("İsimden Müşteri bul metodu.");
        System.out.println("---------------------------------------");
        int count = 0;
        for (Musteri musteri :musteriler){
            if(musteri.adi.equalsIgnoreCase(ad)){
                count++;
                musteri.showInfo();
                //Aynı isimde birden fazla müşteri olabileceğinden müşteriler listesini baştan sona dolaşmak gerekir.
            }
        }
        System.out.println(count + " adet " + ad + " isimli müşteri bulundu.");
        if(count == 0) {
            System.out.println(ad + " isim ile kayıtlı müşteri yok!");
        }
    }

    public void paraCek(Musteri musteri, double miktar){
        if(musteri.bakiye >= miktar && miktar > 0){
            musteri.bakiye -= miktar;
        }else {
            System.out.println("Hesabınızda yeterli bakiye yok!");
            System.out.println("Enfazla " + musteri.bakiye + " TL miktarında para çekebilirsiniz!");
        }
    }
    public void showInfo(){
        System.out.println(adi);
        System.out.println(adresi);
        System.out.println("----------------------------------");
        System.out.println("Bankamızdaki müşterilerin listesi.");
        musteriListesi();
    }

}
