/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day09_ControlFlowStatements_IF_Else;

public class Ornek1 {
    public static void main(String[] args) {
        System.out.println("Write an if statement that multiplies salary by 1.5 if hours is grater than 38.");
        double salary = 100;
        int hours = 45;

        System.out.println("Salary = " + salary);
        if ((hours > 38) && (hours <= 50)){ //true && true ---> true
            salary = salary * 1.5;
            System.out.println("Zamlı maaş = " + salary);
        }

        if(hours > 50){
            salary = salary * 2;
            System.out.println("Çok Zamlı maaş = " + salary);
        }
    }
}
