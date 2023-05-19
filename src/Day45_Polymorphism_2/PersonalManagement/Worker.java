/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.PersonalManagement;

public class Worker extends Person{
    private long sicilNo;

    public long getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(long sicilNo) {
        this.sicilNo = sicilNo;
    }

    public Worker(String name, long TCNo, long sicilNo) {
        super(name, TCNo);
        this.sicilNo = sicilNo;
    }

    @Override
    public void work() {
        System.out.println("I am a worker. I work a lot.");
    }

    @Override
    public String showInfo() {
        String str = "";
        str +="Name : " +  this.getName() + "\n";
        str +="TC No: " + this.getTCNo() + "\n";
        str +="Sicil: " + this.getSicilNo();
        return str;
    }
}
