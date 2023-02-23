/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

import java.util.Scanner;

public class SistemeGiris {
    public static void main(String[] args) {
        Scanner sifreGir = new Scanner(System.in);
        int password = 12345;

        System.out.print("Please enter password to login : ");
        if (password == sifreGir.nextInt()){
            System.out.println("You entered the system...");
        }else {
            System.out.println("You entered the wrong password. Please try again!");
        }
    }
}
