/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day23_ScannerClass;

import java.util.Scanner;

public class ScannerNextNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Klavyeden yaşınızı giriniz : ");
        System.out.println("Girdiğiniz değer = " + scanner.nextInt());

        scanner.nextLine(); //Klavye bufferında kalan kullanılmayan karakterleri siler

        System.out.print("Klavyeden adınızı giriniz : ");
        System.out.println("Girdiğiniz değer = " +  scanner.nextLine());

        System.out.print("Klavyeden vize notunu giriniz : ");
        System.out.println("Girdiğiniz değer = " + scanner.nextInt());

        System.out.print("Klavyeden final notunu giriniz : ");
        System.out.println("Girdiğiniz değer = " + scanner.nextInt());


    }
}
