import javax.swing.*;
import java.util.*;

public class AddressBook {

    private HashMap<String, String> addressBook;
    public DefaultListModel<BuddyInfo> listAddressBook = new DefaultListModel<>();
    public View myView;

    public AddressBook() {
        addressBook = new HashMap<String, String>();
    }

    public void addBuddy(BuddyInfo buddy) {
        listAddressBook.addElement(buddy);
        addressBook.put(buddy.getName(), buddy.getAddress());
    }

    public void removeBuddy(BuddyInfo buddy){
        listAddressBook.removeElement(buddy);
        addressBook.remove(buddy.getName());
    }

    public void printThis(String text){
        System.out.println(text);
    }

    public void setView(View V) {
        V.model = this;
    }

    public HashMap<String, String> getAddressBook(){
        return addressBook;
    }

    public DefaultListModel<BuddyInfo> getListAddressBook(){
        return listAddressBook;
    }

}
