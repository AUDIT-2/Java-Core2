/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

import java.util.Scanner;

public class WrapperExampleScanner1 {
    public static void main(String[] args) {
        //Scanner class known problem and classic solution
        Scanner verGir = new Scanner(System.in);
        String ad = "";
        int okulNo = 0;

        System.out.print("Lütfen okul numaranızı giriniz : ");
        okulNo = verGir.nextInt();   // 12345 \n--> new line karakteri

        verGir.nextLine();//Klasik çözüm olarak sayisal bir veri girişinden sonra buffer da kalan new line karakterini siler.

        System.out.print("Lütfen adınızı giriniz         : ");
        ad = verGir.nextLine();

        System.out.println();

        System.out.println("okulNo = " + okulNo);
        System.out.println("ad = " + ad);

    }
}
