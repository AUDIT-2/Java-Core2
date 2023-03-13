/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day16_Method1;

public class DebuggingMethod {
    public static void main(String[] args) {
        System.out.println("Main metodunun içindeyim. Line-12");
        displayMessage();
        System.out.println("After displayMessage() method. Line-14");
    }
    public static void displayMessage(){
        System.out.println("DisplayMessage metodundayım. Line-17");
        System.out.println("Hello World. Line-18");
        calculation();
    }
    public static void calculation(){
        System.out.println("Calculation metodunun içerisendeyim.");
        System.out.println(10 + 5);
    }

}
