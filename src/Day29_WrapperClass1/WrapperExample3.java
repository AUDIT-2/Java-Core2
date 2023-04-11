/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

public class WrapperExample3 {
    public static void main(String[] args) {
        Byte b = Byte.valueOf("127");
        System.out.println("b = " + b);
        Byte b1 = new Byte((byte) 127);
        Byte b2 = 127;
        Byte b3 = -128;
        Byte c = 0;
        c =(byte) (b1 + b2);
        System.out.println("c = " + c);

        Boolean evetMi = true;
        Boolean boolean1 = Boolean.valueOf("false");
        Boolean boolean2 = new Boolean(false);

        System.out.println("boolean1 = " + boolean1);
        System.out.println("boolean1.equals(boolean2) = " + boolean1.equals(boolean2));

        Character chr = Character.valueOf('A');
        Character chr1 = 'C';
        Character chr2 = Character.valueOf((char) 35902);
        System.out.println("chr2 = " + chr2);

        Long lng = Long.valueOf(12345678901234L);
        System.out.println("lng = " + lng);
        System.out.println("lng.doubleValue() = " + lng.doubleValue());
        System.out.println("lng.intValue() = " + lng.intValue());
        System.out.println("(long)lng.longValue() = " + (int) lng.longValue());

        Integer intW = 12234556;
        System.out.println("intW.byteValue() = " + intW.byteValue());
        System.out.println("((byte) intW) = " + ((byte) intW.intValue()));
    }
}
