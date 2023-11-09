/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day28_REVIEW_Arrays;

import java.util.Arrays;

public class RaggedArraySentenceAndWords {
    //Ragged arrayleri buradaki örnekte de olduğu gibi bir metin içerisindeki cümleleri
    // ve cümleleri oluşturan farklı sayıdaki kelimeleri ayrıştırmak için kullanabiliriz

    public static void main(String[] args) {
        String text = "Bu içerisinde cümleler olan örnek bir dokümandır. İçerisinde bir çok cümle ve cümleler içerisinde kelimeler vardır." +
                " Cümleler birbirlerinden nokta ile ayrılırlar. Kelimeler ise cümle içerisinde boşluk ile birbirlerinden ayrılırlar. ";

        String[] cumleler = text.split("\\. "); //  '.' karakteri regex için farklı bir anlamı olduğu için '.' karakteri ile split için "\\" escape karakteri kullanmamız gerekir
        System.out.println("cumleler.length = " + cumleler.length);
        /*for (String cumle: cumleler){
            System.out.println("cumle = " + cumle.trim());
        }*/
        System.out.println("Arrays.toString(cumleler) = " + Arrays.toString(cumleler));

        //Her bir cümleyi kelimelerine ayırıp bir diziye ekleyelim. Her cümledeki kelime sayısı farklı olacağından kelimeler dizisi bir ragged/jagged dizi olacaktır
        String[][] kelimeler = new String[cumleler.length][];
        for (int i = 0; i < cumleler.length; i++) {
            kelimeler[i] = cumleler[i].split(" "); //Cümleyi ' ' karakterini ayraç olarak kullanarak kelimelerine ayırır
        }
        System.out.println("Arrays.deepToString(kelimeler) = " + Arrays.deepToString(kelimeler));

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println((i + 1) + ". satır ---> Kelime sayısı : " + kelimeler[i].length);
            System.out.println("-------------------------");
           // System.out.println("Cümle : " + Arrays.deepToString(kelimeler[i]));
            for (int j = 0; j < kelimeler[i].length; j++) {
                System.out.println("    " + (j + 1) + "-" + kelimeler[i][j] + " ");
            }
            System.out.println();
        }
    }
}
