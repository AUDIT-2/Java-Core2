/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day34_Encapsulation_1;

public class Account {
    //Encapsulation
    private int number;
    private String type; //Dolar, Altın, TR Lirası...
    private double balance;

    public Account() {
    }

    public Account(int number, String type, double balance) {
        /*this.number = number;
        this.type = type;
        this.balance = balance;*/
        setNumber(number);
        setType(type);
        setBalance(balance);
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type.trim().toUpperCase();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 100){
            this.balance = 100;
        }
        this.balance = balance;
    }

    public void deposit(int ammount){
        if(ammount > 0){
            this.balance += ammount;
        }
    }
    public void withdraw(int ammount){
        if( ammount > 0 && ammount <= balance){
            this.balance -= ammount;
        }
    }
}
