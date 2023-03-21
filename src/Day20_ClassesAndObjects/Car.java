/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day20_ClassesAndObjects;

public class Car {
    //Data members-Instance variables- Objeye ait değişkenler-properties-attributes-states-fields
    String marka;
    String model;
    String color;
    String engineType;
    int year;

    //Default constructor----> yapıcı metod.
    public Car() {
        System.out.println("Parametresiz default constructor çağrıldı");
    }

    //Parametre alan constructor
    public Car(String marka, String model) {
        System.out.println("Parametreli constructor çağrıldı.");
        this.marka = marka;
        this.model = model;
    }

    //Parametre alan constructor
    public Car(String marka, String model, String color, String engineType, int year) {
        System.out.println("Bütün Parametreleri alan constructor çağrıldı.");
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.engineType = engineType;
        this.year = year;
    }

    public void markaGoster() {
        System.out.println("Markası : " + marka);
    }

    public void showInfo() {
        System.out.println("Show Info metodu.");
        System.out.println("-----------------");
        System.out.println("Markası    : " + marka);
        System.out.println("Modeli     : " + model);
        System.out.println("Color      : " + color);
        System.out.println("Motor türü : " + engineType);
        System.out.println("Üretim Yılı: " + year);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Car honda = new Car();
        Car toyota = new Car();
        Car murat = new Car();
        Car araba1 = new Car("Mercedes", "CLK");

        System.out.println("Honda nesnesinin heap memory adresi = " + honda);
        System.out.println("Toyota nesnesi heap memory adresi = " + toyota);

        //Assigning values
        honda.marka = "Honda";
        honda.model = "Accord";
        honda.color = "White";
        honda.year = 2023;
        honda.engineType = "Petrol";

        honda.showInfo();
        honda.markaGoster();

        toyota.year = 2021;
        toyota.model = "Corolla";
        toyota.color = "Black";
        toyota.engineType = "Diesel";
        toyota.marka = "Toyota";

        toyota.showInfo();

        murat.showInfo();
        araba1.showInfo();
        /*System.out.println(honda.marka);
        System.out.println(honda.model);

        System.out.println(toyota.marka);
        System.out.println(toyota.year);*/

    }
}
