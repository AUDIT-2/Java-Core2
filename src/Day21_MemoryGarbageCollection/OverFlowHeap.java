/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day21_MemoryGarbageCollection;

public class OverFlowHeap {
    public static void main(String[] args) {
        System.out.println("Heap Memory >Error< -OutofMemory");
        String str = "Merhaba";
        int count = 0;

        while (true){
            count++; //Number of objects created
            str += str; //Each time new object is created(String is immutable)
           // System.out.println("Idendity of object = " +Integer.toHexString(System.identityHashCode(str)));
            //System.out.println(str);
            System.out.println(count + "- str nesnesinin uzunluğu = " + str.length() + " karakter");
        }

      /*  //Garbage C. çalışacağından memory hatası vermeyecek
       count = 0;
        while (true){
          String abc =  new String("Deneme");
            // System.out.println(System.identityHashCode(abc));
            System.out.println(count++);
        }*/
    }
}
