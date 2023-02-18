/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day06_CastOperators;

public class TypePromotion {
    public static void main(String[] args) {
        System.out.println("Type promotion in Java.");
        /*
            byte veya short veri tipinde tanımlanmış değişkenler ile aritmetik işlem yapılmak istendiğinde
            JAVA bunları ön tanımlı olarak geçici olarak int kabul eder o yüzden aritmetik işlem sonucu ya ilgili veri tipine
            cast edilmeli ya da daha büyük bir veri tipinde tanımlanmış değişkene atanmalıdır.
            Dolayasıyla Java bir aritmetik işlemde byte veya short veri tipini geçici olarak PROMOTE eder ve int olarak değerlendirir.
         */
        short firstNumber = 10;
        short secondNumber = 20;
        short total;
        int totalInt;

        //total = firstNumber + secondNumber;  //  bu satır hatalıdır. Yukarıdaki açıklama gereği short veri tipi ile aritmetik işlemde JAVA int olarak değerlendirir.
        total = (short) (firstNumber + secondNumber); //Hatanın çözümü: sonucu (short) cast etmek olabilir.
        System.out.println("total = " + total);

        //Hatanın çözümü: sonucu daha büyük bir veri tipine mesela int veri tipindeki bir değişkene widening yaparak atama olabilir.
        totalInt = firstNumber + secondNumber;
        System.out.println("totalInt = " + totalInt);

        //Yukarıdaki short veri tipi için yapılan açıklamalar byte için de geçerlidir.
        byte byte1 = 15;
        byte byte2 = 25;
        byte byteToplam;

        //byteToplam = byte1 + byte2; //bu satır hatalıdır.
        byteToplam = (byte) (byte1 + byte2) ;
        total = (short) (byte1 + byte2) ;
        totalInt = byte1 + byte1;
        System.out.println("Byte toplam : " + byteToplam);
    }
}
