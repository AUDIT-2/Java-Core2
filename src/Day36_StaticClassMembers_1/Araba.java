/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

import java.util.ArrayList;

public class Araba {
    private String name;
    private String model;

    public static ArrayList<Araba> arabalar = new ArrayList<>();

    //Non-Static block-Instance block
    {
        System.out.println("Yeni bir araba nesnesi oluşturuldu.");
    }

    //Static block--Class block
    static {
        Araba araba1 = new Araba("Toyota", "Corolla");
        Araba araba2 = new Araba("Honda", "Civic");
        Araba araba3 = new Araba("Ford", "Focus");
        Araba araba4 = new Araba("Hyundai", "Accent");
        Araba araba5 = new Araba("Opel", "Vectra");
        Araba araba6 = new Araba("Volvo", "XC-90");

        arabalar.add(araba1);
        arabalar.add(araba2);
        arabalar.add(araba3);
        arabalar.add(araba4);
        arabalar.add(araba5);
        arabalar.add(araba6);

    }

    public Araba(String name, String model){
        setName(name);
        setModel(model);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
