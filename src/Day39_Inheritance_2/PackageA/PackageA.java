/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day39_Inheritance_2.PackageA;

public class PackageA {
    public int no;
    public String name; // Every class can access
    private String secret; //Same class---special to class
    protected int salary; //Same package and other class which has inheritance relationship
    String address; //Default-Class can access within Same package

    public PackageA(){
        System.out.println("Super constructor called.");
    }

    protected void aMethod(){
        secret = "Merhaba";
        System.out.println("Same package class and the class has inheritance relationship.");
    }
    void print(){//Class can access within Same package
        System.out.println("Printing...dafult access.");
    }
    public void aPublicMethod(){
        System.out.println("Public method.");
    }
}
