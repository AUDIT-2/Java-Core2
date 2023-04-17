/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day31_ArrayList;

import java.util.ArrayList;

public class MobilyaGalerisi {
    String name;
    String address;
    ArrayList<Mobilya> mobilyalar;

    public MobilyaGalerisi(String name, String address){
        this.name = name;
        this.address = address;
        mobilyalar = new ArrayList<>();
    }

    public void addMobilya(Mobilya mobilya){
        mobilyalar.add(mobilya);
    }

    public void printInfo(){
        System.out.println("Name    : " + name);
        System.out.println("Address : " + address);
        System.out.println("----------------------");
        for (Mobilya mobilya :mobilyalar){
            mobilya.printInfo();
        }
    }
    public void printInfoYatay(){
        System.out.println("Name    : " + name);
        System.out.println("Addrss  : " + address);
        System.out.println("----------------------");
        for (Mobilya mobilya :mobilyalar){
            mobilya.printInfoYatay();
        }
    }
}
