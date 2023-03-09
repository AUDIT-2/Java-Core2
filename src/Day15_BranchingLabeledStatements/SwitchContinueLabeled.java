package Day15_BranchingLabeledStatements;

import java.util.Scanner;

public class SwitchContinueLabeled {
    public static void main(String[] args) {
        //Switch case yapısı içerisinde Labeled ifadeler ve break ve continue branching ifadelerinin kullanımına örnek kod
        /*
        Labels
            -anaMenu
            -bankaIslemler
            -krediIslemler
         */
        Scanner klavye = new Scanner(System.in);
        int secenek;

           //anaMenu Label
anaMenu: while (true){
            System.out.println("------------------------");
            System.out.println("-------Ana Menu---------");
            System.out.println("1-Bankacılık işlemleri");
            System.out.println("2-Kredi kartı işlemleri");
            System.out.println("3-Programdan çıkış");
            System.out.println("------------------------");
            System.out.println();
            System.out.print("Seçeneğiniz-----> ");
            secenek = klavye.nextInt();

            switch (secenek) {
                  case 1:
                      //bankaIslemler Label
                      bankaIslemler:
                      while (true){
                          System.out.println("-----Bankacılık işlemleri------");
                          System.out.println("1-Para çekme");
                          System.out.println("2-Para yatırma");
                          System.out.println("3-Ana menu");
                          System.out.println();
                          System.out.print("Seçeneğiniz----> ");
                          secenek = klavye.nextInt();
                      switch (secenek) {
                          case 1:
                              System.out.print("Çekeceğiniz tutar---> ");
                              secenek = klavye.nextInt();
                              System.out.println( secenek + " TL Para çekme işlemi gerçekleşti.");
                              System.out.println();
                              continue;
                          case 2:
                              System.out.print("Yatıracağınız tutar---> ");
                              secenek = klavye.nextInt();
                              System.out.println(secenek + " TL Para yatırma işlemi gerçekleşti.");
                              System.out.println();
                              continue;
                          case 3:
                              continue anaMenu;
                          default:
                              System.out.println("<<<Yanlış seçim>>>");

                      }
                    }
                  case 2:
                      krediIslemler: //krediIslemler Label
                      while (true) {
                          System.out.println("-----Kredi kartı işlemleri------");
                          System.out.println("1-Ekstre görüntüle");
                          System.out.println("2-Kredi kartı borç öde");
                          System.out.println("3-Ana menu");
                          System.out.println();
                          System.out.print("Seçeneğiniz----> ");
                          secenek = klavye.nextInt();

                          switch (secenek) {
                              case 1:
                                  System.out.println("Kredi kartı ekstresi görüntülendi");
                                  continue;
                              case 2:
                                  while (true){
                                      System.out.println("-----Borç işlemleri------");
                                      System.out.println("1-Tutar girerek öde");
                                      System.out.println("2-Hesaptan öde");
                                      System.out.println("3-K.Kartı işlemleri menu");
                                      System.out.println("4-Ana menu");
                                      System.out.println("5-Programdan çık");
                                      System.out.println();
                                      System.out.print("Seçeneğiniz----> ");
                                      secenek = klavye.nextInt();

                                      switch (secenek){
                                          case 1:
                                              System.out.print("Kredi kartı ödenecek borç miktarını giriniz---> ");
                                              secenek = klavye.nextInt();
                                              System.out.println(secenek + " TL Kredi kartı borç ödeme işlemi gerçekleşti.");
                                              System.out.println();
                                              continue;
                                          case 2:
                                              System.out.println("Kredi kartı borç ödeme hesabınızdan gerçekleşti. ");
                                              continue;
                                          case 3:
                                              continue krediIslemler;
                                          case 4:
                                              continue anaMenu;
                                          case 5:
                                              System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz.");
                                              break anaMenu;
                                          default:
                                              System.out.println("<<<Yanlış seçim>>>");
                                      }
                                  }
                              case 3:
                                  continue anaMenu;
                              default:
                                  System.out.println("<<<Yanlış seçim>>>");
                          }
                      }
                  case 3:
                      System.out.println("Bankamızı tercih ettiğiniz için teşekkürler.");
                      break anaMenu;
                  default:
                      System.out.println("<<<Yanlış seçim>>>");
            }
        }
    }
}
