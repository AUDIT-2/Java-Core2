/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.PackageB;

public class AccessModifiers {
    //Data members-fields-properties-states-attributes
    private int id; //Only Same class members can access
    protected String TCNo; //Only Same class, same package, and different package but inheritance relationship(sub-class)
    public String name; //Everywhere. All classes can access.
    int okulNo; //Default-Only Same class, and same package can access.


    public AccessModifiers(){

    }
    //Only Same class members can access
    private int privateToplam(int sayiA, int sayiB){
        System.out.println("I am a private method.");
        return sayiA + sayiB;
    }

    //Only Same class, same package, and different package but inheritance relationship(sub-class)
    protected void proMethod(){
        System.out.println("I am a protected method.");
    }

    //Everywhere. All classes can access.
    public void pubMethod(){
        System.out.println("I am a public method.");
    }

    //Default-Only Same class, and same package can access.
    void defMethod(){
        System.out.println("I am a default method.");
    }

    public static void main(String[] args) {
        System.out.println("Access modifiers in Java.");
        AccessModifiers obj = new AccessModifiers();

        obj.name = "Ahmet";
        obj.id = 1234;
        obj.TCNo = "1234556678";
        obj.okulNo = 5667;

        int toplam = obj.privateToplam(12,5);
        System.out.println("toplam = " + toplam);
        obj.proMethod();
        obj.defMethod();
        obj.pubMethod();
    }
}
