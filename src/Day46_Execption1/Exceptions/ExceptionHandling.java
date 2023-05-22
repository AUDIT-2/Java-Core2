/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Execption1.Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {
        //Handling with try{} catch{} block
        try {
            //try block
            //codes which are monitored.
            //code throws exception
        }catch (Exception e){
            //catch block
            //Handling the exception
        }

        int sayA = 15;
        int sonuc = 0;

        System.out.println("Test started.");
        try {
         /*   sonuc = sayA / 3;
            System.out.println("sonuc = " + sonuc);
*/
            sonuc = sayA / 0;
            System.out.println("sonuc = " + sonuc);

        }catch (ArithmeticException aritmetikHata){
            System.out.println("Bir sayı 0'a bölünemez!.");
         /*   System.out.println("O yüzden 1' e bölümünü yazdırıyorum.");
            sonuc = sayA/1;
            System.out.println("sonuc = " + sonuc);*/
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Bir hata oluştu!");
        }
        System.out.println("Test ended.");
    }
}
