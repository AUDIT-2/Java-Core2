/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Galeri;

public class Araba {
    private String name;
    private String model;
    private String VIN; //Vehicle Identification Number
    private String plaka;

    //Non-Static block-Instance block
    {
        System.out.println("Yeni bir araba nesnesi oluşturuldu.");
    }

    //Static block--Class block
    static {

    }

    public Araba(String name, String model, String VIN, String plaka){
        setName(name);
        setModel(model);
        setVIN(VIN);
        setPlaka(plaka);
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

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public String toString() {
        return getName() + "-" + getModel() + " Plaka : " + getPlaka() + " VIN : " + getVIN();
    }
}
