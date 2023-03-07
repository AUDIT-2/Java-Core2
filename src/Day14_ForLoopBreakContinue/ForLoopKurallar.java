/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day14_ForLoopBreakContinue;

public class ForLoopKurallar {
    public static void main(String[] args) {
        System.out.println("Rules in for loops.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        //2'şer 2'şer i değerini artırarak çalışan döngü
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println();

        //int tipinden başka bir veri tipinde for loop-double
        for (double i = 0; i < 3; i += 0.1) {
            System.out.println(i);
        }
        System.out.println();

        //Birden fazla şartı kontrol etme
        for (int i = 3; i < 5 && i > 2; i++) {
            System.out.println(i);
        }
        System.out.println();

        //i değişkeni for loop dışında tanımlama
        int i = 0;
        for (; i < 5; i++){
            System.out.println(i);
        }
        System.out.println("i değişkeninin son aldığı değer = " + i);
        System.out.println();

        //dğişkenin değerinin arttırma işlemini loop içinde yaptık
        for (int j = 0; j < 5; ) {
            System.out.println(j);
            j++;
        }
        System.out.println();

        //Char tipinde bir değişken
        for (char harf = 'A'; harf < 'Z'; harf++) {
            System.out.print(harf + " ");
        }
        //Sonsuz for döngüsü
        /*for(;;){
            System.out.println("Sonsuz Merhaba");
        }*/

        //Sonsuz while döngüsü
       /* while (true){
            System.out.println("Merhaba");
        }*/
    }
}
