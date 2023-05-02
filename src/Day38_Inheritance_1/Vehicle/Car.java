/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1.Vehicle;

public class Car extends Vehicle {
    private int tiresSize;
    private String brand; // Marka
    private int doorNumber; //Kapı sayısı

    public Car(String name, int weight, int lenght, int seats, boolean lights, int tiresSize, String brand, int doorNumber) {
        super(name, weight, lenght, seats, lights);
        this.tiresSize = tiresSize;
        this.brand = brand;
        this.doorNumber = doorNumber;
    }

    public int getTiresSize() {
        return tiresSize;
    }

    public void setTiresSize(int tiresSize) {
        this.tiresSize = tiresSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void honk(){//Kornaya basma metodu
        System.out.println("Honk honk honk");
    }
    public void handBreak(){
        System.out.println("El freni çekildi");
    }
    public void openTrunk(){
        System.out.println("Bagaj açıldı.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "tiresSize=" + tiresSize +
                ", brand='" + brand + '\'' +
                ", doorNumber=" + doorNumber +
                "} " + super.toString();
    }
}
