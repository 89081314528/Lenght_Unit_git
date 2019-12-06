package com.company;

public class Meters implements LengthUnits{
    private final Double amount;

    public Meters(Double m) {
        this.amount = m * 1;
    }
    public Meters(LengthUnits lengthUnits) {
        this.amount = lengthUnits.amountInConventionalUnit();
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public Double amountInConventionalUnit() {
        return amount;
    }

    public Double amountInUnit() {
        return amount / 1;
    }
}
