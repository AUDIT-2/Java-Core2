/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritance_1;

import java.util.ArrayList;

public class Firin {
    private int derece;
    private int sure;

    private ArrayList<Kek> tepsiler;

    public Firin(int derece, int sure) {
        this.derece = derece;
        this.sure = sure;
        this.tepsiler = new ArrayList<>();
    }

    public int getDerece() {
        return derece;
    }

    public void setDerece(int derece) {
        this.derece = derece;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public void tepsiyeEkle(Kek kek){
        tepsiler.add(kek);
    }

    public void pisir(){
        System.out.println("Fırının derecesi : " + getDerece());
        System.out.println("Pişirme Süresi   : " + getSure());

        int tepsiNo = 0;
        for (Kek kek:tepsiler){
            if(tepsiNo == 0) {
                System.out.println("Üst tepside ") ;
                if(kek.isKaristiMi()){
                    System.out.print(kek.getName() + " kek pişiyor");
                } else System.out.println(kek.getName() + " kek karıştırılmamış. Lütfen karıştırın sonra fırına koyun");
            }
            if(tepsiNo == 1) System.out.println("Orta tepside " + kek.getName() + " kek pişiyor");
            if(tepsiNo == 2) System.out.println("Alt tepside " + kek.getName() + " kek pişiyor");
           tepsiNo++;
        }
    }
    @Override
    public String toString() {
        return "Firin{" +
                "derece=" + derece +
                ", sure=" + sure +
                ", tepsiler=" + tepsiler +
                '}';
    }
}
