/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Execption1.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 1, toplam = 0;

        while (sayi > 0) {
            System.out.println("Programdan çıkış için 0'dan küçük bir sayı girin.");
            System.out.print("Klavyeden bir tam sayı giriniz : ");

            try {
                sayi = Integer.parseInt(scanner.nextLine()); //int yerine başka tipte bir veri girersek NumberFormatException hatası oluşur.
                //sayi = scanner.nextInt(); //int yerine başka tipte bir veri girersek InputMismatchException hatası oluşur.
                if (sayi < 0) {
                    System.out.println("Programdan çıkılıyor...");
                    break;
                }

                System.out.println("Girilen sayı = " + sayi);
                toplam += sayi;
                System.out.println("toplam = " + toplam);
            } catch (InputMismatchException e) {
                //veritipinin max değerinden büyük bir değer girilfdiğinde
                //veritipinden farkli bir veritipi girildiğinde
                //scanner.nextInt() ile int yerine başka tipte bir veri girersek bu hata oluşur.
                System.err.println("Veritipi uyuşmazlığı hatası oluştu!!!");
                System.err.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
                System.err.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
                 /*
                //Klavyeden enter a basıldığında girilen nextInt() tarafından integer ile alınır newline karakteri bufferda kalır.
                 O yüzden loop a girmemesi için nextLine ile buffer boşaltılması gerekir.
                 */
                scanner.nextLine(); //Klavye bufferdaki \n karakterini silmek için
            } catch (NumberFormatException e) {
                //veritipine uymayan bir tip dönüştürmesi yapılmaya çalışıldığında..>  int sayi = Integer.parseInt ("abc") ;
                System.err.println("Sayı format uyumsuzluğu!!!");
                System.err.println("Exception class name : " + e.getClass().getSimpleName()); //Hata classı
                System.err.println("Exception Message    : " + e.getMessage()); //Orijinal hata mesajı
            } catch (Exception e) {
                //Yukarıdaki exception larda yakalanamayan başka bir hata oluşursa burda yakalansın.
                e.printStackTrace(); //Hatanın bütün detaylarını konsola yazdır...
            }
        }
    }
}
