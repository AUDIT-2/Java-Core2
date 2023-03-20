/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day19_MethodOverloading;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Standart Main metodu.");
        main("Deneme");
        main(3,5);
    }
    public static void main(String args){
        System.out.println("Overload edilmiş main metodu.");
        System.out.println(args);
    }
    public  static  void main(int a, int b){
        System.out.println(a + b);
    }
}
