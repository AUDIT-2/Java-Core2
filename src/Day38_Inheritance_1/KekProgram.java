/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

public class KekProgram {
    public static void main(String[] args) {
        CevizliKek cevizliKek = new CevizliKek("Cevizli",2,1,1,1,1,4,1,100);

        PortakalliKek portakalliKek = new PortakalliKek();
        portakalliKek.setName("Portakalli");
        portakalliKek.setUn(4);
        portakalliKek.setYag(1);
        portakalliKek.setSeker(2);
        portakalliKek.setKabartmaTozu(1);
        portakalliKek.setSut(1);
        portakalliKek.setYumurta(3);
        portakalliKek.setPortakal(2);

        System.out.println(cevizliKek);

        System.out.println(portakalliKek);

        Firin firin = new Firin(180,45);

        portakalliKek.setKaristiMi(false);
        cevizliKek.setKaristiMi(true);

        firin.tepsiyeEkle(portakalliKek);
        firin.tepsiyeEkle(cevizliKek);
        firin.tepsiyeEkle(cevizliKek);

        firin.pisir();
    }
}
