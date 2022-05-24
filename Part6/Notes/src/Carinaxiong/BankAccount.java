package Carinaxiong;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double depositFunds(int deposit){
        return this.balance + deposit;
    }

    public double withDrawFunds(int withdraw){
        if(this.balance > withdraw){
            return this.balance - withdraw;
        }
        else{
            return -1;
        }
    }

}
