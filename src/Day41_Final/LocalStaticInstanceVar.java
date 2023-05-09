/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_Final;

public class LocalStaticInstanceVar {
    //Instance-Object variables-Every instance of this class has own copy of these variables.Access modifiers can be used
    public String name = "Instance name var.";
    protected int number;

    //Static-belongs to Class-Global, And only one copy of this variable exist.
    public static String classVariable; //Access modifiers can be used

    static {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        String name = "Static block name var.";
        int number = 123;
    }

    {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        String name = "None-Static block name var.";
        int number = 123;
    }

    LocalStaticInstanceVar() {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        String name;
        int constNumber;
        name = "Constructor name var.";
        System.out.println(name);
    }

    public void birMethod() {
        //Local variables-these variables only exist in this block-Access modifiers can not be used
        String name;
        String methodVar;
        int methodInt;
        name = "Method name var.";
        System.out.println(name);
    }

    public void aMethod() {
        System.out.println(this.name);//Instance variable
    }
}
