package Day23_ScannerClass;

import java.util.Scanner;

public class SayiRakamToplami {

    public static void main(String[] args) {
        int rakamToplma  = rakamTopla();

        //rakamTopla() metodundan -1 gibi bir değer dönerse bir problem oluşmuş demektir.
        //Dolayısıyla sonucu yazdırmaya gerek yok. 0'dan büyük bir değer dönerse sonuc yazdırıyoruz.
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
           System.out.println("Girdiğiniz sayı 1-1000 arasında bir tam sayı olmalıdır!");
           return -1;   //Metoda gönderilen parametrede kurallar uymayan bir durum
                        //olduğunu metodu çağırana bildirmek için tercihen metodun normal çalışmasında döndürebileceği değerlerin dışında bir değer seçilbilir.
       }
    }
}