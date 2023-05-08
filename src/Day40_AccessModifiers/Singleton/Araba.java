/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class Araba {
    private static Araba instance; //Obje
    private static int numberOfInstance;
    private static int maxInstance;

    private String marka;
    private String model;

    private Araba(){
        numberOfInstance++;
    }
    private Araba(String marka, String model){
        setMarka(marka);
        setModel(model);
    }

   public static Araba instanceOlustur(){
        if(numberOfInstance < maxInstance){
            instance = new Araba();
        } else instance = null;
        return instance;
   }
    public static int getNumberOfInstance() {
        return numberOfInstance;
    }

    public static void setNumberOfInstance(int numberOfInstance) {
        Araba.numberOfInstance = numberOfInstance;
    }

    public static int getMaxInstance() {
        return maxInstance;
    }

    public static void setMaxInstance(int maxInstance) {
        Araba.maxInstance = maxInstance;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
      this.marka = marka;
    }

    public String getModel() {
        this.model = model;
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        String str = "";
            str = "Instance Adres : " + System.identityHashCode(this) + "\n";
            str += "Marka  : " + marka + "\n";
            str += "Model  : " + model+ "\n";
        return str;
    }
}
