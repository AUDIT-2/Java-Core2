/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays.KutuphaneNEW;

import java.util.Arrays;
import java.util.Scanner;

public class KutuphaneProgramiNEW {
    KutuphaneNEW kutuphane;

    public void kitapEkle(){
        Scanner veriGir = new Scanner(System.in);
        System.out.print("Kütüphane kaç kitap kapasiteli olsun : ");
        int kapasite = veriGir.nextInt();
        kutuphane = new KutuphaneNEW("Halk kütüphanesi","ABC Caddesi Halk Plaza no:23/A",kapasite);
        veriGir.nextLine();//integer veri giriş sonrası buffer ı temizlemek için

        boolean devam = true;
        while (devam && kapasite <= kutuphane.kitaplar.length){
            System.out.print("Kitap adını giriniz          : ");
            String kitapAdi = veriGir.nextLine();

            System.out.print("Kitap türünü giriniz         : ");
            String kitapTuru = veriGir.nextLine();

            System.out.print("Kitap sayfa sayısını giriniz : ");
            int kitapSayfaSayisi = veriGir.nextInt();

            System.out.print("Kitap basım yılını giriniz   : ");
            int kitapBasimYili = veriGir.nextInt();

            veriGir.nextLine();//integer veri giriş sonrası buffer ı temizlemek için

            System.out.print("Kitap ISBN numarasını giriniz: ");
            String kitapIsbn = veriGir.nextLine();

            System.out.print("Kitap yayınevi adını giriniz : ");
            String yayineviAdi = veriGir.nextLine();

            System.out.print("Yazar sayısını giriniz:");
            int yazarSayisi = veriGir.nextInt();
            veriGir.nextLine();//integer veri giriş sonrası buffer ı temizlemek için
            YazarNEW[] yazarlar = new YazarNEW[yazarSayisi];
            for (int i = 0; i < yazarSayisi; i++) {
                System.out.print((i + 1) + ". yazarın adi :");
                String yazarAdi = veriGir.nextLine();
                yazarlar[i] = new YazarNEW(yazarAdi);
            }
            KitapNEW kitap = new KitapNEW(kitapAdi, yayineviAdi, kitapIsbn, kitapBasimYili, kitapSayfaSayisi, kitapTuru, yazarlar);
            kutuphane.kitapEkle(kitap);
            if(kutuphane.kitapSayisi == kapasite){
                System.out.println("Kütüphanenin kitap kapasitesi doldu. Yeni kitap ekleyemzsiniz!!!");
                System.out.println("Kitap ekleme işlemlerinden çıkılıyor.");
                System.out.println();
                break;
            }else {
                System.out.print("Kitap kayıt işlemine devam etmek istiyor musunuz (E/H)? ");
                String karar = veriGir.nextLine();
                if(karar.equals("H") || karar.equals("h")){
                    break;
                }
            }
        }
        kutuphane.printInfo();
    }
    public void kitapYazarListe(String kitapAdi){
        for (int i = 0; i < kutuphane.kitapSayisi; i++) {
            if(kutuphane.kitaplar[i].ismi.contains(kitapAdi)){
                System.out.println(kutuphane.kitaplar[i].ismi + " isimli kitabın yazarları.");
                for (YazarNEW yazar: kutuphane.kitaplar[i].yazarlarListe()){
                    yazar.printInfo();

                }
                kutuphane.kitaplar[i].yazarlarListe();
            }
        }
    }
    public KitapNEW[] isimdenKitapBul(String kitapAdi) {
        KitapNEW[] bulunanKitaplar = new KitapNEW[kutuphane.kitapSayisi];
        int count = 0;
        for (int i = 0; i < kutuphane.kitapSayisi; i++) {
            if (kutuphane.kitaplar[i].equals(kitapAdi)) {
                bulunanKitaplar[count] = kutuphane.kitaplar[i];
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            return Arrays.copyOf(bulunanKitaplar, count);
        }
    }
    public static void main(String[] args) {
        KutuphaneProgramiNEW kutuphaneProg = new KutuphaneProgramiNEW();

        System.out.println("Kütüphane programına hoş geldiniz.");
        System.out.println();
        kutuphaneProg.kitapEkle();
      //  kutuphaneProg.kitapYazarListe("aaa");
        System.out.println( Arrays.toString(kutuphaneProg.isimdenKitapBul("aaa")));

    }
}
