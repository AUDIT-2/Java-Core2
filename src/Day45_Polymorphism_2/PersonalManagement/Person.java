/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.PersonalManagement;

public abstract class Person {
    private String name;
    private long TCNo;

    public Person(String name, long TCNo) {
        this.name = name;
        this.TCNo = TCNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTCNo() {
        return TCNo;
    }

    public void setTCNo(long TCNo) {
        this.TCNo = TCNo;
    }

    public abstract void work();
    public abstract String showInfo();
}
