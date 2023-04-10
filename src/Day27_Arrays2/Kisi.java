/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

public class Kisi {
    String adi;
    String soyadi;
    int telNo;
    String adres;

    public Kisi(){

    }
    public Kisi(String adi,String soyadi, int telNo, String adres){
        this.adi = adi.trim();
        this.soyadi = soyadi.trim();
        this.telNo = telNo;
        this.adres = adres.trim();
    }
    public void printInfo(){
        System.out.println("Adı           : " + this.adi);
        System.out.println("Soyadı        : " + this.soyadi);
        System.out.println("Telefonu      : " + this.telNo);
        System.out.println("Adresi        : " + this.adres);
        System.out.println("-------------------------");
    }

    //Klastan nesne üretmeden metodu kullanabilmek için static olarak tanımladık. Klasa ait bir metod olmuş oldu.
    //Klas adi ve nokta operatörü ile bu metodu çağırabiliriz.  Kisi.isimdenBul()
    public static void isimdenBul(Kisi[] rehber, String isim){
        System.out.println("İsimden bul metodu çalıştı");
        System.out.println("Rehberimdeki " + isim + " kişilerin bilgileri");
        System.out.println("-------------------------------------");
        int sayac = 0;
        for (Kisi kisi :rehber){
            if (kisi!=null && kisi.adi != null && kisi.adi.contains(isim)){
                sayac++;
                kisi.printInfo();
                System.out.println("------------------");
            }
        }
        if(sayac == 0){
            System.out.println("Rehberde " + isim + " isimli kişiye ait bilgiye rastlanmadı!");
        } else System.out.println(sayac + " kayıt listelendi.");
    }

    public static void soyadtanBul(Kisi[] rehber, String soyad){
        //Odev olarak bu metodu tamamlayınız.
        System.out.println("İsimden bul metodu çalıştı");
        System.out.println("Rehberimdeki " + soyad + " kişilerin bilgileri");
        System.out.println("-------------------------------------");
        int sayac = 0;
        for (Kisi kisi :rehber){
            if (kisi!=null && kisi.soyadi != null && kisi.adi.contains(soyad)){
                sayac++;
                kisi.printInfo();
                System.out.println("------------------");
            }
        }
        if(sayac == 0){
            System.out.println("Rehberde " + soyad + " soyadlı kişiye ait bilgiye rastlanmadı!");
        } else System.out.println(sayac + " kayıt listelendi.");
    }

    public static void advesoyadtanBul(Kisi[] rehber, String isim, String soyad){
        //Odev olarak bu metodu tamamlayınız.
        System.out.println("İsimden bul metodu çalıştı");
        System.out.println("Rehberimdeki " + isim + " " + soyad + " kişilerin bilgileri");
        System.out.println("-------------------------------------");
        int sayac = 0;
        for (Kisi kisi :rehber){
            if (kisi!=null && kisi.adi!= null && kisi.soyadi!= null && kisi.adi.contains(isim) && kisi.soyadi.contains(soyad)){
                sayac++;
                kisi.printInfo();
                System.out.println("------------------");
            }
        }
        if(sayac == 0){
            System.out.println("Rehberde " + isim+ " " + soyad + " ad ve soaydlı kişiye ait bilgiye rastlanmadı!");
        } else System.out.println(sayac + " kayıt listelendi.");
    }
    public static void telefonBul(Kisi[] rehber, int telefon){
        //Odev olarak bu metodu tamamlayınız.
        System.out.println("İsimden bul metodu çalıştı");
        System.out.println("Rehberimdeki " + telefon + " telefon numaralı kişilerin bilgileri");
        System.out.println("-------------------------------------");
        int sayac = 0;
        for (Kisi kisi :rehber){
            if (kisi!=null && kisi.telNo == telefon){
                sayac++;
                kisi.printInfo();
                System.out.println("------------------");
            }
        }
        if(sayac == 0){
            System.out.println("Rehberde " + telefon + " telefon numaralı kişi kaydına rastlanmadı!");
        } else System.out.println(sayac + " kayıt listelendi.");
    }

    //Klastan nesne üretmeden metodu kullanabilmek için static olarak tanımladık. Klasa ait bir metod olmuş oldu.
    //Klas adi ve nokta operatörü ile bu metodu çağırabiliriz.  Kisi.listele()
    public static void listele(Kisi[] kisiler){
        System.out.println("Rehberde kayıtlı kişilerin listesi.");
        for (Kisi kisi : kisiler) {
            if(kisi!=null) {
                kisi.printInfo();
                System.out.println("------------------------------------");
            }
        }
    }
}
