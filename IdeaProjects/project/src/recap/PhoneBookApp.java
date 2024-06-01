package recap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;
import static java.lang.System.setOut;

public class PhoneBookApp {
        static ArrayList<String[]>contacts= new ArrayList<>();
       static Scanner input = new Scanner(System.in);
       public static void main (String[] args){
          phoneBookMenu();
       }

    private static void phoneBookMenu() {
        String prompt = """
        Welcome to My phonebook App 
        1 -> addContact;
        2 -> removeContact;
        3 -> findContact by phoneContact;
        4 -> findContact by firstName;
        5 -> findContact by lastName;
        6 -> printAllContacts;
        7 -> exit;       
        """;
        System.out.println(prompt);
        String mainMenu = input.next();
        switch(mainMenu){
            case "1": addCount();
            case "2": removeContact();
            case "3": findContactByPhoneContact();
            case "4": findContactByFirstName();
            case "5" : findContactByLastName();
            case "6" : printAllContact();
            case "7" : exit(3);


        }



    }

    private static void printAllContact() {
           for(String[] contact: contacts){
               System.out.print(Arrays.toString(contact));
           }

        phoneBookMenu();
    }

    private static void findContactByLastName() {
           System.out.println("Enter the last name of the contact: :");
           String findName = input.next();
           for(String[] contact: contacts){
               if(contact[0].equals(findName)){
                   System.out.println("contactFound");
                   System.out.println(contact[1]);
               }
           else{
               System.out.println("contactNotFound");
               }
           }
        phoneBookMenu();


    }

    private static void findContactByFirstName() {
    }

    private static void findContactByPhoneContact() {
           System.out.println("Enter the phone number of the contact: :");
           String contactToFind = input.next();
           for(String[] contact: contacts){
               if(contact[0].equals(contactToFind)){
                   System.out.println("contactFound");
               }
           }
        phoneBookMenu();
    }

    private static void removeContact() {
           System.out.println("Enter the phone number of the contact: :");
           String numberToRemove = input.next();
           for(String[] contact: contacts){
               if(contact[0].equals(numberToRemove)){
                   System.out.println("contactFound");
                   contacts.remove(contact);
                   System.out.println("contact successfully  Removed");


               }
           }
        phoneBookMenu();
       }

    private static void addCount() {
        System.out.println("Enter the first name of the contact: :");
        String firstName = input.next();
        System.out.println("Enter the last name of the contact: :");
        String lastName = input.next();
        System.out.println("Enter the phone number of the contact: :");
        String phoneNumber = input.next();
        String[] newContact ={firstName,lastName,phoneNumber};
        contacts.add(newContact);
        phoneBookMenu();

       }


}



