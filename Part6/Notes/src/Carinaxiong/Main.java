package Carinaxiong;

public class Main {
    public static void main(String[] args) {

        //Objects - field
        //Like a computer, microphone, door...
        //state - hard drive
        //ant age, number of legs
        //behavior - drawing pictures // methods
        //class - like a template for blueprint, user define type

        //create object
        //have to initialize it
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        //cannot access private variables if we
        //call model directly
        //System.out.println(porsche.getModel());

        //challenge - bank account
        System.out.println();
        //constructor - creating the object
        BankAccount carinaAccount = new BankAccount();

        //BankAccount carinaAccount = new BankAccount(12345,1000,
                //"Carina","carinaimy@gmail.com",123456789);
//        carinaAccount.setCustomerName("Carina");
//        carinaAccount.setAccountNumber(123456789l);
//        carinaAccount.setBalance(50000);
//        carinaAccount.setEmail("carinaimy@gmail.com");
//        carinaAccount.setPhoneNumber(5106315102l);

//        System.out.println("Account Name: "+carinaAccount.getCustomerName());
//        System.out.println("Account Number: "+ carinaAccount.getAccountNumber());
//        System.out.println("Email: "+carinaAccount.getEmail());
//        System.out.println("Phone Number: "+ carinaAccount.getPhoneNumber());
//        System.out.println("Balance: "+carinaAccount.getBalance());
//
//        System.out.println("Deposit 550 dollars.");
//        carinaAccount.depositFunds(550);
//        System.out.println("Current balance: "+carinaAccount.getBalance());
//        System.out.println("Withdraw 10000");
//        carinaAccount.withDrawFunds(10000);
//        System.out.println("Current balance: "+carinaAccount.getBalance());
//        System.out.println("Attempt withdraw 60000");
//        carinaAccount.withDrawFunds(60000);
//        System.out.println("Current Balance: "+carinaAccount.getBalance());



        //Challenge VipCustomer


    }
}