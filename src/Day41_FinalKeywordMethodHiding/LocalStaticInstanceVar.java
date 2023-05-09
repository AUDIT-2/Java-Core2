/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding;

public class LocalStaticInstanceVar {
    //Instance-Object variables-Every instance of this class has own copy of these variables.Access modifiers can be used
    public String name = "Instance name var.";
    protected int number;

    //Static-belongs to Class-Global, And only one copy of this variable exist.
    public static String classVariable; //Access modifiers can be used

    static {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        //Initialisation is mandatory- Başlangıç değeri atamak zorundayız.
        String name = "Static block name var.";
        int number = 123;
    }

    //Non-static block-Instance init block
    {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        //Initialisation is mandatory- Başlangıç değeri atamak zorundayız.
        String name = "None-Static block name var.";
        int number = 123;
    }

    LocalStaticInstanceVar() {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        //Initialisation is mandatory- Başlangıç değeri atamak zorundayız.
        String name ="";
        int constNumber;
        name = "Constructor name var."; //Initialise-Bir değer atanmış.
        System.out.println(name);
        //System.out.println(constNumber); //It has to be assigned a value
    }

    public void birMethod() {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        //Initialisation is mandatory- Başlangıç değeri atamak zorundayız.
        String name;
        String methodVar;
        int methodInt;
        name = "Method name var.";
        System.out.println(name);
        //System.out.println(methodInt); //It has to be assigned a value
    }

    public void aMethod() {
        System.out.println(this.name);//Instance variable
        System.out.println(number);
    }
}
