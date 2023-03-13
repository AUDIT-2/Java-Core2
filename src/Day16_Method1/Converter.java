/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day16_Method1;

public class Converter {
    public static void main(String[] args) {
        kdvHesapla(100);
        kdvHesapla(750);
        kdvHesaplaKDVOrani(100,0.25);
        kdvHesaplaKDVOrani(100,0.1);
        kdvHesaplaKDVOrani(100,0.18);
       /* celsiusToFahrenheit(30);
        fahrenheitToCelsius(86);*/

       /* for (int i = 32; i < 50 ; i++) {
          celsiusToFahrenheit(i);
          fahrenheitToCelsius(i);
        }*/
        BMI(60,1.78);
    }

    public static void BMI(int kilo, double boy){
       double BMI = kilo / (boy * boy);
       System.out.println("Vücut kitle indeksi = " + BMI);
       if(BMI > 30){
           System.out.println("Fazla kilolu");
       } else if (BMI >= 25) {
           System.out.println("Hafif obez");
       } else System.out.println("Normal kilolu");
    }

    public static void celsiusToFahrenheit(int celsius){
        //fahrenheit = (celsius * 9) / 5 + 32
        double fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println(celsius + "(c)---> " + fahrenheit + " (f)");
    }
    public static void fahrenheitToCelsius(int fahrenheit){
        //celsius = (5 * (fahrenheit - 32) / 9
        double celsius = (5 * (fahrenheit - 32)) / 9;
        System.out.println(fahrenheit + "(f)---> " + celsius + " (c)");
    }

    public static void kdvHesapla(int fiyat){
        double kdvFiyat = fiyat + (fiyat * 0.18);
        System.out.println("KDV'li fiyat = " + kdvFiyat);
    }

    public static void kdvHesaplaKDVOrani(int fiyat, double kdv){
        double kdvFiyat = fiyat + (fiyat * kdv);
        System.out.println("KDV'Siz fiyat = " + fiyat);
        System.out.println("KDV oranı = " + kdv);
        System.out.println("KDV'li fiyat = " + kdvFiyat);
        System.out.println();
    }

}
