/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day08_LogicalOperators;

public class AlarmSistemi {
    public static void main(String[] args) {
        //SINIF GEÇME hesabı da yapılabilir--vize1....
        //Sensörler
        boolean anaKapi = false;
        boolean pencere1 = false;
        boolean pencere2 = false;
        boolean balkonKapisi = false;

        boolean alarmTetiklendiMi = false;

        System.out.println("   Alarm Sistemi");
        System.out.println("-------------------");
        System.out.println();

        pencere2 = true;
        balkonKapisi = true;

        alarmTetiklendiMi = anaKapi || pencere1 || (pencere2 && balkonKapisi);
        System.out.println("alarmTetiklendiMi = " + alarmTetiklendiMi);
    }
}
