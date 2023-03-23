/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class Product {
    String name;
    double unitPrice;
    double ammount;

    public Product(){
       this.name = "Deneme Ürünü";
       this.unitPrice = 0.0;
       this.ammount = 1;
    }
    public Product(String name, double unitPrice, double ammount){
        this.name = name;
        this.unitPrice = unitPrice;
        this.ammount = ammount;
    }

    public double fiyatHesapla(){
        return unitPrice * ammount;
    }
    public double kdvHesapla(){
        return fiyatHesapla() * 1.18;
    }

    public void finalize(){
        System.out.println("***************************");
        System.out.println("Garbage Collection çalıştı.");
        System.out.println("***************************");
    }
}
