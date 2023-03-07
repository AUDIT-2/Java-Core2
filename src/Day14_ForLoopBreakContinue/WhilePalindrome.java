package Day14_ForLoopBreakContinue;

import java.util.Scanner;

public class WhilePalindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome sayılar.");
        Scanner klavye = new Scanner(System.in);
        int tersSayi = 0;
        int originalSayi = 0;

        System.out.print("Klavyeden bir tam sayı giriniz ---> ");
        originalSayi = klavye.nextInt();
        int tempSayi = originalSayi;
        while (tempSayi > 0 ){
            tersSayi = (tersSayi * 10) + tempSayi % 10;
            tempSayi = tempSayi / 10;
        }
        if (originalSayi == tersSayi){
            System.out.println("Sayı palindrome dur.");
        }else System.out.println("Sayı palindrome değildir!");

        System.out.println("Klavyeden girilen sayı = " + originalSayi);
        System.out.println("Sayının tersi = " + tersSayi);
    }
}
