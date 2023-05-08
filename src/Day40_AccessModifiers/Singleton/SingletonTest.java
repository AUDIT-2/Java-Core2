/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
       /* Singleton singleton = new Singleton();
        Singleton singleton1 = new Singleton();
        Singleton singleton3 = new Singleton();*/

        /*for (int i = 0; i < 1000000000; i++) {
            new Singleton();
        }*/

        Singleton.setMaxNumberOfInstance(5);
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();
        Singleton.getSingletonInstance();


        System.out.println("singleton.getNumberOfInstance() = " + Singleton.getNumberOfInstance());
    }
}
