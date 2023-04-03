/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day25_StringClass2;

public class StringIndexOf {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.indexOf("planet", 7));

       int count = 0;
       int index = myStr.indexOf("planet");
        while (index > -1){
            count++;
            index = myStr.indexOf("planet");
            System.out.println("index no : " + index);
            if(myStr.indexOf("planet" , index + 1) > -1){
                count++;
                index = myStr.indexOf("planet");
                System.out.println("index no : " + index);
            } else index = -1;
        }
}
}
