/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day27_Arrays2;

public class KisiRehberProg {
    public static void main(String[] args) {
        Kisi[] rehberim = new Kisi[4];

        Kisi kisi1 = new Kisi("Ahmet","Falanca",12345,"Bilinmeyen bir yer.");
        Kisi kisi2 = new Kisi("Fatma","Gül",34512,"ABD/New York");
        Kisi kisi3 = new Kisi("Mery","Crismas",17890,"Germany/Berlin");
        Kisi kisi4 = new Kisi("Ahmet","Smith",34567,"Türkiye/Ankara");

        rehberim[0] = kisi1;
        rehberim[1] = kisi2;
        rehberim[2] = kisi3;
        rehberim[3] = kisi4;

        System.out.println("Rehberimde kayıtlı kişilerin listesi");
        for (Kisi kisi :rehberim){
            /*
            System.out.println("kisi.adi = " + kisi.adi);
            System.out.println("kisi.soyadi = " + kisi.soyadi);
            System.out.println("kisi.telNo = " + kisi.telNo);
            System.out.println("kisi.adres = " + kisi.adres);
            */

            kisi.printInfo();
        }

        Kisi.isimdenBul(rehberim,"Ahmet");
        Kisi.listele(rehberim);

    }
}
