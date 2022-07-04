import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)!=null){
            return false;
        }
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
        return true;
    }


    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch currBranch = findBranch(branchName);
        int isExistingCustomer = 0;
        if(currBranch != null){
            for(int i=0; i<currBranch.getCustomers().size();i++){
                if(currBranch.getCustomers().get(i).getName().equals(customerName)){
                    isExistingCustomer ++;
                }
            }
            if(isExistingCustomer == 0){
                Customer currCustomer = new Customer(customerName,initialTransaction);
                currBranch.getCustomers().add(currCustomer);
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch currBranch = findBranch(branchName);
        if (currBranch != null) {
            for (int i = 0; i < currBranch.getCustomers().size(); i++) {
                if (currBranch.getCustomers().get(i).getName().equals(customerName)) {
                    currBranch.getCustomers().get(i).addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }


    private Branch findBranch(String branchName){
        for(int i = 0; i<branches.size(); i++){
            if(branches.get(i).getName().equals(branchName)){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        if(findBranch(branchName)!=null){
                System.out.println("Customer details for branch " + branchName);
                for(int i = 0; i<findBranch(branchName).getCustomers().size(); i++){
                    System.out.println("Customer: "+findBranch(branchName).getCustomers().get(i).getName()+"["+(i+1)+"]");
                    if(printTransactions == true){
                        System.out.println("Transactions");
                        for(int j = 0; j<findBranch(branchName).getCustomers().get(i).getTransactions().size();j++){
                            System.out.println("["+(j+1)+"]  Amount "+findBranch(branchName).getCustomers().get(i).getTransactions().get(j));
                        }
                    }
                }
            return true;
        }
        return false;
    }

}
