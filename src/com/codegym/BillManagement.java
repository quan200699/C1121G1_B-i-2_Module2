package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class BillManagement {
    private List<Bill> bills = new ArrayList<>();

    public int size() {
        return bills.size();
    }

    public void showAll() {
        for (int i = 0; i < bills.size(); i++) {
            System.out.println(bills.get(i));
        }
    }

    public void addNewBill(Bill bill) {
        bills.add(bill);
    }

    public void updateBill(int index, Bill bill) {
        bills.set(index, bill);
    }

    public void deleteBill(int index) {
        bills.remove(index);
    }
}
