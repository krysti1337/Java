import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(){

    }

    // Constructor care primește doar numărul
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();  // Inițializează lista de contacte goală
    }

    // Constructor complet
    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact addContact) {
        if(findContact(addContact.getName()) >= 0){
            return false;
        }
        myContacts.add(addContact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundContact = findContact(oldContact);
        if(foundContact >= 0){
            myContacts.set(foundContact, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact removeContact) {
        int foundContact = findContact(removeContact);
        if(foundContact >= 0){
            myContacts.remove(removeContact);
            return true;
        }
        return false;
    }

    private int findContact(Contact findContact){
       return myContacts.indexOf(findContact);
    }

    private int findContact(String findContact){
        
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(findContact)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int indexName = findContact(name);
        if(indexName >= 0){
            return this.myContacts.get(indexName);
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}
