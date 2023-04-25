/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day34_Encapsulation_1;

public class TestBasitGetterSetter {
    public static void main(String[] args) {
        BasitGetterSetter basitGetterSetter = new BasitGetterSetter();
        BasitGetterSetter basitGetterSetter1 = new BasitGetterSetter(12345);
        System.out.println("basitGetterSetter.veriOkuNumber() = " + basitGetterSetter.veriOkuNumber());
        basitGetterSetter.guncelleNumber(154);
        System.out.println("basitGetterSetter.veriOkuNumber() = " + basitGetterSetter.veriOkuNumber());

        System.out.println("basitGetterSetter.getNumber() = " + basitGetterSetter.getNumber());
        basitGetterSetter.setNumber(0);
        System.out.println("basitGetterSetter.getNumber() = " + basitGetterSetter.getNumber());

        System.out.println("basitGetterSetter.getResult() = " + basitGetterSetter.getResult());

        System.out.println("basitGetterSetter1.getNumber() = " + basitGetterSetter1.getNumber());
        System.out.println("basitGetterSetter1.getResult() = " + basitGetterSetter1.getResult());

    }
}
