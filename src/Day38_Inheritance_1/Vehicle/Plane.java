/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1.Vehicle;

public class Plane extends Vehicle {
    private int propellerSize; //Pervane büyüklüğü
    private String engineType;

    public Plane(String name, int weight, int lenght, int seats, boolean lights, int propellerSize, String engineType) {
        super(name, weight, lenght, seats, lights);
        this.propellerSize = propellerSize;
        this.engineType = engineType;
    }

    public int getPropellerSize() {
        return propellerSize;
    }

    public void setPropellerSize(int propellerSize) {
        this.propellerSize = propellerSize;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void rotorRpm(int rpm){
        System.out.println(rpm  + " hızında çalışıyor.");
    }
    public void pressureCheck(){
        System.out.println("Basınç kontrol edildi.");
    }
    public void taxi(){
        System.out.println("Taksi pozisyonunda pistte ilerliyorum.");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "propellerSize=" + propellerSize +
                ", engineType='" + engineType + '\'' +
                "} " + super.toString();
    }
}
