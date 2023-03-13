/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day16_Method1;

public class NotOrtalamaYaz {
    public static void main(String[] args) {
      notHarfYaz(55.55);
      notHarfYaz(95.55);
      notHarfYaz(80.0);
    }

    public static void notHarfYaz(double dersNotu){
        if(dersNotu >= 90.0){
            System.out.println("A");
        } else if(dersNotu >= 80.0){
            System.out.println("B");
        } else if(dersNotu >= 70.0){
            System.out.println("C");
        } else if (dersNotu >= 60.0) {
            System.out.println("D");
        } else System.out.println("F");
    }
}
