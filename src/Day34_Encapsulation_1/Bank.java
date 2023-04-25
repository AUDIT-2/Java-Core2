/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day34_Encapsulation_1;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String address;
    private ArrayList<Customer> customers;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.trim().toUpperCase();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void showCustomers(){
        System.out.println("Name of bank    : " + this.getName());
        System.out.println("Address of bank : " + this.getAddress());
        System.out.println("----------------------------------");
        System.out.println("Customers of the bank");
        System.out.println("----------------------------------");
        for (Customer customer : getCustomers()){
            customer.showAccounts();
        }
    }
}
