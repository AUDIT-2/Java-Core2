/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day17_Method2;

public class AsalSayi {
    public static void main(String[] args) {
     //   System.out.println("asalMi(30) = " + asalMi(30));
        boolean asal;
        asal = asalMi(197);

        /*if (asal){
            System.out.println("Bu sayı asal bir sayıdır.");
        } else System.out.println("Bu sayı asal bir sayı değildir.");

        if(asalMi(10)){
            System.out.println("Bu sayı asal bir sayıdır.");
        } else System.out.println("Bu sayı asal bir sayı değildir.");
*/
        sayiAralikAsalYaz(200,10000);

    }
    //Bir sayının asal sayı olup olmadığını bulan metod
    public static boolean asalMi(int sayi){
        for (int i = 2; i <= sayi / 2  ; i++) {
            if(sayi % i == 0){ //true ise kendisinden başka bir sayıya daha bölünebiliyor demektir o yüzden asal sayı değildir.
                return false;
            }
          //  System.out.println("i = " + i); // Kaç defa da asal olup olmadığını bulduğunu yazdırabiliriz.
        }
        return true;
    }

    public static void sayiAralikAsalYaz(int baslangic, int bitis){
        int countAsal= 0;
        while (baslangic < bitis){
            if(asalMi(baslangic)){
                countAsal++;
                System.out.print(baslangic + " ");
                if (countAsal % 10 == 0){//her bir satıra 10 adet asal sayı yazdıktan sonra bir alt satıra geç
                    System.out.println();
                }
            }
           baslangic++;
        }
        System.out.println();
        System.out.println("Toplam " + countAsal + " adet asal sayı vardır.");
    }
}
