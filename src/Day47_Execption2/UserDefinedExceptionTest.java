/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Execption2;

import java.util.Scanner;

public class UserDefinedExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int weight = 0;

        while (true){
            System.out.print("Lütfen yaş bilginizi giriniz : ");
            try {
                age  = Integer.parseInt(scanner.nextLine());
                if(age < 18){
                   // System.out.println(age  + " yaşında olduğunuzdan oy kullanamazsınız!!!.");
                   // throw new RuntimeException(age  + " yaşında olduğunuzdan oy kullanamazsınız!!!.");
                    throw  new YasHatasi(age  + " yaşında olduğunuzdan oy kullanamazsınız!!!.");
                } else System.out.println(age  + " yaşında olduğunuzdan oy kullanabilirisiniz.");
                break;
            }catch (NumberFormatException e){
                System.out.println("Hata: Yanlış formatta bir veri girdiniz!!!");
            }
            catch (YasHatasi e){
                System.out.println("Oy kullanma hatası!!!");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Yaşınız : " + age);
    }
}
