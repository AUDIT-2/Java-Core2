/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding;

import java.util.Arrays;

public class FinalArray {
    int[] arrNumber = new int[3];
    final int[] fnlArrayNumber = new int[3];

    public static void main(String[] args) {
        FinalArray obj = new FinalArray();
        obj.arrNumber[0] = 178;
        obj.arrNumber[1] = 3;
        obj.arrNumber[2] = 90;

        System.out.println(Arrays.toString(obj.arrNumber));

        System.out.println();
        System.out.println("For...");
        for (int i = 0; i < obj.arrNumber.length; i++) {
            System.out.println(obj.arrNumber[i]);
        }

        obj.arrNumber[1] = 678;
        System.out.println();
        System.out.println("For each...");
        for (int eleman: obj.arrNumber){
            System.out.println(eleman);
        }

        System.out.println("FINAL ARRAY.....");
        obj.fnlArrayNumber[0] = 34;
        obj.fnlArrayNumber[1] = 123;
        obj.fnlArrayNumber[2] = 987;

        System.out.println(Arrays.toString(obj.fnlArrayNumber));
        obj.fnlArrayNumber[1] = 33456;

        System.out.println(Arrays.toString(obj.fnlArrayNumber));

        int[] birArray = new int[3];

        System.out.println(Arrays.toString(obj.arrNumber));
        obj.arrNumber = birArray;
        System.out.println(Arrays.toString(obj.arrNumber));

        System.out.println("FINAL ARRAY");
       // obj.fnlArrayNumber = birArray; Error- fnlArrayNumber declared as final, can not be assigned another arrays reference

    }
}
