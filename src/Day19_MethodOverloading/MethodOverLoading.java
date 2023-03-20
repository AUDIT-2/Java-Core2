/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day19_MethodOverloading;

public class MethodOverLoading {
    //Klasik metodlar...Her bir işlem için yeni bir metod adı belirlememiz gerekir.
    public static int ikiSayiTopla(int aSayisi, int bSayisi){
        return aSayisi + bSayisi;
    }
    public static int ucSayiTopla(int a, int b, int c){
        return a + b + c;
    }
    public static int dortSayiTopla(int a, int b, int c, int d){
        return a + b + c + d;
    }

    //Method overloading-Farklı sayıda ve farklı veri tiplerinde parametre alan aynı isimde metod yazabilmemizi sağlayan özellik.
    public static int topla(int a, int b){
        System.out.println("iki parametre alan method- int a, int b");
        return a + b;
    }
    public static double topla(int a, double b){
        System.out.println("iki parametre alan method- int a, double b");
        return a + b;
    }
    public static double topla(double a, double b){
        System.out.println("iki parametre alan method- double a, double b");
        return a + b;
    }
    public static double topla(double a, int b){
        System.out.println("iki parametre alan method- double a, int b");
        return a + b;
    }
    public static int topla(int a, int b, int c){
        System.out.println("Üç parametre alan method");
        return a + b + c;
    }
    public static double topla(int a, int b, double c){
        System.out.println("Üç parametre alan method");
        return a + b + c;
    }

    public static double topla(double a, int b, int c){
        System.out.println("Üç parametre alan method");
        return a + b + c;
    }

    public static int topla(int a, int b, int c, int d){
        System.out.println("Dört parametre alan method");
        return a + b + c + d;
    }

    public static int topla(int a, int b, int c, int d, int e){
        System.out.println("Beş parametre alan method");
       /*
        int abc = topla(d,e);
        int xyz = topla(a,b,c);
        return abc + xyz;
        */
      return topla(d,e) + topla(a,b,c);
    }

    public static void main(String[] args) {
        System.out.println("Method overloading in Java.");

        //Klasik metod isimlendirme
        int sonuc = ikiSayiTopla(3,5);
        System.out.println("sonuc = " + sonuc);
        System.out.println("Sonuç-1 = " + ikiSayiTopla(5,10));

        System.out.println("ÜçSayı Toplama sonuç = " + ucSayiTopla(2,5,3));
        System.out.println("Dört sayı toplama sonuç = " + dortSayiTopla(2,5,4,3));

        //Method overloading
        System.out.println();
        System.out.println("topla(5,2) = " + topla(5, 2));
        System.out.println("topla(3,5,8) = " + topla(3, 5, 8));
        System.out.println("topla(8,6,4,2) = " + topla(8, 6, 4, 2));
        System.out.println("topla(30,15.45) = " + topla(30, 15.45));
        System.out.println("topla(22, 3, 45, 65, 6) = " + topla(22, 3, 45, 65, 6));
        System.out.println("topla(2.5,5.3) = " + topla(2.5, 5.3));
    }
}
