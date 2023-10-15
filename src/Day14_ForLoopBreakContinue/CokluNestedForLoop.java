package Day14_ForLoopBreakContinue;

public class CokluNestedForLoop {

    public static void main(String[] args) {

        int sayac1 = 0;
        int sayac2 = 0;
        int sayac3 = 0;

        for(int i=1; i<=5; i++){
            System.out.println("En dis dongu : " + i); // 5 adet toplam dongu

            for(int j=1; j<=5; j++){
                System.out.println("  Orta Dongu : " + j); // 5 * 5 = 25 adet toplam dongu

                for(int k=1; k<=5; k++){
                    System.out.println("    Ic dongu " + k); // 5 * 5 * = 125 adet toplam dongu
                    sayac3++;
                }
                sayac2++;
            }
            sayac1++;
        }

        System.out.println("sayac1 = " + sayac1); // sayac1 = 5
        System.out.println("sayac2 = " + sayac2); // sayac2 = 25
        System.out.println("sayac3 = " + sayac3); // sayac3 = 125
    }
}
