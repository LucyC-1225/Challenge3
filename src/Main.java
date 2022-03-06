import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messages = new ArrayList<String>();
        System.out.println("Hello user!");
        boolean quit = false;
        while (!quit){
            int choice = 0;
            boolean repeat = true;
            while (repeat){
                try{
                    System.out.println("Main menu:" +
                            "\n1. Manage Contacts" +
                            "\n2. Messages" +
                            "\n3. Quit");
                    System.out.print("Input: ");
                    choice = sc.nextInt();
                    repeat = false;
                } catch(Exception e){
                    System.out.println("Please enter an integer!");
                    repeat = true;
                    sc.next();
                }
            }
            if (choice == 1) {
                boolean returnMainMenu = false;
                while (!returnMainMenu) {
                    System.out.println("------------------------------");
                    System.out.println("1. Show all Contacts" +
                            "\n2. Add a contact" +
                            "\n3. Delete a contact" +
                            "\n4. Search contacts" +
                            "\n5. Return to Main Menu"
                    );
                    System.out.print("Input: ");
                    int c = sc.nextInt();
                    if (c == 1) {
                        Contact.getContactList();
                    } else if (c == 2) {
                        System.out.print("Enter the name of the new contact: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Enter the phone number of the new contact: ");
                        String phoneNumber = sc.nextLine();
                        Contact.addContact(name, phoneNumber);
                    } else if (c == 3) {
                        System.out.print("Enter the name of the contact you want to delete: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        Contact.deleteContact(name);
                    } else if (c == 4) {
                        System.out.print("Enter the name of the contact you want to search for: ");
                        sc.nextLine();
                        String input = sc.nextLine();
                        System.out.println(Contact.searchContactWithName(input));
                    } else if (c == 5){
                        returnMainMenu = true;
                    } else {
                        System.out.println("Not a valid choice!");
                    }
                }
            } else if (choice == 2){
                System.out.println("------------------------------");
                System.out.println("1. List of all messages" +
                        "\n2. Send message");
            } else if (choice == 3){
                quit = true;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }
}
