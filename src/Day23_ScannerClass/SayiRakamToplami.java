package Day23_ScannerClass;

import java.util.Scanner;

public class SayiRakamToplami {

    public static void main(String[] args) {
        int rakamToplma  = rakamTopla();

        if(rakamToplma > 0){
            System.out.println("Rakamların toplamı = " + rakamToplma);
        }
    }

    public static int rakamTopla(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Klavyeden 1-1000 aralığında bir tam sayı giriniz : ");
        int sayi = scanner.nextInt();

        int basamakSayisi = 0;
       if(sayi > 0 && sayi <= 1000){
           int rakam;
           int toplam = 0;

           while(sayi != 0){
               basamakSayisi++;
               rakam = sayi % 10;
               toplam += rakam;
               sayi /= 10;
           }
           System.out.println("Sayınız " + basamakSayisi + " basamaklıdır.");
           return toplam;
       }else{
           System.out.println("Giriğiniz sayı 1-1000 arasinda bir tam sayı olmalıdır!");
           return -1;
       }
    }
}
