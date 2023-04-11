/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day29_WrapperClass1;

public class MyWrapperClassTest {
    public static void main(String[] args) {
        MyWrapperClass myWrpCls = new MyWrapperClass(1234567);

        String str =  myWrpCls.stringValue();
        System.out.println("str = " + str);

        byte b = myWrpCls.byteValue();
        System.out.println("b = " + b);

        double dbl = myWrpCls.doubleValue();
        System.out.println("dbl = " + dbl);

        MyWrapperClass.valueOf(45678);
        System.out.println("myWrpCls.intValue() = " + myWrpCls.intValue());

        MyWrapperClass myStrObj = new MyWrapperClass("98760");
        System.out.println("myStrObj.intValue() = " + myStrObj.intValue());

        Integer sayi = Integer.valueOf(122334);
    }
}
