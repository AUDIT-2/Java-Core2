/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day11_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Switch Case Statement in Java.");
        int day = 3;
        String dayType = "";
        String dayString = "";

       switch(day){
           case 1:
               dayString = "Pazartesi";
               break;
           case 2:
               dayString = "Salı";
               break;
           case 3:
               dayString = "Çarşamba";
               break;
           case 4:
               dayString = "Perşembe";
               break;
           case 5:
               dayString = "Cuma";
               break;
           case 6:
               dayString = "Cumartesi";
               break;
           case 7:
               dayString = "Pazar";
               break;
           default:
               dayType = "Geçersiz gün bilgisi";
               System.out.println(dayType);
       }

       if(dayType == ""){
           System.out.println("Haftanın " + dayString + " günü.");
       }

       //Gün---> haftaiçi mi? haftasonu mu?

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Haftaiçi günüdür.";
                break;
            case 6:
            case 7:
                dayType = "Haftasonu günüdür.";
                break;
            default:
                dayType = "Geçersiz gün bilgisi.";
        }
        System.out.println("Haftanın " + dayString + " günü. Ve " + dayType);
        System.out.println("----------------------");

        System.out.println("If...Else");
        if(day >=1 && day <=5){
            System.out.println("Haftaiçi günlerindendir.");
        }else System.out.println("Haftasonu günlerindendir.");

        System.out.println("---------------------");
        System.out.println("if....");
        if(day == 1){
            dayString = "Pazartesi";
        }
        if(day == 2){
            dayString = "Salı";
        }
        if(day == 3){
            dayString = "Çarşamba";
        }
        if(day == 4){
            dayString = "Perşembe";
        }
        if(day == 5){
            dayString = "Cuma";
        }
        if(day == 6){
            dayString = "Cumartesi";
        }
        if(day == 7){
            dayString = "Pazar";
        }
        if(day > 7 || day < 1){
            dayType = "Geçersiz gün bilgisi.";
            System.out.println(dayType);
        }
        System.out.println("Haftanın " + dayString + " günü.");
    }
}
