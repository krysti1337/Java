package dev.lpa;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty){
        return qty * price;
    }

    public void printPricedItem(int qty){

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", //Procent 2d inseamna ca un numar intreg va fi imprimat cu doua cifre justificate la dreapta, 8.2f inseamna un numar zecimal, un double sau float va fi tiparit cu precizie
                qty, price, type, description);                     //%-15 tipareste un sir de caractere, liniuta semnifica justificarea la stanga, iar 15 semnifica alocarea a minimum 15 spatii
    }

    public abstract void showDetails();

}
