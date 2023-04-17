/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample3 {
    // Custom .contains() metodu
    public static boolean varMi(ArrayList liste, String eleman) {
        /*if (liste.indexOf(eleman) >= 0) {
            return true;
        } else return false;*/

       return (liste.indexOf(eleman) >=0 ?  true : false);
    }

    public static void main(String[] args) {
        //.indexOf(), .lastIndexof()
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazar");
        gunler.add("Salı");
        gunler.add("Cuma");
        gunler.add("Pazar");
        gunler.add("Çarşamba");

        System.out.println("gunler = " + gunler);
        System.out.println("gunler.indexOf(\"Pazar\") = " + gunler.indexOf("Pazar"));
        System.out.println("gunler.lastIndexOf(\"Pazar\") = " + gunler.lastIndexOf("Pazar")); //Birden fazla veri varsa en sondakinin index bilgisini verir.

        // Custom .contains() metodu
        System.out.println("varMi(gunler,\"Cuma\") = " + varMi(gunler, "Cuma"));
        System.out.println("varMi(gunler,\"Cumartesi\") = " + varMi(gunler, "Cumartesi"));

        //.contains() metodu
        System.out.println("gunler.contains(\"Cuma\") = " + gunler.contains("Cuma"));
        System.out.println("gunler.contains(\"Cumartesi\") = " + gunler.contains("Cumartesi"));
    }
}
