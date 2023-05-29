/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day49_Collection2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ArrayListSearch {
    public static void main(String[] args) {
        System.out.println("Searching an element in an ArrayList.");
        List<String> colors = new ArrayList<>();

        //List interface türünde bir intance oluşturduğumuz için ihtiyaç duyduğumuzda implementasyon klasını
        //kod içerisinde bir değişiklik yapmadan değiştirebiliriz. Aşağıdaki gibi...
        //List<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original list : " + colors);

        String search = "";
        search = "White";
        if(colors.contains(search)){ //it returns false or true
            System.out.println("Aradığınız Renk listede var.");
            System.out.println("Index of element : " + colors.indexOf(search));
            System.out.println(colors.get((colors.indexOf(search))));
        } else System.out.println("Aradığınız renk listede yok!!!");
    }
}
