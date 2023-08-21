/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays.KutuphaneNEW;

public class KitapNEW {
    String ismi;
    String yayinEvi;
    String isbn;
    int basimYili;
    int sayfaSayisi;
    String turu;

    YazarNEW[] yazarlar;

    public KitapNEW(String ismi, String yayinEvi, String isbn, int basimYili, int sayfaSayisi, String turu, YazarNEW[] yazarlar) {
        this.ismi = ismi;
        this.yazarlar = yazarlar;
        this.yayinEvi = yayinEvi;
        this.isbn = isbn;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
        this.turu = turu;
    }

    public YazarNEW[] yazarlarListe() {
        return yazarlar;
    }

    public void printInfo() {
        System.out.println("Kitabın ad          : " + ismi);
        System.out.println("Kitabın türü        : " + turu);
        System.out.println("Kitabın sayfa adedi : " + sayfaSayisi);
        System.out.println("Kitabın basım yılı  : " + basimYili);
        System.out.println("Kitabın ISBN no     : " + isbn);
        System.out.println("Kiyabın Yayınevi    : " + yayinEvi);

        System.out.println("Kitabın yazarı/yazarları");
        System.out.println("-------------------------------------");
        for (int i = 0; i < yazarlar.length; i++) {
            if (yazarlar[i] != null) {
                yazarlar[i].printInfo();
            }
        }
    }
}
