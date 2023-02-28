/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day11_SwitchCase;

import java.util.Scanner;

public class SwitchCaseMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ABC Bankasına hoş geldiniz");
        System.out.println("--------------------------");
        System.out.println("1-Baki görüntüleme");
        System.out.println("2-Para Çekme");
        System.out.println("3-Para yatırma");
        System.out.println("4-Çıkış");
        System.out.print("Hangi işlemi yapmak istiyorsunuz ---> ");
        int secim = scanner.nextInt();
        int bakiye = 5000;

        switch (secim){
            case 1:
                System.out.println("Bakiyeniz = " + bakiye + " TL");
                break;
            case 2:
                System.out.print("Çekeceğiniz para miktarını giriniz ---> ");
                int miktar = scanner.nextInt();
                if(miktar > bakiye){
                    System.out.println("Yetersiz bakiye");
                    System.out.println("En fazla Çekebileceğiniz miktar = " + bakiye + " TL");
                }else {
                    //bakiye = bakiye - miktar;
                    bakiye -= miktar;
                    System.out.println("Güncel bakiyeniz = " + bakiye + " TL");
                }
                break;
            case 3:
                System.out.print("Yatıracağınız para miktarını giriniz ---> ");
                miktar = scanner.nextInt();
                //bakiye = bakiye + miktar;
                bakiye += miktar;
                System.out.println("Güncel bakiyeniz = " + bakiye + " TL");
                break;
            case 4:
                System.out.println("Bankamızı tercih ettiğiniz için teşekkürler.");
                break;
            default:
                System.out.println("Geçersiz işlem...!");
        }
    }
}
