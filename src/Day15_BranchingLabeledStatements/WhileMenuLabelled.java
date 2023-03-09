/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day15_BranchingLabeledStatements;

import java.util.Scanner;

public class WhileMenuLabelled {
    public static void main(String[] args) {
        int secim = 1;
        Scanner sc = new Scanner(System.in);

   anaMenu: while (secim != 0){
            System.out.println("-----------Menu-----------");
            System.out.println("--------------------------");
            System.out.println("1-Bankacılık işlemleri");
            System.out.println("2-Kredi kartı işlemleri");
            System.out.println("3-Bakiye görüntüleme");
            System.out.println("0-Programdan çıkış");
            System.out.println();
            System.out.print("Seçiminiz -----> ");
            secim = sc.nextInt();

            switch (secim){
                case 1:
                    //Bankacilik işlemleri
                 bankaIslmMenu:
                 while (true){
                        System.out.println("Bankacılık işlemleri-Menüsü");
                        System.out.println("1-Para çekme");
                        System.out.println("2-Para yatırma");
                        System.out.println("3-Bakiye görünteleme");
                        System.out.println("4-Ana menü");
                        System.out.println("5-Programdan çık");
                        System.out.println();
                        System.out.print("Seçiminiz ---> ");
                        secim= sc.nextInt();

                        switch (secim){
                            case 1:
                                System.out.println("Para çekme işlemi.");
                                break;
                            case 2:
                                System.out.println("Para yatırma işlemi");
                                break;
                            case 3:
                                System.out.println("Bakiyeniz görüntülendi");
                                break;
                            case 4:
                                continue anaMenu; //Ana menüye git- ana menünün başından tekrar et
                            case 5:
                                System.out.println("Bankamızı tercih ettiğiniz için teşekkürler.");
                                break anaMenu; // Ana menüyü sonlandır-programı sonlandır
                                default:
                                System.out.println("Yanlış seçim yaptınız!");
                        }
                    }
                case 2:
                    System.out.println("Kredi kartı işlemleri");
                    break;
                case 3:
                    System.out.println("Bakiye görüntüleme");
                    break;
                case 0:
                    secim = 0;
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız!");
            }
        }
        System.out.println("Programdan çıkıldı.");
    }
}
