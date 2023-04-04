/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day26_Arrays1;

import java.util.Arrays;

public class PrintingElementOfArray {
    public static void main(String[] args) {
        System.out.println("Printing element of an Array");
        String[] isimler = {"Ahmet","Kadir","Zeynep","Ayşe"};

        for (int i = 0; i < isimler.length; i++) {
            System.out.println("isimler[i] = " + isimler[i]);
        }
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(i + ". indexteki eleman : " + isimler[i]);
        }

        //For loop ile döngünün elemanlarını dolaşmak---> traversing array with for loop
        for (int i = 0; i < isimler.length; i++) {
            if(i == 2){
                System.out.println((i + 1) + ". eleman : " + isimler[2].toUpperCase());
                continue;
            }
            System.out.println((i + 1) + ". eleman : " + isimler[i]);
        }

        System.out.println("------------------------");

        System.out.println("........For each......");
        //Advanced for loop- for each - Modern for loop
        for(String eleman:isimler){
            System.out.println("eleman = " + eleman);
        }
        System.out.println();

        for(String eleman:isimler){
            if (eleman.equals("Kadir")){
               eleman = eleman.toUpperCase();
            }
            System.out.println("eleman = " + eleman);
        }

        //Arrays.toString(dizi)
        System.out.println();
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
    }
}
