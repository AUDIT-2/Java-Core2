/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class Singleton {
    private static int numberOfInstance;
    private static Singleton singletonInstance = null;
    private static int maxNumberOfInstance;

    private Singleton() {
        numberOfInstance++;
    }
    public static int getNumberOfInstance(){
        return numberOfInstance;
    }

    public static void setMaxNumberOfInstance(int maxNumberOfInstance) {
        Singleton.maxNumberOfInstance = maxNumberOfInstance;
    }

    public static Singleton getSingletonInstance(){
        if(singletonInstance == null || numberOfInstance < maxNumberOfInstance){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

   /* public static Singleton getSingletonInstance(){ //It creates only one instance
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }*/
}
