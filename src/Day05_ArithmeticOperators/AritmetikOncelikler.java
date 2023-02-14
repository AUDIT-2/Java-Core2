package Day05_ArithmeticOperators;

public class AritmetikOncelikler {
    public static void main(String[] args) {
        System.out.println("Aritmetik işlemlerde operatörlerin öncelikleri.");
        int hesapSonuc;
        hesapSonuc = 18 + 9 / 3;
        /*
        18 + (9 / 3)
        18 + 3
        21
         */
        System.out.println("İşlem sonucu(18 + 9 / 3) = " + hesapSonuc);

        hesapSonuc = 10 + 20 * 30;
        /*
        10 + (20 * 30);
        10 + 600;
        610;
         */
        System.out.println("İşlem sonucu(10 + 20 * 30) = " + hesapSonuc);
        hesapSonuc = 10 * 20 / 5; //Öncelik dereceleri aynı olduğundan soldan sağa doğru hesaplanır
        /*
        (10*20) / 5
        200 / 5
        40
         */
        System.out.println("İşlem sonucu(10 * 20 / 5) = " + hesapSonuc);

        hesapSonuc = 8 + 2 * 3 - 21 / 7 + 6;

        System.out.println("İşlem sonucu(8 + 2 * 3 - 21 / 7 + 6) = " + hesapSonuc);
        /*
        8 + (2 * 3) - (21 / 7) + 6
        8 + 6 - 3 + 6
        14 - 3 + 6
        11 + 6
        17
         */
    }
}
