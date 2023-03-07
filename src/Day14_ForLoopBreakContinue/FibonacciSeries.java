package Day14_ForLoopBreakContinue;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //0 ve 1 ile başalayan ve sonraki sayının kendisinden önceki sayı ile toplamı olan seri
        //0 1 1 2 3 5 gibi
        System.out.println("Fibonacci series...");
        int sayi1 = 0;
        int sayi2 = 1;
        int fiboSayi = 0;
        int toplam = 0;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Fibonacci serisini yazdıracağım sayıyı giriniz ---> " );
        fiboSayi = klavye.nextInt();

        for (int i = 0; i < fiboSayi; i++){
            System.out.print(sayi1 + " ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }
}
