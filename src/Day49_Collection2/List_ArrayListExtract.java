/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ArrayListExtract {

    //Userdefined-Custom method
    public static List<String> extract(int start, int end, List<String> arrayList){
        List<String > result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(arrayList.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Extracting portion of an ArrayList.");
        List<String> colors = new ArrayList<>();
        List<String> extractedColors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original list : " + colors);

        for (int i = 0; i < 3; i++) {
            extractedColors.add(colors.get(i));
        }
        System.out.println("Extracted arrayList" + extractedColors);
        System.out.println();

        //Userdefined-Custom method
        System.out.println("Extracted arrayList" + extract(0, 3, colors));
        System.out.println();

        //List interface sublist() metodu
        List<String> subList = new ArrayList<>();
        subList = colors.subList(0,3);
        System.out.println("subList = " + subList);


    }
}
