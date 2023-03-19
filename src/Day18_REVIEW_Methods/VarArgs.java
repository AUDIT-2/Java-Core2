/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day18_REVIEW_Methods;

public class VarArgs {
    public static int ikiSayiTopla(int aSayisi, int bSayisi){
        return aSayisi + bSayisi;
    }
    public static int ucSayiTopla(int aSayisi, int bSayisi, int cSayisi){
        return aSayisi + bSayisi + cSayisi;
    }

    //Variable arguments-VARARGS-Önceden bellirili olmayan 1 veya daha fazla sayıda değişen sayıda parametre alan metodlar
    //Parametre bir array(dizi) veri yapısı olarak metoda gönderilir

    public static int varSayiTopla(int ... sayilar){
        int toplam = 0;
    //System.out.println("Parametre sayısı = " + sayilar.length); //Parametrenin kaç elemanı olduğunu ekrana yazar
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
            //System.out.println("sayilar[i] = " + sayilar[i]);
        }
        return toplam;
    }

    public static void main(String[] args) {
        System.out.println(ikiSayiTopla(2,8));
        int sonuc = ikiSayiTopla(34,2);
        System.out.println(sonuc);

        System.out.println(ucSayiTopla(2,5,30));
        System.out.println("varSayiTopla(2,5,3,5,10) = " + varSayiTopla(2, 5, 3, 5, 10));
        System.out.println("varSayiTopla(34,45,67,88,99,97,534,12,34,56) = " + varSayiTopla(34, 45, 67, 88, 99, 97, 534, 12, 34, 56));
        System.out.println("varSayiTopla(2,5) = " + varSayiTopla(2, 5));
    }
}
