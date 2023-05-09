/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayList {
    ArrayList<Integer> arrayList = new ArrayList<>();
    final ArrayList<Integer> fnlArrayList = new ArrayList<>();

    public static void main(String[] args) {
        FinalArrayList obj = new FinalArrayList();

        //Normal Array list
        obj.arrayList.add(123);
        obj.arrayList.add(345);
        obj.arrayList.add(5);
        obj.arrayList.add(2345);
        System.out.println("ArrayList :" + Arrays.asList(obj.arrayList));

        //Final Array list
        obj.fnlArrayList.add(667);
        obj.fnlArrayList.add(67);
        obj.fnlArrayList.add(745);
        obj.fnlArrayList.add(9867);

        System.out.println("Final ArrayList :" + Arrays.asList(obj.fnlArrayList));
        obj.fnlArrayList.remove(1);
        System.out.println();
        System.out.println("Final ArrayList :" + Arrays.asList(obj.fnlArrayList));

        obj.arrayList = obj.fnlArrayList;
        System.out.println("ArrayList :" + Arrays.asList(obj.arrayList));

       // obj.fnlArrayList = obj.arrayList; Error
    }
}
