/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day17_Method2;

import java.util.Scanner;

public class MetodHesapMakSwitchCase {
    public static void main(String[] args) {
        /*System.out.println("hesapMakinesi(20,5,'+') = " + hesapMakinesi(20, 5, '+'));
        System.out.println("hesapMakinesi(15,5,'-') = " + hesapMakinesi(15, 5, '-'));
        System.out.println("hesapMakinesi(2,5,'*') = " + hesapMakinesi(2, 5, '*'));
        System.out.println("hesapMakinesi(45,3,'/') = " + hesapMakinesi(45, 3, '/'));

        double sonuc;
        sonuc = hesapMakinesi(56,34,'+');
        System.out.println("sonuc = " + sonuc);*/

        Scanner input = new Scanner(System.in);
        double sayi1 = 0;
        double sayi2 = 0;
        char operator = '+';
        double sonuc;

        System.out.print("Birinci sayıyı giriniz = ");
        sayi1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz = ");
        sayi2 = input.nextDouble();

        System.out.print("İşlem operatörünü giriniz(+,-,*,/) : ");
        operator = input.next().charAt(0); //Char bu şekilde okunuyor

        sonuc = hesapMakinesi(sayi1,sayi2,operator);
        System.out.println("sonuc = " + sonuc);
    }
    public static double hesapMakinesi(double sayi1, double sayi2, char operator){
        switch (operator){
            case '+':
                return sayi1 + sayi2;
            case '-':
                return sayi1 - sayi2;
            case '*':
                return sayi1 * sayi2;
            case '/':
                return sayi1 / sayi2;
            default:
                System.out.println("Tanımsız bir operatör.!!!");
                return 0;
        }
    }
}
