/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection4.Stack;

import java.util.Stack;

public class StackReversingString {
    public static void main(String[] args) {
        String mesaj = "Merhaba Java.";
        String reversedMesaj = "";

        for (int i = mesaj.length()-1; i >= 0 ; i--) {
            reversedMesaj += mesaj.charAt(i);
        }
        System.out.println("Mesaj    : " + mesaj);
        System.out.println("Mesaj(R) : " + reversedMesaj);

        Stack<String> revStack = new Stack<>();

        for (int i = 0; i < mesaj.length(); i++) {
            revStack.push(mesaj.charAt(i)+"");
        }
        System.out.println( revStack);
        String tersStackStr="";

        while (revStack.size() != 0){
           // System.out.print(revStack.pop());
            tersStackStr += revStack.pop().toUpperCase();
        }
        System.out.println("tersStackStr = " + tersStackStr);
       /* System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());
        System.out.println("revStack.pop() = " + revStack.pop());*/

    }
}
