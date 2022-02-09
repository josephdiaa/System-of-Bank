package com.company;

/**
 * This class represents a bank account that each client can own. It enables him to manage his financial matters.
 * @author Arwa Hazem
 * @since 16.4.2021
 */
public class Account {
    protected double balance;
    protected int accountNumber;
    private static int incrementer=1;

    /**
     * default constructor
     */
    public Account(){}

    /**
     * parametrized constructor to set the balance
     * @param balance The initial balance
     */
    public Account(double balance) {
        this.balance = balance;
        this.accountNumber = incrementer++;
    }

    /**
     * this function displays the balance of client's account
     * @return the balance of the client's account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * this function takes balance of client's account and set it
     * @param balance the new balance of the client's account
     * @throws IllegalArgumentException
     */
    public void setBalance(double balance) {
        if(balance<0){
            throw new IllegalArgumentException("You can't enter a negative value");
        }
        this.balance = balance;
    }

    /**
     * this function displays the account number of client's account
     * @return the account number of the client's account
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * this function takes account number of client's account and set it
     * @param accountNumber the new account number of the client's account
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    /**
     *this is override to function toString to display all information of account
     */
    public String toString() {
        return String.format( "Account type is: Not special\nAccount number is: %s\nAccount Balance is: %g\n" ,this.accountNumber, this.balance);
    }

    /**
     * This function takes the amount of money the client wants to withdraw from his account and set it.
     * @param money the amount to be withdrawn
     * @throws IllegalArgumentException
     */
    public void withdraw(double money) {
        if(balance>=money) {
            balance-=money;
            System.out.println("Withdraw process has been done successfully and your balance is: "+balance);
        }
        else{
            throw new IllegalArgumentException("Your balance isn't sufficient");
        }
    }
    /**
     * This function takes the amount of money the client wants to deposit from his account and set it.
     * @param money the amount to be deposited
     * @throws IllegalArgumentException
     */
    public void deposit(double money) {
        if(money<0){
            throw new IllegalArgumentException("You can't enter a negative number");
        }
        balance+=money;
        System.out.println("Deposit process has been done successfully and your balance is: "+balance);
    }
}
