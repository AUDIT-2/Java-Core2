/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageB;

import Day40_AccessModifiers.PackageA.Person;

public class Student extends Person {
    private String okulu;
    private int okulNo;

    public Student(String name, String address, String okulu, int okulNo) {
        super(name, address);
        this.okulu = okulu;
        this.okulNo = okulNo;
    }

    public String getOkulu() {
        return okulu;
    }

    public void setOkulu(String okulu) {
        this.okulu = okulu;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    //Access modifier must be same visibility or more visible than parent class
    //Parent        Child
    //default -->   default
    //              protected
    //              public

    //protected --> protected
    //              public

    //public -->    public
    protected void displayInfo() {
        System.out.println("Overridden method");
        super.displayInfo();
    }

    @Override
    public String toString() {
        return "Student{" +
                "okulu='" + okulu + '\'' +
                ", okulNo=" + okulNo +
                "} " + super.toString();
    }

    public static void main(String[] args) {
    Student ogrenci = new Student("Ali","Alinin adresi","Okul",12234);

    ogrenci.displayInfo();
        System.out.println("ogrenci = " + ogrenci);
    }
}
