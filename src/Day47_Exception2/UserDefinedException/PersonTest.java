/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception2.UserDefinedException;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = null;
        try {
            person = new Person("Ahmet","12345678901",45,"Adresi");
        }catch (NameException | TCNOException | AgeException e){
            System.out.println(e.getMessage());
        }
        while (true){
            System.out.print("Lütfen adınızı giriniz : ");
            try {
                person.setName(scanner.nextLine());
                break;
            }catch (NameException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            System.out.print("Lütfen TC nosunu giriniz : ");
            try {
                person.setTCNO(scanner.nextLine());
                break;
            }catch (TCNOException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            System.out.print("Lütfen yaş bilginizi giriniz : ");
            try {
                person.setAge(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (AgeException e){
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException e){
                System.out.println("Hata : Yanlış formatta bir veri girdiniz. Tamsayı olmalı!!!");
            }
        }


        System.out.println(person);
    }
}
