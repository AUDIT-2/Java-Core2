/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day46_Exception1.Errors;

public class StackOverFlowError {
   static int counter = 0;
    public static void main(String[] args) {
        birMetod();
    }

    public static void birMetod(){
        counter++;
        System.out.println(counter);
        birMetod();
    }
}
