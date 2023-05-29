/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Exception1.Exceptions;

public class MultipleExceptions {
    public static void main(String[] args) {

        String[] sehirler = {"Ankara","İstanbul","Malatya"};

        int sayi = 25;
        int bolen = 1;
        int sonuc = 0;

        try {
            sonuc = sayi / bolen;
            System.out.println("sonuc = " + sonuc);
            System.out.println("sehirler[1] = " + sehirler[1]);
            System.out.println("sehirler[10] = " + sehirler[10]); //Exception

        }catch (ArithmeticException aritmetikExp){
            System.out.println("Bir hata oluştu!!!");
            System.out.println("Bir tamsayı 0'a bölünemez!");
            //aritmetikExp.printStackTrace();

        }catch (ArrayIndexOutOfBoundsException arrError){
            System.out.println("Bir hata oluştu.");
            System.out.println("Array de olmayan bir index elemanına erişmek istendi!!!");
        }
        catch (Exception e){
            System.out.println("Bir hata oluştu. Detayı aşağıda...");
            e.printStackTrace();
        }

        System.out.println("-----------Multiple Exception in one Catch block----------------------------");

        try {
            sonuc = sayi / bolen;
            System.out.println("sonuc = " + sonuc);
            System.out.println("sehirler[1] = " + sehirler[1]);
            System.out.println("sehirler[10] = " + sehirler[20]); //Exception

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException hata){
            System.err.println("Bir hata oluştu!!!");
            System.err.println("hata.getMessage() = " + hata.getMessage());
           // hata.printStackTrace();
        }
    }
}
