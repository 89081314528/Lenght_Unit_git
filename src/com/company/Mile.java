package com.company;

public class Mile implements LengthUnits{
    private final Double amount;

    public Mile(Double mil) {
        this.amount = mil * 1609.344;
    }

    public Mile(LengthUnits lengthUnits) {
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
        return amount / 1609.344;
    }
}
