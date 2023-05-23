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
           /* System.out.println(dosyaOku.nextLine());
            System.out.println(dosyaOku.nextLine());
            System.out.println(dosyaOku.nextLine());
            System.out.println(dosyaOku.nextLine());

            System.out.println(dosyaOku.nextLine()); //Olmayan bir satırı okuduğumuz için hata oluşur*/

            while (dosyaOku.hasNextLine()){
                System.out.println(dosyaOku.nextLine());
            }

        } catch (FileNotFoundException | NoSuchElementException e) {
            System.out.println("Hata: " + e.getMessage());
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
