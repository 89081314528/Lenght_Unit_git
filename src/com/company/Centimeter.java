package com.company;

public class Centimeter implements LengthUnits{
    private final Double amount;

    public Centimeter(Double cm) {
        this.amount = cm * 0.01;
    }

    public Centimeter(LengthUnits lengthUnits) {
        this.amount = lengthUnits.amountInConventionalUnit();
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public Double amountInConventionalUnit() {
        return amount;
    }

    public Double amountInUnit(){
        return amount / 0.01;
    }
}
