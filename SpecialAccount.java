package com.company;

/**
 * This class represents a bank account that each client can own. It enables him to manage his financial matters and allows over-drafting.
 * @author Arwa Hazem
 * @since 16.4.2021
 */
public class SpecialAccount extends Account {
    /**
     * this parameterized constructor takes balance of account and set it
     * @param balance the initial balance
     */
    public SpecialAccount(double balance) {
        super(balance);
    }

    @Override
    /**
     *this is override to function toString to display all information of Special account
     * @return A string with the information about the special account.
     */
    public String toString() {
        return String.format( "Account type is: Special\nAccount number is: %s\nAccount Balance is: %g\n" ,this.accountNumber, this.balance);
    }

    @Override
    /**
     * this function override to function withdraw from class Account.
     * this function take money that client wants to withdraw from his account and check if this money <= balance+1000.
     * @throws IllegalArgumentException
     */

    public void withdraw(double money) {
        if(balance+1000>=money) {
            balance -= money;
            System.out.println("Withdraw process has been done successfully and your balance is: "+balance);
        }
        else{
            throw new IllegalArgumentException("Your balance isn't sufficient even after over-drafting");
        }
    }
}