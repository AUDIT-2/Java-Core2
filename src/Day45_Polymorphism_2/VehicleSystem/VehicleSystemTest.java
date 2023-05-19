/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

import Day18_REVIEW_Methods.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleSystemTest {
    public static void main(String[] args) {
        Vehicle car = new Car(4,120);
        Vehicle plane = new Plane(150,850,12000);
        Vehicle train = new Train(450,85);
        Vehicle boat = new Boat(8,65);
        Vehicle helikopter = new Helikopter(14,50);

      /*  ArrayList<Plane> ucaklar = new ArrayList<>();
        ArrayList<Car> arabalar = new ArrayList<>();
        ArrayList<Train> trenler = new ArrayList<>();
        ArrayList<Boat> botlar = new ArrayList<>();

        ucaklar.add(plane);
      */

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(plane);
        vehicles.add(train);
        vehicles.add(boat);
        vehicles.add(helikopter);


        car.move();
        plane.move();
        ((Plane)plane).fly(); //DownCasting Parent ---> Child

        ((Plane)plane).setAttitude(9500);
        ((Plane)plane).fly();

        ((Plane)plane).banaOzel();

        boat.move();
        ((Boat)boat).floats(); //DownCasting Parent ---> Child

        train.move();
        helikopter.move();
        ((Helikopter)helikopter).fly();

        System.out.println("-----------  instanceof --------------------------");
        for (Vehicle arac :vehicles){
            arac.move();
            if(arac instanceof Flyable){
                ((Flyable) arac).fly();
            }
            if (arac instanceof CanFloat){
                ((CanFloat) arac).floats();
            }
        }

        System.out.println("------------ getClass() -------------------------");
        for (Vehicle arac :vehicles){
            System.out.println(arac.getClass());
        }
        System.out.println("------------ getClass().getName() -------------------------");
        for (Vehicle arac :vehicles){
            System.out.println(arac.getClass().getName());
        }
        System.out.println("------------ getClass().getSimpleName() -------------------------");
        for (Vehicle arac :vehicles){
            System.out.println(arac.getClass().getName());
            System.out.println(arac.getClass().getSimpleName());
        }

        System.out.println("------------ getClass().getInterfaces() -------------------------");
        for (Vehicle arac :vehicles){
            System.out.println(arac.getClass().getSimpleName());
            System.out.println(Arrays.toString(arac.getClass().getInterfaces()));
        }

        ((Plane) plane).fly();
        ((Plane) plane).floats();
    }
}
