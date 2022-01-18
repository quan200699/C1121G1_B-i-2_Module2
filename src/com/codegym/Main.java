package com.codegym;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        BillManagement billManagement = new BillManagement();
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    showAllBill(billManagement);
                    break;
                }
                case 2: {
                    showCreateBill(billManagement);
                    break;
                }
                case 3: {
                    showUpdateBill(billManagement);
                    break;
                }
                case 4: {
                    showDeleteBill(billManagement);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void showDeleteBill(BillManagement billManagement) {
        System.out.println("Xóa hóa đơn");
        System.out.println("Nhập vị trí bạn muốn xóa");
        int index = scanner.nextInt();
        if (index < 0 || index > billManagement.size()) {
            System.out.println("Vị trí nhập vào không hợp lệ!");
        } else {
            billManagement.deleteBill(index);
        }
    }

    private static void showUpdateBill(BillManagement billManagement) {
        System.out.println("Chỉnh sửa thông tin hóa đơn");
        System.out.println("Nhập vị trí bạn muốn sửa thông tin:");
        int index = scanner.nextInt();
        if (index < 0 || index > billManagement.size()) {
            System.out.println("Vị trí nhập vào không hợp lệ!");
        } else {
            Bill bill = getBill();
            billManagement.updateBill(index, bill);
        }
    }

    private static void showCreateBill(BillManagement billManagement) {
        System.out.println("Thêm thông tin hóa đơn mới");
        Bill bill = getBill();
        billManagement.addNewBill(bill);
    }

    private static void showAllBill(BillManagement billManagement) {
        System.out.println("Danh sách hóa đơn");
        billManagement.showAll();
    }

    private static Bill getBill() {
        System.out.println("Nhập thông tin chủ hộ");
        Customer customer = getCustomer();
        System.out.println("Nhập thông tin hóa đơn");
        System.out.println("Nhập chỉ số cũ");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập chỉ số mới:");
        int newIndex = scanner.nextInt();
        return new Bill(customer, oldIndex, newIndex);
    }

    private static Customer getCustomer() {
        System.out.println("Nhập tên chủ hộ:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà:");
        String apartmentNumber = scanner.nextLine();
        System.out.println("Nhập số công tơ điện:");
        int kwh = scanner.nextInt();
        return new Customer(name, apartmentNumber, kwh);
    }

    private static void menu() {
        System.out.println("1. Hiển thị danh sách hóa đơn");
        System.out.println("2. Thêm hóa đơn mới");
        System.out.println("3. Cập nhật hóa đơn");
        System.out.println("4. Xóa hóa dơn");
        System.out.println("0. Thoát");
    }
}
