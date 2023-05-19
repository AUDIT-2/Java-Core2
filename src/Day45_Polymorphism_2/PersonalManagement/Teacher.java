/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.PersonalManagement;

public class Teacher extends Person{
    public Teacher(String name, long TCNo) {
        super(name, TCNo);
    }

    @Override
    public void work() {
        System.out.println("I am a techer. And I teach lesson.");
    }

    public void doExam(){
        System.out.println("I do exam.");
    }
    @Override
    public String showInfo() {
        String str = "";
        str +="Name : " +  this.getName() + "\n";
        str +="TC No: " + this.getTCNo();
        return str;
    }
}
