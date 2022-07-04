import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction){
        if(findCustomer(customerName)!= null){
            return false;
        }
        Customer newCustomer = new Customer(customerName, transaction);
        customers.add(newCustomer);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        if(findCustomer(customerName)!= null){
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){
        //return customer if exist
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(customerName)){
                return customers.get(i);
            }
        }
        return null;
    }
}
