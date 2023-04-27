/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day36_StaticClassMembers_1;

public class NumberOfObjects {
    static int objectCounter; //Class variable
    int number; //Instance-object variable

    public NumberOfObjects(){
        number++;
        objectCounter++;
    }

    public static void main(String[] args) {
        NumberOfObjects obj1 = new NumberOfObjects();
        System.out.println("obj1.number = " + obj1.number);

        NumberOfObjects obj2 = new NumberOfObjects();
        System.out.println("obj2.number = " + obj2.number);
        NumberOfObjects obj3 = new NumberOfObjects();
        System.out.println("obj3.number = " + obj3.number);
        NumberOfObjects obj4 = new NumberOfObjects();
        System.out.println("obj4.number = " + obj4.number);
        NumberOfObjects obj5 = new NumberOfObjects();
        System.out.println("obj5.number = " + obj5.number);
        NumberOfObjects obj6 = new NumberOfObjects();
        System.out.println("obj6.number = " + obj6.number);

        System.out.println("NumberOfObjects.objectCounter = " + NumberOfObjects.objectCounter);
        System.out.println("obj3.objectCounter = " + obj3.objectCounter);
    }
}
