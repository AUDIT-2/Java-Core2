/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day34_Encapsulation_1;

public class BankManager {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Yatırım Bankası","Berlin/Germany");
       Account account1 = new Account(12345," dolar ",150);
       Account account2 = new Account(3456,"  Euro",3150);
       Account account3 = new Account(2334,"Tl   ",150);
       Account account4 = new Account(7889,"Altın",125);

       Customer customer1 =  new Customer("Ahmet Falanca");
       customer1.addAccount(account1);
       customer1.addAccount(account4);

       Customer customer2 = new Customer("John Smith");
       customer2.addAccount(account2);
       customer2.addAccount(account3);

       bank.addCustomer(customer1);
       bank.addCustomer(customer2);

       System.out.println("****  Banka müşterileri listeleme ****");
       bank.showCustomers();

       System.out.println("******** Para yatırma örneği *********");
       customer2.hesabaParaYatir(account2,450);
       customer2.showAccounts();


       System.out.println("********* Para Çekme örneği *********");
       customer2.hesaptanParaCek(account2,1450);
       customer2.showAccounts();
    }
}
