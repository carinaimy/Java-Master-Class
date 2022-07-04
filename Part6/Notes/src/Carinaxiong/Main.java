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

        //Inheritance
        Animal animal = new Animal(1, 1,5,5, "Animal");
        Dog dog = new Dog(8 ,20,"Luna",2,4,1,20,"Silky");
        //eat is in Animal class and dog can see the method
        dog.eat();
        dog.run();

        //Reference vs Object vs Instance vs Class
        //Class: blueprint for a house, using the blueprint we can build as many houses as we like based on those plans
        //Each house we build is an Object/Instance
        //Each house has an address(physical location) which is Reference
        //You can copy reference as many as you like but there still only one house,
        //we are only copy the address paper itself
        //We can pass references as parameters to constructors and methods.


        //this vs super    this() vs super()
        //super: use to access/call the parent class members(variables and methods)
        //this: use to call the current class members.
        //This is required when we hava a parameter with the same name as an instance field.
        //We can use both of them anywhere in a class except static areas

        //Use this() to call a constructor from another overloaded constructor in the same class
        //only in constructor and must be the first line
        //(used with constructor chaining, reduce dulicated code)

        //use super() to call a parent constructor
        //default to call super()(non-arg constructor) if we don't add it
        //must be the first statement in each constructor

        //methods overriding vs overloading
        //overloading: several methods with same name but different parameters
        //overriding: defining a method in a child class that already exists in the parent class with same signature(name,arguments)
        //cann't override static methods

        //static vs instance method
        //static method can't access instance methods and instance var directly
        //so that static method can't use this keyword

        //instance method belong to an instance of a class
        //we have to instantiate the class by using new keyword
        //use instance method if need to access instance var and method













    }
}