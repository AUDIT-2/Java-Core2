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
    //private int number; Not allowed.

    //Interface does not have any constructor.
   /*
    public Sekil(){

    }
    */

    //Interface methods are abstract. All methods in Interface are by default "public".
    //Other modifiers can not be used for methods
    //public void draw();
    //Abstract method by default public.
    void draw(); //Child class must implement the method.

    //Abstract methods can not be final or static.
    int getArea(int length, int width); //Child class must implement the method.

    //Default method-After JDK 8 interface may have default methods with code body.
    default int getPerimeter(int length, int width) {
        //This is a default method of interface. Child class may override.
        return 2 * length + 2 * width;
    }

    //Static method-After JDK 9 interface may have Static methods with code body.Static methods invoke with Class name and dot operator.
    static void merhaba() {
        System.out.println("Ben Interface in static metoduyum.");
    }

    //Private method-After JDK 9 interface may have private methods with code body.Private methods can be invoked within Class by other methods(Default,Static).
    private void privateDraw() {
        System.out.println("Ben bir private interface metoduyum.");
    }

    //Default method-After JDK 8 interface may have default methods with code body.
    default void drawDef() {
        //This is a default method of interface. Child class may override.
        privateDraw();
    }
}
