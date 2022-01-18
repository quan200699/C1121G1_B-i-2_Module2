package com.codegym;

public class Bill {
    private Customer customer;

    private int oldIndex;

    private int newIndex;

    private double money;

    public Bill() {
    }

    public Bill(Customer customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.money = (this.newIndex - this.oldIndex) * 750;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return customer + ", " + oldIndex + ", " + newIndex + ", " + money;
    }
}
