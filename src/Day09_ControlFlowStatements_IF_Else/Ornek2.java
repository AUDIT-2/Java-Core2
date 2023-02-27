/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */
package Day09_ControlFlowStatements_IF_Else;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        System.out.println("Write an if statement that assign 1 to x if y is greater than 0? ");
        Scanner sayiGir = new Scanner(System.in);
        int x=0,y=0;
        //y = 5;
        System.out.print("Lütfen \"y\" değeri için klavyeden bir tamsayı giriniz : ");
        y = sayiGir.nextInt();

        if(y > 0){
            x = 1;
        }
        System.out.println("y = " + y );
        System.out.println("x = " + x );
    }
}
