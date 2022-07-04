import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        //not exist and add it in
        if(findContact(contact)<0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contactOri, Contact contactNew){
        if(!myContacts.contains(contactOri)){
            return false;
        }
        //exist and replaced successfully
        myContacts.set(findContact(contactOri), contactNew);
        return true;
    }

    public boolean removeContact(Contact contact){
        //exist and remove successfully
        if(!myContacts.contains(contact)){
            return false;
        }
        myContacts.remove(findContact(contact));
        return true;
    }



    //error!!! cannot be the same name!!!

    private int findContact(Contact contact){
        if(findContact(contact.getName())<0){
            return -1;
        }
        return findContact(contact.getName());
    }

    private int findContact(String name){
        for(int i = 0; i<myContacts.size();i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        if(findContact(name)<0){
            return null;
        }
        return myContacts.get(findContact(name));
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i<myContacts.size();i++){
            System.out.println((i+1) +". " + myContacts.get(i).getName() +   " -> " + myContacts.get(i).getPhoneNumber());
        }
    }


}

