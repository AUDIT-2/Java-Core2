/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class Ogrenci {
    private static int counter = 1000;
    private String name;
    private int schoolNumber;
    private static String okulAdi = "ABC Akademi";
    private static String okulAdresi = "Falanca yerdeki okul.";

    public Ogrenci(String name) {
       /* counter++;
        setSchoolNumber(counter);*/
        setSchoolNumber(++counter);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public String getOkulAdresi() {
        return okulAdresi;
    }

    public static void setOkulAdi(String okulAdi) {
        Ogrenci.okulAdi = okulAdi;
    }

    public static void setOkulAdresi(String okulAdresi) {
        Ogrenci.okulAdresi = okulAdresi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}
