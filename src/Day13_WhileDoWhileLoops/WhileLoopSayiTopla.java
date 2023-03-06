/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day13_WhileDoWhileLoops;

import java.util.Scanner;

public class WhileLoopSayiTopla {
    //Klavyeden girilin tam sayıya kadar olan sayıların toplamını hesaplayan bir program yazınız.
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        /*while (i<100){
            sum = sum + i; //sum += i
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("sum = " + sum);
*/
        Scanner klavye = new Scanner(System.in);
        int sayi = 0;

        System.out.print("Klavyeden bir tam sayı giriniz : ");
        sayi = klavye.nextInt();
        while (i < sayi){
            sum += i;
            i++;
            if(i % 10 == 0){//her 10 defada bir toplamı ekrana yaz
                System.out.println(i + " -Ara toplam = " + sum);
            }
        }
        System.out.println("sum = " + sum);
    }
}
