/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Interface;

public interface Sekil {
    //Attributes,fields --->public, static, final
    //Interface variables are by default public static final.
    //public static final int MAX_WIDTH = 100;
    int MAX_WIDTH = 100;
    int MAX_LENGTH = 100;
    // private int number; Not allowed.

    //Interface does not have any constructor.
   /*
    public Sekil(){

    }
    */

    //Interface methods are abstract.
    // public void draw();
    //Abstract method
     void draw();

    //Abstract methods can not be final or static.
     int getArea(int length, int width);

     default int getPerimeter(int length, int width) {
         return 2*length + 2*width;
     }

     //Static method
    static void merhaba(){
        System.out.println("Ben Interface in static metoduyum.");
    }

    private void privateDraw(){
        System.out.println("Ben bir private interface metoduyum.");
    }

    default void drawDef(){
         privateDraw();
    }
}
