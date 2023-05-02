/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1.Vehicle;

public class Vehicle {
   private String name;
   private int weight;
   private int lenght;
   private int seats; // Koltuk sayısı
    private boolean lights; //Farlar açık mı?

    public Vehicle(String name, int weight, int lenght, int seats, boolean lights) {
        this.name = name;
        this.weight = weight;
        this.lenght = lenght;
        this.seats = seats;
        this.lights = lights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isLights() {
        return lights;
    }

    public void setLihtgts(boolean lights) {
        this.lights = lights;
    }

    public void move(int speed){
        System.out.println(speed + " kilometre hızla hareket ediyorum.");
    }
    public void start(){
        System.out.println("Araç çalıştı.");
    }
    public void stop(){
        System.out.println("Araş stop etti.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", lenght=" + lenght +
                ", seats=" + seats +
                ", lights=" + lights +
                '}';
    }
}
