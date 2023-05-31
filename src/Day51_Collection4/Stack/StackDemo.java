/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.Stack;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        //First In Last Out----> FILO--->Stack data structure
        //Last In First Out----> LIFO--->Stack data structure

        Stack<String> stackColors = new Stack<>();

        stackColors.push("Red");
        stackColors.push("Yellow");
        stackColors.push("Blue");
        stackColors.push("Green");
        stackColors.push("Black");

        System.out.println("stackColors = " + stackColors);

        //Searching an element in a stack
        System.out.println("stackColors.search(\"Green\") = " + stackColors.search("Green")); //Returns the position of element from the top of the stack
        System.out.println("stackColors.search(\"Black\") = " + stackColors.search("Black"));
        System.out.println("stackColors.search(\"Red\") = " + stackColors.search("Red"));
        System.out.println("stackColors.search(\"Mavi\") = " + stackColors.search("Mavi")); //Returns -1 which the color is not in the stack


        System.out.println("stackColors.pop() = " + stackColors.pop());
        System.out.println("stackColors = " + stackColors);
        System.out.println("stackColors.pop() = " + stackColors.pop());
        System.out.println("stackColors = " + stackColors);
        System.out.println("stackColors.peek() = " + stackColors.peek());
        System.out.println("stackColors = " + stackColors);

        System.out.println("stackColors.empty() = " + stackColors.empty());
    }
}
