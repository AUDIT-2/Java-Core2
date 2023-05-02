/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleTest {
    public static void main(String[] args) {
        Car araba = new Car("Araba",
                1250,
                2,
                5,
                true,
                195,
                "Honda",
                4);

        Plane ucak = new Plane("Uçak",5250,15,150,true,2,
                "Benzin");

        System.out.println(araba);
        System.out.println(ucak);

        araba.honk();
        araba.openTrunk();

        ucak.taxi();
        ucak.rotorRpm(1500);

        ArrayList<Vehicle> garaj = new ArrayList<>();

        garaj.add(araba);
        garaj.add(ucak);
        System.out.println("------------------------------");
        for (Vehicle arac: garaj){
            if(arac instanceof Car){ //instanceof operatörü bir nesnenin hangi Klasa ait olduğunu sorgulamak için kullanılır.
                System.out.println(araba.getBrand());
                ((Car) arac).honk();
            }
            if(arac instanceof Plane){
                System.out.println(arac.getName());
                ((Plane) arac).taxi();
            }
        }
    }
}
