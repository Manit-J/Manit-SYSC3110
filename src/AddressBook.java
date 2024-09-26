import java.util.*;

public class AddressBook {

    private HashMap<String, String> addressBook;

    public AddressBook() {
        addressBook = new HashMap<String, String>();
    }

    public void addBuddy(BuddyInfo buddy) {
        addressBook.put(buddy.getName(), buddy.getAddress());
    }

    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy.getName());
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo myBuddy = new BuddyInfo("John", "Ottawa", "8989891881");
        AddressBook myBook = new AddressBook();
        myBook.addBuddy(myBuddy);
        myBook.removeBuddy(myBuddy);
        System.out.println("Testing changes in a new commit");
        // Adding some sample text to test changes
    }
}
