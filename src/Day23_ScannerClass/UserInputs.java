/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Klavyeden byte tipinde bir veri giriniz : ");
        byte byte1 = scanner.nextByte(); //-128 ile 127 arasında bir tamsayı
        System.out.println("Girdiğiniz değer = " + byte1);

        System.out.print("Klavyeden short tipinde bir veri giriniz : ");
        short short1 = scanner.nextShort();
        System.out.println("Girdiğiniz değer = " + short1);

        System.out.print("Klavyeden int tipinde bir veri giriniz : ");
        int int1 = scanner.nextInt();
        System.out.println("Girdiğiniz değer = " + int1);

        System.out.print("Klavyeden long tipinde bir veri giriniz : ");
        long long1 = scanner.nextLong();
        System.out.println("Girdiğiniz değer = " + long1);

        System.out.print("Klavyeden float tipinde bir veri giriniz : ");
        float float1 = scanner.nextFloat();
        System.out.println("Girdiğiniz değer = " + float1);

        System.out.print("Klavyeden double tipinde bir veri giriniz : ");
        double double1 = scanner.nextDouble();
        System.out.println("Girdiğiniz değer = " + double1);

        System.out.print("Klavyeden boolean tipinde bir veri giriniz : ");
        boolean boolean1 = scanner.nextBoolean()    ;
        System.out.println("Girdiğiniz değer = " + boolean1);
    }
}
