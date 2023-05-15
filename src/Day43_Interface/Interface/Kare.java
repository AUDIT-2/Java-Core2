/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day43_Interface.Interface;

public class Kare implements Sekil{

    @Override
    public void draw() {
        System.out.println("Ben bir kare şekli çiziyorum.");
    }

    @Override
    public int getArea(int length, int width) {
        Sekil.merhaba();
        System.out.println("Karenin alanını hesaplıyorum.");
        return length * width;
    }

    @Override
    public int getPerimeter(int length, int width) {
        System.out.println("Karenin çevresini hesaplıyorum.");
        return 2*length + 2*width;
    }

    @Override
    public void drawDef() {
        //Default method of interface. Child class may override or use as parent class method like below.
        Sekil.super.drawDef();

        System.out.println("This method is overridden.");
    }
}
