/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class StaticAndNonStaticBlock {
    static int number = 5;

    //Static block
    static {
        System.out.println("First Static block is executed.");
        System.out.println("Static variable number is : " + number);
    }

    //Constructor
    public StaticAndNonStaticBlock(){
        System.out.println("Constructor is executed.");
    }

    static {
        System.out.println("Second Static block is executed.");
    }

    //Non-static-Belongs to instance-object
    {
        System.out.println("Non-static block is executed");
    }

    public static void main(String[] args) {
        StaticAndNonStaticBlock staticAndNonStaticBlock = new StaticAndNonStaticBlock();
        System.out.println("Main method is executed.");
    }
}
