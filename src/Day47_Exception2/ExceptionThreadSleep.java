/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception2;

public class ExceptionThreadSleep {
    public static void pauseCode(int seconds) throws InterruptedException,ArithmeticException{
        System.out.println("pauseCode() method called.");
       /* try {
            Thread.sleep(seconds * 1000L);
        }
        catch (Exception e){

        }*/
        System.out.println(seconds + " saniye programı durdurdum.");
        Thread.sleep(seconds * 1000L);
        System.out.println("Program çalışmaya kaldığı yerden devam ediyor.");
        int sonuc = 15/0;
    }
    public static void testABC() throws InterruptedException{
        System.out.println("testABC() method called.");
        doSomeTest();
        try {
            pauseCode(5);
        }catch (ArithmeticException e){
            System.out.println("Hata: Bir tam sayı 0' a bölünemez.");
            System.out.println(e.getMessage());
        }
        doSomeTest();
    }
    public static void doSomeTest(){
        System.out.println("doSomeTest() method called.");
    }
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main method has invoked.");
        testABC();
    }
}
