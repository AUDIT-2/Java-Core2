/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day34_Encapsulation_1;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accounts;//Holds customer accounts

    public Customer(String name) {
        //this.name = name;
        //this.accounts = new ArrayList<>();
        setName(name);
        setAccounts(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void hesabaParaYatir(Account account, int ammount) {
        account.deposit(ammount);
    }

    public void hesaptanParaCek(Account account, int ammount) {
        account.withdraw(ammount);
    }

    public void showAccounts() {
        System.out.println("Name of customer : " + this.getName());
        for (Account account : getAccounts()) {
            // System.out.println("Name of customer : " + this.getName());
            System.out.println("    Account number   : " + account.getNumber());
            System.out.println("    Account type     : " + account.getType());
            System.out.println("    Account balance  : " + account.getBalance());
            System.out.println("--------------------------------------------------------");
        }
    }
}
