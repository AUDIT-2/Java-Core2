/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day10_ControlFlowStatementsIF_ElseIf_Else;

import java.util.Scanner;

public class Ornek_Nested_If_Else {
    public static void main(String[] args) {
        Scanner veriGir = new Scanner(System.in);
        System.out.println("Nested...if...Else");
        int yas = 0;
        int kilosu = 0;

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = veriGir.nextInt();

        if((yas > 18) && (yas < 65)){ // yaş 18-65 aralığında olmalıdır.
            System.out.println("Yaşınız 18 den büyük.");
            System.out.print("Lütfen kilo bilginizi giriniz : ");
            kilosu = veriGir.nextInt();
            if((kilosu > 50) && (kilosu < 120)){// kilo 50 -  120 arası
                System.out.println("Yaşınız ve kilonuz kan vermeye uygundur.");
            }else System.out.println("Yaşınız 18 den büyük ancak kilonuz kan vermeye elverişli değil.");

        }else System.out.println("Yaşınız kan vermeye uygun değildir..");

    }
}
