/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

public class KisiRehberProg {
    public static void main(String[] args) {
        Kisi[] rehberim = new Kisi[3];

        Kisi kisi1 = new Kisi("Ahmet","Falanca",12345,"Bilinmeyen bir yer.");
        Kisi kisi2 = new Kisi("Fatma","Gül",34512,"ABD/New York");
        Kisi kisi3 = new Kisi("Mery","Crismas",17890,"Germany/Berlin");

        rehberim[0] = kisi1;
        rehberim[1] = kisi2;
        rehberim[2] = kisi3;

        System.out.println("Rehberimde kayıtlı kişilerin listesi");
        for (Kisi kisi :rehberim){
           kisi.printInfo();
        }

        Kisi.isimdenBul(rehberim,"Ahmet");

    }
}
