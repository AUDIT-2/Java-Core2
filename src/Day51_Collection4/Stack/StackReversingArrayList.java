/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StackReversingArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrColors = new ArrayList<>();

        arrColors.add("Red");
        arrColors.add("Blue");
        arrColors.add("Brown");
        arrColors.add("Yellow");
        arrColors.add("Black");
        arrColors.add("Pink");
        arrColors.add("Green");

        System.out.println("ArrayList colors   : " + arrColors);

        ArrayList<String> reversedArray = new ArrayList<>();

      /*
      //Reversing an ArrayList with Classic for loop
        for (int i = arrColors.size()-1; i >= 0 ; i--) {
            reversedArray.add(arrColors.get(i));
        }
        */
        // System.out.println("Reversed ArrayList : " + reversedArray);


        Stack<String> stackColors = new Stack<>();
        for (String eleman : arrColors) {
            stackColors.push(eleman);
        }

        System.out.println("Stack colors       : " + stackColors);
        System.out.println("stackColors.pop() = " + stackColors.pop());

        Collections.reverse(arrColors);
        System.out.println("ArrayList colors(Reversed): " + arrColors);
    }

}
