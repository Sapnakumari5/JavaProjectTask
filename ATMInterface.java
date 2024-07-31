package javaprogram;

import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000; // initial balance

        while (true) {
            System.out.println("ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int amount = scanner.nextInt();
                    if (amount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextInt();
                    balance += amount;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
