import java.util.HashMap;

public class Contact {
    private static HashMap <String, String> contactList = new HashMap<String, String>();

    public static void addContact(String name, String phoneNumber){
        contactList.put(name, phoneNumber);
    }
    public static void deleteContact(String name){
        if (contactList.remove(name) == null){
            System.out.println("A contact with such a name does not exist!");
        } else {
            System.out.println("Deleted successfully");
        }
    }
    public static void getContactList() {
        if (contactList.size() == 0){
            System.out.println("No contacts yet");
        }
        for (String key : contactList.keySet()) {
            System.out.println("Name: " + key + "\nPhone number: " + contactList.get(key));
            System.out.println("------------------------------");
        }
    }
    public static String searchContactWithName(String name){
        String str = "";
        for (String key : contactList.keySet()){
            if (key.equals(name)){
               str += "------------------------------\nName: " + key + "\nPhone number: " + contactList.get(name);
                return str;
            }
        }
        return "Not found!";
    }
}
