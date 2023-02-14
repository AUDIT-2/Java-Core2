package Day05_ArithmeticOperators;

public class AritmetikOperatorler {
    public static void main(String[] args) {
        System.out.println("Aritmetik operatörler.");
        System.out.println("----------------------");

        int addition, subtraction, division, multiplication, modulus;
        int num1;
        int num2;

        num1 = 10;
        num2 = 3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("----------------");

        //Toplama
        System.out.println("Toplama(Addition)");
        addition = num1 + num2;
        System.out.println("num1 + num2 = " + addition);
        System.out.println();

        //Subtraction
        System.out.println("Çıkartma(Subtraction)");
        subtraction = num1 - num2;
        System.out.println("num1 - num2 = " + subtraction);
        System.out.println();

        //Division
        System.out.println("Bölme(Division)");
        division = num1 / num2;
        System.out.println("num1 / num2 = " + division);
        System.out.println();

        //Multiplication
        System.out.println("Çarpma(Multiplication)");
        multiplication = num1 * num2;
        System.out.println("num1 * num2 = " + multiplication);
        System.out.println();

        //Modulus
        System.out.println("Mod alma(Modulus)");
        modulus = num1 % num2; //Bölümden kalan tam sayı.
        System.out.println("num1 % num2 = " + modulus);
        System.out.println();

        //Sayıların tek mi çift mi olduğunu anlamak için modulo operatörü kullanımı
        modulus = num1 % 2; // sonuç 0 çıkarsa sayı çifttir 1 çıkarsa sayı tek sayıdır.
        System.out.println("num1 = " + num1);
        System.out.println("num1 % 2 = " + modulus);
        System.out.println();

        num2 = 123124427;
        modulus = num2 % 2; // sonuç 0 çıkarsa sayı çifttir 1 çıkarsa sayı tek sayıdır.
        System.out.println("num2 = " + num2);
        System.out.println("num2 % 2 = " + modulus);
        System.out.println();

        modulus = num2 % 1000; // 1000' ler basamağını yazdırır
        System.out.println("num2 % 1000 = " + modulus);

    }
}
