/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day16_Method1;

public class DisplayMessage {

    public static void ekranaYaz(){
        System.out.println("Hello Java. I am a user defined method.");
    }

    public static void ikikereYaz(){
        System.out.println("Merhaba");
        System.out.println("Merhaba");
    }
    public static void onDefaYaz(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Merhaba - " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Merhaba Java.");

        ekranaYaz();
        ikikereYaz();
        onDefaYaz();

    }
}
