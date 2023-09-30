/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day11_SwitchCase;

import java.util.Scanner;

public class AdvancedSwitchCaseAylar {
    public static void main(String[] args) {
        Scanner ayGir = new Scanner(System.in);
        int numberMonth = 1;
        String month = "";

        System.out.print("Lütfen klavyeden 1-12 arası bir ay bilgisi giriniz : ");
        numberMonth = ayGir.nextInt();

        System.out.println("Klasik switch case...");
        switch (numberMonth){
            case 1:
                month = "Ocak";
                break;
            case 2:
                month = "Şubat";
                break;
            case 3:
                month = "Mart";
                break;
            case 4:
                month = "Nisan";
                break;
            case 5:
                month = "Mayıs";
                System.out.println(month + " En sevdiğim aydır..");
                break;
            case 6:
                month = "Haziran";
                break;
            case 7:
                month = "Temmuz";
                break;
            case 8:
                month = "Ağustos";
                break;
            case 9:
                month = "Eylül";
                break;
            case 10:
                month = "Ekim";
                break;
            case 11:
                month = "Kasım";
                break;
            case 12:
                month = "Aralık";
                break;
            default:
                System.out.println("Yanlış ay bilgisi girdiniz. 1-12 arası bir değer olmalı. ");
        }

        if (month !=""){
            System.out.println("Klavyeden girdiğiniz ay bilgisi : " + month);
        }
        System.out.println();
        //Advanced Switch case
        System.out.println("Advanced switch case...");
        switch (numberMonth){
            case 1 -> month = "Ocak";
            case 2 -> month = "Şubat";
            case 3 -> month = "Mart";
            case 4 -> month = "Nisan";
            case 5 -> {//birden fazla satır çalıştıracaksanız {...} kod bloğu açmanız gerekir.
                month = "Mayıs";
                System.out.println(month + " En sevdiğim aydır..");
            }
            case 6 -> month = "Haziran";
            case 7 -> month = "Temmuz";
            case 8 -> month = "Ağustos";
            case 9 -> month = "Eylül";
            case 10 -> month = "Ekim";
            case 11 -> month = "Kasım";
            case 12 -> month = "Aralık";
            default ->  System.out.println("Yanlış ay bilgisi girdiniz. 1-12 arası bir değer olmalı. ");
        }
        if (month !=""){
            System.out.println("Klavyeden girdiğiniz ay bilgisi : " + month);
        }


        //Advanced Switch case
        System.out.println();
        System.out.println("Advanced switch case...");
        switch (numberMonth){
            case 12,1,2 -> System.out.println("Kış aylarındandır.");
            case 3,4,5 -> System.out.println("İlkbahar aylarındandır.");
            case 6,7,8 -> System.out.println("Yaz aylarındandır.");
            case 9,10,11 -> System.out.println("Sonbahar aylarındandır.");
            default ->  System.out.println("Yanlış ay bilgisi girdiniz. 1-12 arası bir değer olmalı. ");
        }

       //if...else if equivalent of switch case
        System.out.println("\nif else if...");
        if(numberMonth == 12 || numberMonth == 1 || numberMonth == 2)
            System.out.println("Kış aylarındandır.");
        else if(numberMonth == 3 || numberMonth == 4 || numberMonth == 5)
            System.out.println("İlkbahar aylarındandır.");
        else if(numberMonth == 6 || numberMonth == 7 || numberMonth == 8)
            System.out.println("Yaz aylarındandır.");
        else if(numberMonth == 9 || numberMonth == 10 || numberMonth == 11)
            System.out.println("Sonbahar aylarındandır.");
        else
            System.out.println("Yanlış ay bilgisi girdiniz. 1-12 arası bir değer olmalı. ");
        System.out.println();

        //Advanced switch case with assigning result to variable
        System.out.println("Advanced switch case(variable)...implementasyonu");
        System.out.print("Klavyeden bir gün değeri giriniz(1-7) : ");
        int day = ayGir.nextInt();
        String dayTxt = switch (day){
            case 1 -> "Pazartesi";
            case 2 -> "Salı";
            case 3 -> "Çarşamba";
            case 4 -> "Perşembe";
            case 5 -> "Cuma";
            case 6 -> "Cumartesi";
            case 7 -> "Pazar";
            default -> "1-7 aralığında bir gün değeri girmeliydiniz!";
        };
        System.out.println(dayTxt);
    }
}
