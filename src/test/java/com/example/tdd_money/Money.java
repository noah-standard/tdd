package com.example.tdd_money;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount;
    }
}
