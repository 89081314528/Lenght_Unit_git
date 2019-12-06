package com.company;

public class Kilometer implements LengthUnits{
    private final Double amount;

    public Kilometer(Double km) {
        this.amount = km * 1000;
    }

    public Kilometer(LengthUnits lengthUnits) {
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
        return amount / 1000;
    }
}
