/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.PersonalManagement;

public class Engineer extends Person{
    public Engineer(String name, long TCNo) {
        super(name, TCNo);
    }

    @Override
    public void work() {
        System.out.println("I am an engineer. I work as an engineer.");
    }

    public void doDesign(){
        System.out.println("I design.");
    }
    @Override
    public String showInfo() {
        String str = "";
        str +="Name : " +  this.getName() + "\n";
        str +="TC No: " + this.getTCNo();
        return str;
    }
}
