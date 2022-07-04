import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArr = {1,2,3,4,5,6,7,8,9,10};

        double[] myDoubleArr = new double[10];

//        System.out.println(myIntArr[5]);
//        for(int i = 0; i<myIntArr.length; i++){
//            System.out.println(myIntArr[i]);
//        }

        //int[] myArr = {50,160,40,23,200};

//        int[] myArr = new int[5];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter 5 numbers:\r");
//        for(int i = 0 ; i < myArr.length; i++){
//            myArr[i] = scanner.nextInt();
//        }
//
//
//
//        int[] sortedArr = new int[myArr.length];
//
//        int i = 0;
//        int j = myArr.length-1;
//        Arrays.sort(myArr);
//
//        while(i<myArr.length){
//            sortedArr[i] = myArr[j];
//            i++;
//            j--;
//        }
//        for(int k = 0; k<sortedArr.length; k++){
//            System.out.println(sortedArr[k]);
//        }


//        int[] arr1 = new int[]{1,2,3,4,5};
//        System.out.println("Array = " + Arrays.toString(arr1));
//
//        int[] reverseArr = new int[arr1.length];
//        int i = 0;
//        int j = arr1.length-1;
//        while(i<arr1.length){
//            reverseArr[i] = arr1[j];
//            i++;
//            j--;
//        }
//        System.out.println("Reversed array = " + Arrays.toString(reverseArr));


//        ArrayList<String> groceryList = new ArrayList<String>();
//        //add elements in
//        groceryList.add("apple");
//        groceryList.add("google");
//        groceryList.add("meta");
//        groceryList.add("oculus");
//        groceryList.add("roblox");
//        //to print needs to get
//        System.out.println(groceryList.get(0));
//        //modify it, set index and content
//        groceryList.set(0,"banana");
//        System.out.println(groceryList.get(0));
//        //remove item
//        groceryList.remove(0);
//        System.out.println(groceryList.get(0));
//        //find items - true or false / index
//        System.out.println(groceryList.contains("google"));
//        System.out.println(groceryList.indexOf("meta"));
//


//        MobilePhone mobilePhone = new MobilePhone("5106315102");
//        Contact carinaContact = new Contact("Carina", "123456");
//        Contact robContact = new Contact("Robert", "222222");
//        Contact KateContact = new Contact("Kate", "333333");
//        Contact carina1Contact = new Contact("Carina", "1123456");
//
//
//        mobilePhone.addNewContact(carinaContact);
//        mobilePhone.addNewContact(robContact);
//        mobilePhone.addNewContact(KateContact);
//        mobilePhone.addNewContact(carina1Contact);
//        System.out.println(mobilePhone.queryContact("Carina"));
//        mobilePhone.printContacts();


        //Autoboxing & Unboxing
        //Arraylist cannot use prime type since it's not a class
        //Like this -> ArrayList<int> intAL= new ArrayList<int>();
        //but we can create a class for the int, then we can use it
//        ArrayList<IntClass> intClassArrayList= new ArrayList<IntClass>();
//        intClassArrayList.add(new IntClass(54)); //add a value of 54 inside of the array list
//        //OR  THERE IS A EASIER WAY TO DO THIS FOR ALL PRIMITIVE TYPES! ---> AUTOBOXING
//        Integer integer = new Integer(54);
//        Double doubleVal = new Double(0.1);
//        //here Integer is pre wrapped int class
//        ArrayList<Integer> integerArrayList1 = new ArrayList<Integer>();
//        for(int i = 0; i<10; i++){
//            integerArrayList1.add(Integer.valueOf(i));//autoboxing
//            System.out.println(integerArrayList1.get(i).intValue());//unboxing
//        }


        Bank bank = new Bank("National Autralia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);


    }
}