/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Execption2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOps {
    public static void main(String[] args) {
        File file = new File("src/Day47_Execption2/Data.txt");
        Scanner dosyaOku = null;

        try {
            dosyaOku = new Scanner(file);
            //Aşağıdaki .nextLine() metodu ile her seferinde dosyadan bir satır okunur.

           /* System.out.println(dosyaOku.nextLine());
            System.out.println(dosyaOku.nextLine());
            System.out.println(dosyaOku.nextLine());
            System.out.println(dosyaOku.nextLine());

            //Dosyada olmayan bir satır okumak istersek NoSuchElementException hatası oluşur
            System.out.println(dosyaOku.nextLine()); */

            //Bu loop ile dosya satır satır dosya sonuna kadar okunur.
            while (dosyaOku.hasNextLine()){
                System.out.println(dosyaOku.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Hata: Okumaya çalıştığınız dosya sistemde bulunamıyor!!!");
            System.err.println("Hata: " + e.getMessage());
        }catch (NoSuchElementException e){
            System.err.println("Hata: Dosyada olmayan bir satır okunmaya çalışıyor!!!");
            System.err.println("Hata: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block has executed.");
            if(dosyaOku != null){
                System.out.println("Scanner objesini close ettim.");
                dosyaOku.close();
            }
        }
    }
}
