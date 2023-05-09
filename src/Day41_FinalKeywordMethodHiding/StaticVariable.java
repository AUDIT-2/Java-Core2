package Day41_FinalKeywordMethodHiding;

public class StaticVariable {
    static String okulAdi; //Static/Class variable
    public String adres; //Instance/Object variable

    StaticVariable(){
       // static String abc; //Constructor içerisinde static tanımlama yapılamaz
        okulAdi = "ABC OKulları";
    }
    public static void method(){
       // static int number; // method içerisinde static tanımlama yapılamaz.
        okulAdi = "Tester Academy";
    }

    public static void main(String[] args) {
        System.out.println("StaticVariable.okulAdi = " + StaticVariable.okulAdi);
        StaticVariable stcVar = new StaticVariable();
        StaticVariable stcVar1 = new StaticVariable();

        System.out.println("StaticVariable.okulAdi = " + StaticVariable.okulAdi);

        stcVar.method();
        System.out.println("StaticVariable.okulAdi = " + StaticVariable.okulAdi);

        stcVar.adres = "Herhangi bir adres";
        stcVar1.adres = "An other address";

        stcVar.okulAdi = "Bir okul";
        stcVar1.okulAdi = "An other school";
        System.out.println("stcVar.okulAdi = " + stcVar.okulAdi);
        System.out.println("stcVar1.okulAdi = " + stcVar1.okulAdi);

        System.out.println("stcVar.adres = " + stcVar.adres);
        System.out.println("stcVar1.adres = " + stcVar1.adres);

    }
}
