/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day37_REVIEW_ClassObjectStaticClassMembers;

public class MainClass {
    static int a = 5;
    //Static block
    static {
        System.out.println("Executing static code block.");
        System.out.println("a = " + a);
    }

    void merhabaObj(){
        System.out.println("Merhaba. Ben non-static bir metodum.");
    }
    static void merhaba(){
        System.out.println("Merhaba. Ben static bir metodum.");
    }
    //Non-static block
    {
        System.out.println("Executing non-static code block.");
    }

    //No-args constructor
    MainClass(){
        System.out.println("Executing constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Executing main method.");
        MainClass mainClassObj = new MainClass();
        MainClass mainClassObj1 = new MainClass();
        System.out.println("MainClass.a = " + MainClass.a);
        MainClass.merhaba();

        //Belongs to object
        mainClassObj.merhabaObj();

        //Belongs to class
        mainClassObj.merhaba();
        mainClassObj1.merhaba();
    }
}
