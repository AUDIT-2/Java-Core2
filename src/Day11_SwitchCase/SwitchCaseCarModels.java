/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day11_SwitchCase;

import java.util.Scanner;

public class SwitchCaseCarModels {
    public static void main(String[] args) {
        Scanner araba = new Scanner(System.in);
        String arabaModeli = "";

        System.out.print("Bir araba modeli giriniz : ");
        arabaModeli = araba.nextLine(); //Klavyeden String(metin) türü veri girişi için.

        switch (arabaModeli){
            case "Mercedes":
            case "mercedes":
            case "MERCEDES":
                System.out.println("Good one.");
                break;
            case "Volvo": case "volvo": case "VOLVO":
                System.out.println("Tough one.");
                break;
            case "Opel","opel","OPEL":
                System.out.println("Not bad.");
                break;
            case "Şahin","şahin","ŞAHİN":
                System.out.println("Not recommended!");
                break;
            default:
                System.out.println("Do not buy that car.");
        }
    }
}
