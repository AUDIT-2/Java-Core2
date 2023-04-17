/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

public class MobilyaProgram {
    public static void main(String[] args) {
        Mobilya mobilya1 = new Mobilya("Masa","Ceviz","Ahşap",2500);
        Mobilya mobilya2 = new Mobilya("Sandalye","Gümüş","Metal",850);

        MobilyaGalerisi magaza = new MobilyaGalerisi("ABC Mobilya Mağazası","Istabul/Arnavutköy");

       /* System.out.println("mobilya1.name = " + mobilya1.name);
        System.out.println("mobilya1.color = " + mobilya1.color);
        System.out.println("mobilya1.material = " + mobilya1.material);
        System.out.println("mobilya1.price = " + mobilya1.price);

        System.out.println("mobilya2.name = " + mobilya2.name);
        System.out.println("mobilya2.color = " + mobilya2.color);
        System.out.println("mobilya2.material = " + mobilya2.material);
        System.out.println("mobilya2.price = " + mobilya2.price);*/

       /* mobilya1.printInfo();
        mobilya2.printInfo();*/

        magaza.addMobilya(mobilya1);
        magaza.addMobilya(mobilya2);
        magaza.printInfo();
        magaza.printInfoYatay();
    }
}
