package Day30_WrapperClass2;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String str = "Ahmet-Mehmet-Hasan-Hatice";
        String[] strArray = str.split("-"); //'-' Delimiter character

        System.out.println(str);
        System.out.println(Arrays.toString(strArray));

        System.out.println("strArray[2] = " + strArray[2]);
        System.out.println("strArray[1] = " + strArray[1]);
        System.out.println();

        String str1 = "Elma. Armut. Kayısı. Kiraz";
        System.out.println(str1);
        String[] str1Array = str1.split("\\. "); // '.' karakteri regex'te özel bir anlam taşıdığından "\\" escape karakteri ile kullanılmalı
        System.out.println(Arrays.toString(str1Array));
        for (String s : str1Array){
            System.out.println(s);
        }
        System.out.println();

        String str2 = "Mavi+Sari+Yeşil+Siyah";
        String[] str2Array = str2.split("\\+");
        System.out.println(Arrays.toString(str2Array));
        for (String s : str2Array){
            System.out.println(s);
        }
        System.out.println();
    }
}
