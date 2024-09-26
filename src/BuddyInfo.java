public class BuddyInfo {
    public BuddyInfo(String buddyName, String buddyAddress, String buddyPhoneNumber) {
        name = buddyName;
        address = buddyAddress;
        phoneNumber = buddyPhoneNumber;
    }

    public BuddyInfo() {
        name = "John Doe";
        address = "John's Address";
        phoneNumber = "9999999999";
    }
    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "Homer's Address", "8888888888");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
