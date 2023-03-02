/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day12_TernaryOperator;

import java.util.Scanner;

public class TernarySwitchCase {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int day = 0;
        String dayTxt = "";
        System.out.println("Ternary --- switch case.");
        System.out.print("Bir gün değeri giriniz : ");
        day = klavye.nextInt();

        System.out.println("Switch case...implementasyonu");
        switch (day){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("1-7 aralığında bir gün değeri girmeliydiniz!");
        }
        System.out.println();

        //Ternary operator
        System.out.println("Ternary operator...implementasyonu");
        dayTxt = (day == 1) ? "Pazartesi"
                : (day == 2) ? "Salı"
                : (day == 3) ? "Çarşamba"
                : (day == 4) ? "Perşembe"
                : (day == 5) ? "Cuma"
                : (day == 6) ? "Cumartesi"
                : (day == 7) ? "Pazar"
                : "1-7 aralığında bir gün değeri girmeliydiniz!";
        System.out.println(dayTxt);
        System.out.println();

        //Advanced switch case
        System.out.println("Advanced switch case...implementasyonu");
        switch (day){
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
            default -> System.out.println("1-7 aralığında bir gün değeri girmeliydiniz!");
        }
        System.out.println();

        //Advanced switch case with assigning result to variable
        System.out.println("Advanced switch case(variable)...implementasyonu");
        dayTxt = switch (day){
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
