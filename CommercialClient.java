package com.company;

/**
 * This class represents an organizational bank client and their account information.
 * @author Joseph Diaa
 * @since 17.4.2021
 */
public class CommercialClient extends Client {
    private String commercialID;

    /**
     * default constructor set national id.
     */
    public CommercialClient() {
        this.setNationalID("00000000000000");
    }

    /**
     * parameterized constructor that calls client class constructor and set commercialID and all attributes in client class.
     * @param name this is the name of client
     * @param address this is the address of client
     * @param phone this is the phone of client
     * @param account this is the account of client
     * @param commercialID this is the commercialID of client
     */
    public CommercialClient(String name,String address,String phone ,Account account,String commercialID) {
        super(name,"00000000000000",address,phone,account);
        this.commercialID= commercialID;
    }

    /**
     * this function displays Commercial ID
     * @return The commercial ID of the client.
     */
    public String getCommercialID() {
        return commercialID;
    }

    /**
     * this function takes the commercialID of Commercial Client and set it.
     * @param commercialID The new commercial ID to be set.
     */
    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    @Override
    /**
     * this is override to function toString to display all information of Commercial Client.
     */
    public String toString() {
        return String.format("Client type is: commercial\nClient name is: %s\nClient Commercial ID is :%s\nClient Address is: %s \n"+"Client Phone is: %s\n%s\n",name,commercialID,address,phone,account);
    }
}
