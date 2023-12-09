/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.VehicleSystem;

import java.util.ArrayList;

public class VehicleSystemTest {
    public static void main(String[] args) {
        Vehicle car = new Car(4, 120);
        Vehicle plane = new Plane(150, 850, 12000);
        Vehicle seaPlane = new SeaPlane(20, 350, 2500);
        Vehicle train = new Train(450, 85);
        Vehicle boat = new Boat(8, 65);
        Vehicle helicopter = new Helicopter(14, 50);

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
        vehicles.add(helicopter);
        vehicles.add(seaPlane);

        car.move(); //Polymorphism---every instance invoke its own version(override) of .move() method
        plane.move(); //Polymorphism---every instance invoke its own version(override) of .move() method
        ((Plane) plane).fly(); //DownCasting Parent ---> Child... Vehicle ---> Plane. In order to invoke Child class method.

        ((Plane) plane).setAttitude(9500);
        ((Plane) plane).fly(); //DownCasting Parent ---> Child... Vehicle ---> Plane. In order to invoke Child class method.

        ((Plane) plane).banaOzel(); //DownCasting Parent ---> Child... Vehicle ---> Plane. In order to invoke Child class method.

        //SeaPlane Class implements both Flyable and CanFloat interface
        ((SeaPlane) seaPlane).fly(); //DownCasting Parent ---> Child... Vehicle ---> SeaPlane. In order to invoke Child class method.
        ((SeaPlane) seaPlane).floats(); //DownCasting Parent ---> Child... Vehicle ---> SeaPlane. In order to invoke Child class method.

        boat.move(); //Polymorphism---every instance invoke its own version(override) of .move() method
        ((Boat) boat).floats(); //DownCasting Parent ---> Child... Vehicle ---> Boat. In order to invoke Child class method.

        train.move(); //Polymorphism---every instance invoke its own version(override) of .move() method
        helicopter.move(); //Polymorphism---every instance invoke its own version(override) of .move() method
        ((Helicopter) helicopter).fly(); //DownCasting Parent ---> Child... Vehicle ---> Helicopter. In order to invoke Child class method.

        System.out.println("-----------  instanceof  --------------------------");
        for (Vehicle arac : vehicles) {
            arac.move(); //Polymorphism---every instance invoke its own version(override) of .move() method
            if (arac instanceof Flyable) {
                ((Flyable) arac).fly();
            }
            if (arac instanceof CanFloat) {
                ((CanFloat) arac).floats();
            }
            System.out.println();
        }

        //How to understand which class method I am calling
        //getClass() method helps us to access the object information
        System.out.println("------------ getClass() -------------------------");
        for (Vehicle arac : vehicles) {
            System.out.println(arac.getClass());
        }

        //returns package.className of the object
        System.out.println("------------ getClass().getName() -------------------------");
        for (Vehicle arac : vehicles) {
            System.out.println(arac.getClass().getName());
        }

        //returns just the class name of the object
        System.out.println("------------ getClass().getSimpleName() -------------------------");
        for (Vehicle arac : vehicles) {
            System.out.println(arac.getClass().getName());
            System.out.println(arac.getClass().getSimpleName().toUpperCase());
        }

        //returns array of the interface name of the object
        System.out.println("------------ getClass().getInterfaces() -------------------------");
        for (Vehicle arac : vehicles) {
            System.out.println("Class : " + arac.getClass().getSimpleName().toUpperCase());
            //   System.out.println(Arrays.toString(arac.getClass().getInterfaces()));
            if (arac.getClass().getInterfaces().length == 0) {//length = 0 means Class does not implement any interface
                System.out.println("...Interface : none");
            } else {
                for (Class eleman : arac.getClass().getInterfaces()) {
                    System.out.println("...Interface : " + eleman.getSimpleName()); //prints the implemented interfaces
                }
            }
        }
    }
}
