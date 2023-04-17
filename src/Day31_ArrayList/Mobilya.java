/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

public class Mobilya {
    String name;
    String color;
    String material;
    double price;

    //Constructor--yapıcı metod---Class tan nesne(obje) oluşturur.
    public Mobilya(String name, String color, String material, double price){
        this.name = name;
        this.color = color;
        this.material = material;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Name     : " + name);
        System.out.println("Color    : " + color);
        System.out.println("Material : " + material);
        System.out.println("Price    : " + price);
        System.out.println();
    }
    public void printInfoYatay(){
        System.out.println(name + " " + color + " " + material + " " + price);
    }
}
