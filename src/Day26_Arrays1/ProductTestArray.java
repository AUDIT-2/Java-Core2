/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day26_Arrays1;

public class ProductTestArray {
    public static void main(String[] args) {
        Product[] sepet = new Product[30];

        Product product1 = new Product("Elma",15,3);
        Product product2 = new Product("Peynir",125,1);
        Product product3 = new Product("Zeytin",85,1.5);
        Product product4 = new Product("Süt",15,2);

        sepet[0] = product1;
        sepet[1] = product2;
        sepet[2] = product3;
        sepet[27] = product4;

        double toplamFiyat = 0;
        System.out.println("Sepetinizin toplam kapasitesi : " + sepet.length);
        //System.out.println("Sepetinizde toplam " + sepet.length + " adet ürün var.");

        int count = 0;
        System.out.println("Sepetinizdeki ürünlerin listesi");
        System.out.println("-------------------------------");
        //There is an error in loop. Please make suitable corrections.
        for(Product urun :sepet){
            if(urun != null){
                count++;
                System.out.println("Ürünün adı    = " + urun.name);
                System.out.println("Birim Fiyatı  = " + urun.price);
                System.out.println("Miktarı       = " + urun.miktar);

                toplamFiyat += urun.fiyatHesapla();
                System.out.println("-----------------------");
            }
        }
        System.out.println("Sepetinizde toplam " + count + " adet ürün var.");
        System.out.println("-----------------------");
        System.out.println("Toplam fiyat = " + toplamFiyat);
        System.out.println("-----------------------");
    }
}
