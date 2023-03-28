/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day22_RandomMathDateClasses;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDuration {

    public static void main(String[] args) {
        LocalTime simdikiSaat = LocalTime.now();
        LocalTime tempSaat = LocalTime.of(23,35,50);

        Duration zamanFark = Duration.between(simdikiSaat, tempSaat);
        System.out.println("zamanFark = " + zamanFark);

        System.out.println("zamanFark.toHours() = " + zamanFark.toHours());
        System.out.println("zamanFark.toMinutes() = " + zamanFark.toMinutes() / 60);
        System.out.println("zamanFark.toMinutes() = " + zamanFark.toMinutes() % 60);
    }
}
