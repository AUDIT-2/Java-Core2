/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day03_Variables1;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Variables in Java.");
        System.out.println("-------------------");
        boolean evliMi; //Declaration of variable evliMi - true or false
        evliMi = true; //Assignment of variable evliMi

        System.out.println(evliMi);
        System.out.println("Evli mi?: " + evliMi);

        char subeAdi = 'A';
        System.out.println("Şube adı : " + subeAdi);
        char karakter = 66; //655535 farklı karakter için kullanılbilir
        System.out.println("Karakter : " + karakter);

        karakter = 125;
        System.out.println("Karakter : " + karakter);

        karakter = 25343;
        System.out.println("Karakter : " + karakter);

        //Tam sayılar için veri tipleri-  byte - short - int - Long

        byte siraNumarasi = 125; //Declaration of variable siraNumarasi and assign a initial value- -128, 127
        System.out.println("Öğrenci sıra numarası : " + siraNumarasi);

        //short data type -32768, 32767
        short urunKategoriKodNumarasi = 32767;
        System.out.println("Ürün kodu : " + urunKategoriKodNumarasi);

        //integer(tam sayi) int data type -2,147,483,648 to 2,147,483,647
        int salary = 65000;
        System.out.println("Maaşım : " + salary);

        //Long(tam sayı) long data type -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long bankaMusterilerBakiyesi = 9_223_372_036_854_775_807L; //Okumayı kolaylaştıranjn bir gösterim "_"
        System.out.println("Banka müşterileri toplam bakiyesi : " + bankaMusterilerBakiyesi);

        //Float(ondalıklı) float data type
        float kdvOrani = 0.18F;
        System.out.println("KDV oranı : " + kdvOrani);

        //Double(ondalıklı) double data type
        double buyukBirOndalikliSayi = 123456678912345567874753576676412436533123561894535351.3237564557585969432536364610;
        System.out.println("Büyük bir ondalıklı sayı : " + buyukBirOndalikliSayi);

        double kdvTemizlik = 0.12;
        System.out.println("Temizlik ürünleri KDV oranı : " + kdvTemizlik);
    }
}


