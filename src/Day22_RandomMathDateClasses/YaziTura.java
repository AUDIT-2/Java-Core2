/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.util.Random;

public class YaziTura {
    public static String eskiYaziMiTurami(){
        Random rastgele = new Random();
        String sonuc = "";
        boolean atisDeger = false;
        atisDeger = rastgele.nextBoolean();

        if(atisDeger){
            sonuc = "Yazı";
        } else sonuc = "Tura";
        return sonuc;
    }
    public static String yaziMiTurami(){
        Random rastgele = new Random();
        return (rastgele.nextBoolean()) ? "Yazı" : "Tura";
    }

    public static void main(String[] args) {
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
        System.out.println("yaziMiTurami() = " + yaziMiTurami());
    }
}
