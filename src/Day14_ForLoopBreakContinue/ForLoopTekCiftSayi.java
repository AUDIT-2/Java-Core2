/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoopTekCiftSayi {
    //1-7 arasında kaç adet tek kaç adet çift sayı vardır.

    public static void main(String[] args) {
        int ciftSayac = 0;
        int tekSayac = 0;

        for (int i = 1; i <= 7; i++) {
            if(i % 2 == 0){
                ciftSayac++;
               // System.out.println(i);
            }else{
                tekSayac++;
               // System.out.println(i);
            }
        }
        System.out.println("Çift sayıların adeti = " + ciftSayac);
        System.out.println("Tek sayıların adeti = " + tekSayac);
    }
}
