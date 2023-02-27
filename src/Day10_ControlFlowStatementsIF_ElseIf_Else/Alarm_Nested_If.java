/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day10_ControlFlowStatementsIF_ElseIf_Else;

public class Alarm_Nested_If {
    public static void main(String[] args) {
        System.out.println("Alarm sistemi...");
        System.out.println("----------------");

        boolean kapi1=false,kapi2=false,pencer1=false,pencer2=false;

        boolean alarmLambasi = false;
        boolean alarmTetiklendi = false;

        kapi1 = true;
        pencer1 = true;
        alarmTetiklendi =(kapi1 || kapi2 || pencer1 || pencer2);

        if(alarmTetiklendi){
            alarmLambasi = true;
            System.out.println("Alarm lambası ---> " + alarmLambasi);
            System.out.println("Alarm durumu ---> " + alarmTetiklendi);
            System.out.println("Kapı-1 sensörü ---> " + kapi1);
            System.out.println("Kapı-2 sensörü ---> " + kapi2);
            System.out.println("Pencere-1 sensörü ---> " + pencer1);
            System.out.println("Pencere-2 sensörü ---> " + pencer2);
        }else System.out.println("Herhangi bir olumsuz durum yok.");
        System.out.println();
        //Nested if ile...
        if (alarmTetiklendi){
            alarmLambasi = true;
            System.out.println("Alarm lambası ---> " + alarmLambasi);
            System.out.println("Alarm durumu ---> " + alarmTetiklendi);
            if(kapi1){
                System.out.println("Kapı-1 sensörü tetiklenmiş!");
            }
            if(kapi2){
                System.out.println("Kapı-2 sensörü tetiklenmiş!");
            }
            if(pencer1){
                System.out.println("Pencere-1 sensörü tetiklenmiş!");
            }
            if(pencer2){
                System.out.println("Pencere-2 sensörü tetiklenmiş!");
            }

        }else System.out.println("Herhangi bir olumsuz durum yok.");
    }
}
