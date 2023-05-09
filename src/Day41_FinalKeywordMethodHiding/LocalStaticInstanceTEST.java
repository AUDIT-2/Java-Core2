/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding;

public class LocalStaticInstanceTEST {
    public static void main(String[] args) {
        LocalStaticInstanceVar objInstance = new LocalStaticInstanceVar();
        LocalStaticInstanceVar objInstance1 = new LocalStaticInstanceVar();
        LocalStaticInstanceVar objInstance2 = new LocalStaticInstanceVar();

        objInstance.birMethod();
        objInstance1.birMethod();
        objInstance2.birMethod();

        objInstance.aMethod();
        objInstance1.aMethod();
        objInstance2.aMethod();

        objInstance.name = "objInstance Variable";
        objInstance.number = 12346;

        System.out.println();

        objInstance.aMethod();
        objInstance1.aMethod();
        objInstance2.aMethod();

        objInstance1.name = "objInstance1 Variable.";
        objInstance2.name = "objInstance2 Variable.";

        System.out.println("objInstance.name = " + objInstance.name);
        System.out.println("objInstance1.name = " + objInstance1.name);

        objInstance.birMethod();
        LocalStaticInstanceVar.classVariable = "STATIC Var";

        System.out.println("objInstance.classVariable = " + objInstance.classVariable);
        System.out.println("objInstance1.classVariable = " + objInstance1.classVariable);
    }
}
