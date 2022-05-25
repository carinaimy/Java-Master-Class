package Carinaxiong;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;


    //Constructor with 3 parameters and 2 default value
    public BankAccount(String customerName, String email, long phoneNumber) {
        this(99999,0,customerName,email,phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Constructor
    public BankAccount(){
        //default values - MUST BE FIRST LINE
        this(12345,0,"DEFAULT NAME","DEFAULT EMAIL",000000123);
        System.out.println("Empty Constructor called.");

    }

    public BankAccount(long accountNumber, double balance, String customerName, String email, long phoneNumber){
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName= customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public long getAccountNumber(){
        return accountNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }


    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositFunds(int deposit){
        this.balance = this.balance + deposit;
    }

    public void withDrawFunds(int withdraw){
        if(this.balance > withdraw){
            this.balance = this.balance - withdraw;
        }
        else{
            System.out.println("You don't have enough money.");
        }
    }

}
