/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day40_AccessModifiers.Singleton;

public class Araba {
    private static Araba instance; //Metod ile oluşturulan instance ı tutan değişken
    private static int numberOfInstance; // Oluşturulan instance sayısı
    private static int maxInstance; //Oluşturulabilecek maksimum instance sayısı

    private String marka;
    private String model;

    //Private No-args Constructor
    private Araba(){
        numberOfInstance++; //Oluşturulan instance sayısı
    }

    //Private constructor with args
    private Araba(String marka, String model){
        setMarka(marka);
        setModel(model);
    }

    //Constructor lar private tanımlandığından ancak bu metod ile instance oluşturulabilir.
    public static Araba instanceOlustur(){
        if(numberOfInstance < maxInstance){
            instance = new Araba(); //No-args constructor call
        } else instance = null;
        return instance; //Oluşturulan instance i döndürür.
    }

    public static Araba instanceOlustur(String marka, String model){
        if(numberOfInstance < maxInstance){
            instance = new Araba(marka,model); //Args constructor call
        } else instance = null;
        return instance; //Oluşturulan instance i döndürür.
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
            str = "Instance Adres : " + System.identityHashCode(this) + "\n"; //Instance ın memory adresini yazar
            str += "Marka  : " + marka + "\n";
            str += "Model  : " + model+ "\n";
        return str;
    }
}
