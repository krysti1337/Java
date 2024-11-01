package dev.lpa;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) { //constructor
        this.name = name;
        this.customers = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameCustomer, double initialTransaction) {

        if (findCustomer(nameCustomer) == null) {
            customers.add(new Customer(nameCustomer, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double initialTransaction) {

        for(var customer : customers){
            if(customer.getName().equalsIgnoreCase(name)){
                customer.addTransaction(initialTransaction);
                System.out.println("Tranzactie adaugata cu succes pentru " + name);
                return true;
            }
        }
        return false;
    }

    public Customer findCustomer(String name){
        for (var existingCustomer : customers) {
            // Cautam clientul
            if (existingCustomer.getName().equalsIgnoreCase(name)) {
                return existingCustomer;
            }
        }
        return null;
    }
}
