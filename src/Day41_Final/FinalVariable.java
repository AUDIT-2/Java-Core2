/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_Final;

public class FinalVariable {
    int number = 10; //Assign a init value within same statement
    int number1; //Declaration
    double number2 = 2.5;

    //Final variable- Decleration and assignment
    //1-Same statement
    //2-constructors
    //3-init block

    //final olarak tanımlanan değişkenler aynı zamanda CONSTANT yani sabit olarak ta adlandırılırlar.
    final int finalInt = 100; //Declaration and assignment in same statement. We may name it as CONSTANT
    final int finalInt1; //Declaration
    final int finalInt2;

    //Best practice olarak büyük harfle yazılırlar
    final double KDV_18 = 0.18;
    final double KDV_TEMIZLIK = 0.20;
    final double PI = 3.14;
    final double TUKETICI_KREDISI = 1.29;
    final double KONUT_KREDI_FAIZI = 0.95;
    final String DERS_ADI = "Final keyword in JAVA.";

    //Init block-Instance block
    {
        System.out.println("Init block called.");
       finalInt2 = 345; //Assigning initial value within init block.
    }
    //Constructor
    FinalVariable(){
        System.out.println("Constructor block called.");
        number1 = 134;
        number = 25;
        finalInt1 = 123; //Assigning initial value within constructor.
      //finalInt = 126; //Error--value can not be changed
    }
    public void aMethod(){
        number = 123; //normal variable(not final) can be assigned new value
       // finalInt = 345; //Error--value can not be changed
       // finalInt1 = 255; //Error--value can not be changed
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();

        System.out.println("obj.finalInt1 = " + obj.finalInt1);
        // obj.finalInt1 = 456; Can not be assigned a new value

        System.out.println("obj.number = " + obj.number);
        obj.number = 459; //Final olmadığından yen bir değer atayabildik.
        System.out.println("obj.number = " + obj.number);

        System.out.println("obj.KDV_18 = " + obj.KDV_18);

        //obj.KDV_18 = 12;
        double fiyat = 100 * obj.KDV_18 + 100;
        System.out.println("fiyat = " + fiyat);
        fiyat = 100 * obj.KDV_TEMIZLIK + 100;
        System.out.println("fiyat = " + fiyat);

        System.out.println("obj.KONUT_KREDI_FAIZI = " + obj.KONUT_KREDI_FAIZI);
        System.out.println("obj.TUKETICI_KREDISI = " + obj.TUKETICI_KREDISI);
        System.out.println("obj.DERS_ADI = " + obj.DERS_ADI);
    }
}
