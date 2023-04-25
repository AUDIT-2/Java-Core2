/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class ProductTest {
    public static void main(String[] args) {
        Product urun1 = new Product(); //new ---> heap memory de bir nesne oluşturdu. OLuşan nesnenin referans adresi urun1 değişkenine atanır.
        //urun1 değişkeni de Stack memory de yer alır.
        System.out.println("Heap memory reference-->" + urun1);
        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun1.unitPrice = " + urun1.unitPrice);
        System.out.println("urun1.ammount = " + urun1.ammount);

        Product urun2 = new Product("Elma",15,2);
        System.out.println("urun2.name = " + urun2.name);
        System.out.println("urun2.unitPrice = " + urun2.unitPrice);
        System.out.println("urun2.ammount = " + urun2.ammount);

    }
    public static void birMetod(){ //Stack memory de yer alır.
        int birDegisken = 0; // stack memory.
        System.out.println("Ben stack hafızada olan bir metodum");
    }
}
