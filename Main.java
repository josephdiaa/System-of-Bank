package com.company;
import java.util.Scanner;

/**
 * The class that contains the main method.
 * @author Yara Samy
 * @since 20.4.2021
 */
public class Main {
    public static void main(String args[]){
        Bank bank = new Bank();
        Account account = null;
        Client client=null;
        boolean running= true , mainMenu=true,addClient=false,withdraw=false,deposit=false;
        System.out.println("Enter your bank information: name ,address, and phone number respectively.");
        Scanner scan= new Scanner(System.in);
        bank.setName(scan.next());
        bank.setAddress(scan.next());
        bank.setPhone(scan.next());
        System.out.println("---------------------------------------------");
        while (running){
            if(mainMenu){
                System.out.println("1) Add client\n2) Withdraw\n3) Deposit\n4) Display all clients and accounts\n5) Display bank information\n6) Exit");
                int choice= scan.nextInt();
                switch (choice){
                    case 1:
                        addClient= true;
                        mainMenu= false;
                        break;
                    case 2:
                        withdraw = true;
                        mainMenu= false;
                        break;
                    case 3:
                        deposit = true;
                        mainMenu = false;
                        break;
                    case 4:
                        bank.display();
                        break;
                    case 5:
                        System.out.format("Bank name is: %s\nBank address is: %s\nBank phone is: %s\n",bank.getName(),bank.getAddress(),bank.getPhone());
                        break;
                    case 6:
                        running = false;
                        break;
                    default:
                        System.out.println("You entered a wrong option.");

                }
            }
            if(addClient){
                scan.skip("\n");
                System.out.println("which type of accounts do you have? special or not special?");
                if(scan.nextLine().charAt(0)=='s'){
                    System.out.println("Enter your account balance");
                    account = new SpecialAccount(scan.nextDouble());
                }
                else{
                    System.out.println("Enter your account balance");
                    account = new Account(scan.nextDouble());
                }
                System.out.println("which type of clients are you? commercial or not commercial?");
                scan.skip("\n");
                if(scan.nextLine().charAt(0)=='c'){
                    System.out.println("Enter your name , Address, phone and CommercialID");
                    client=new CommercialClient(scan.next(),scan.next(),scan.next(),account,scan.next());
                }
                else{
                    System.out.println("Enter your name, national ID, address, phone");
                    client=new Client(scan.next(),scan.next(),scan.next(),scan.next(),account);
                }
                bank.add(client);
                mainMenu = true;
                addClient = false;
            }
            if(withdraw){
                System.out.println("How much money do you want to withdraw?");
                try {
                    client.getAccount().withdraw(scan.nextDouble());
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                mainMenu = true;
                withdraw = false;
            }
            if(deposit){
                System.out.println("How much money do you want to deposit?");
                try {
                    client.getAccount().deposit(scan.nextDouble());
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                mainMenu = true;
                deposit = false;
            }
        }

    }
}