/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayListCompare {
    public static void main(String[] args) {
        System.out.println("Comparing two given list.");
        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");
        System.out.println("\n List-1 "+ colors1);

        List<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Pink");
        System.out.println("\n List-2 "+ colors2);

        List<String> comparedList = new ArrayList<>();

        for (String eleman: colors1){
           /*
            if(colors2.contains(eleman)){
                comparedList.add("Yes");
            }else comparedList.add("No")
            */;

            //Ternary
            comparedList.add(colors2.contains(eleman) ? "Yes" : "No");
        }
        System.out.println("comparedList = " + comparedList);
    }
}
