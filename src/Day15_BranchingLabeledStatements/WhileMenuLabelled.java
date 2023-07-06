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
        int bakiye = 1000;
        int tutar = 0;
        int secim = 1;
        Scanner sc = new Scanner(System.in);

        anaMenu:
        while (secim != 0) {
            System.out.println("--------Menu----------");
            System.out.println("1-Bankacılık işlemleri");
            System.out.println("2-Kredi kartı işlemleri");
            System.out.println("3-Bakiye görüntüleme");
            System.out.println("0-Programdan çıkış");
            System.out.println();
            System.out.print("Seçiminiz -----> ");
            secim = sc.nextInt();

            switch (secim) {
                case 1:
                    //Bankacilik işlemleri
                    bankaIslmMenu:
                    while (true) {
                        System.out.println("Bankacılık işlemleri-Menüsü");
                        System.out.println("1-Para çekme");
                        System.out.println("2-Para yatırma");
                        System.out.println("3-Bakiye görünteleme");
                        System.out.println("4-Ana menü");
                        System.out.println("5-Programdan çık");
                        System.out.println();
                        System.out.print("Seçiminiz ---> ");
                        secim = sc.nextInt();

                        switch (secim) {
                            case 1:
                                System.out.println("*** Para çekme işlemi ***");
                                System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                                tutar = sc.nextInt();
                                bakiye = paraCek(bakiye,tutar);
                                System.out.println("Güncel Bakiye = " + bakiye);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("*** Para yatırma işlemi ***");
                                System.out.print("Yatırmak istediğiniz para miktarını giriniz : ");
                                tutar = sc.nextInt();
                                bakiye = paraYatir(bakiye,tutar);
                                System.out.println("Güncel Bakiye = " + bakiye);
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("Bakiyeniz görüntülendi");
                                System.out.println("Güncel Bakiye = " + bakiye);
                                System.out.println();
                                break;
                            case 4:
                               break bankaIslmMenu; //İçinde bulunduğumuz menuyu break edersek dıştaki loop a döneriz
                               // continue anaMenu; //Ana menüye git- ana menünün başından tekrar et
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
                    System.out.println("Güncel Bakiye = " + bakiye);
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

    public static int paraCek(int bakiye, int tutar){
        if(bakiye >= tutar){
            return bakiye - tutar;
        }
        return bakiye;
    }
    public static int paraYatir(int bakiye, int tutar){
        if(tutar > 0){
            return bakiye + tutar;
        }else return bakiye;
    }
}
