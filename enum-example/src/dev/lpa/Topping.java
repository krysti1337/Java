package dev.lpa;

public enum Topping {

    MUSTARD,
    PICKELS,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){

        return switch (this){ //switch catre sina isusi Enum
            case BACON -> 1.5;
            case TOMATO -> 1.0;
            default -> 0.0;
        };
    }

}
