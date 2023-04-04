/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day26_Arrays1;

public class Product {
    //Data members
    String name;
    double price;
    double miktar;

    //Constructor
    public Product(String name,double price, double miktar){
        this.name = name;
        this.price = price;
        this.miktar = miktar;
    }

    //method
    public double fiyatHesapla(){
        System.out.println("Ürünün fiyatı = " + (price * miktar));
        return price * miktar;
    }
}
