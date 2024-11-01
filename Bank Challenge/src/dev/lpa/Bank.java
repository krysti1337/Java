package dev.lpa;

import java.util.ArrayList;
public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameBranch){
        if(findBranch(nameBranch) == null){
            branches.add(new Branch(nameBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameBranch, String nameCustomer, double initialTransaction){

        Branch branch = findBranch(nameBranch);
        if(branch != null ){
            return branch.newCustomer(nameCustomer, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameBranch, String nameCustomer, double initialTransaciton){

        Branch branch = findBranch(nameBranch);

        if(branch != null){
            return branch.addCustomerTransaction(nameCustomer, initialTransaciton);
        }
        return false;
    }

    private Branch findBranch(String nameBranch){

        for(Branch branch : branches){
            if(branch.getName().equals(nameBranch)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameBranch, boolean printTransactions) {
        Branch branch = findBranch(nameBranch);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
