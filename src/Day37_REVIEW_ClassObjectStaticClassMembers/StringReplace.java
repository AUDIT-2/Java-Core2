/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen klavyeden bir metin(cümle) giriniz : ");
        String str = scanner.nextLine();
        System.out.print("Lütfen klavyeden bir kelime giriniz : ");
        String strWord = scanner.nextLine();

        str= str.replace(strWord,strWord.toUpperCase());

        System.out.println("str = " + str);

        System.out.println("kelimeDegistir(str,strWord) = " + kelimeDegistir(str, strWord));
    }

    public static String kelimeDegistir( String text, String kelime){
        String result;
        System.out.println("Metod ile yaptım.");
        result = text.replace(kelime,kelime.toUpperCase());
      return result;
    }
}
