/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeywordMethodHiding.Banka;

public class BankalarTest {
    public static void main(String[] args) {
        ABCBank bank1 = new ABCBank();
        bank1.name = "ABC Bankası";
        bank1.address = "ABC Caddesi";

        XYZBank bank2 = new XYZBank();
        bank2.name = "XYZ Bankası";
        bank2.address = "XYZ Caddesi";

        Banka banka3 = new ABCBank();
        banka3.name = "BANKA3";


        System.out.println("bank1.getRateOfInterest() = " + bank1.getRateOfInterest());
        System.out.println("bank1.getRateSuper() = " + bank1.getRateSuper());

        System.out.println("bank2.getRateOfInterest() = " + bank2.getRateOfInterest());

        System.out.println("banka3.getRateOfInterest() = " + banka3.getRateOfInterest());
        System.out.println("((ABCBank)banka3).getRateSuper() = " + ((ABCBank) banka3).getRateSuper());

        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(banka3);
    }
}
