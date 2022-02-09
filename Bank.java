package com.company;

import java.util.ArrayList;

/**
 * This class represents a bank system that manages its clients and their accounts.
 * @author Yara Samy
 * @since 20.4.2021
 */
public class Bank {
    private String name , address, phone;
    ArrayList <Account> accountList = new ArrayList<Account>();
    ArrayList <Client> clientList = new ArrayList<Client>();

    /**
     * default constructor
     */
    public Bank(){}

    /**
     * parameters constructor set name,address and phone of the Bank.
     * @param name
     * @param address
     * @param phone
     */
    public Bank (String name , String address, String phone){
        this.name=name;
        this.address=address;
        this.phone= phone;
    }

    /**
     * this function displays the name of the Bank.
     * @return The name of the bank as a string.
     */
    public String getName() {

        return name;
    }

    /**
     * this function takes the name of the Bank and set it.
     * @param name The name to be set to the bank.
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * this function displays the address of Bank.
     * @return The address of the bank as a string.
     */
    public String getAddress() {

        return address;
    }

    /**
     * this function takes the address of the Bank and set it.
     * @param , address The address to be set to the bank.
     */
    public void setAddress(String address) {

        this.address = address;
    }

    /**
     * this function displays the phone of Bank.
     * @return The phone of the bank as a string.
     */
    public String getPhone() {

        return phone;
    }

    /**
     * this function takes the phone of the Bank and set it.
     * @param phone The phone to be set to the bank.
     */
    public void setPhone(String phone) {

        this.phone = phone;
    }

    /**
     * this function takes client and add it to client list.
     * @param client The client to be added the the list.
     */
    public void add(Client client){
        accountList.add(client.getAccount());
        clientList.add(client);
    }

    /**
     * this function display all clients' and Their account information.
     */
    public void display(){
        for(int i=0; i<clientList.size();i++){
            System.out.println(clientList.get(i).toString());

        }
    }
}
