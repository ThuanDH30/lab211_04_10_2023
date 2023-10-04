/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import common.Validation;
import java.util.ArrayList;
import java.util.List;
import model.Contact;

/**
 *
 * @author Bravo
 */
public class ContactFunction implements IcontactFunction {

    private List<Contact> contact;

    public ContactFunction() {
        this.contact = new ArrayList<>();
    }

    @Override
    public void Add_A_Contact() {
        String choice;
        do {
            System.out.print("Enter first name: ");
            String firstName = Validation.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = Validation.checkInputString();
            System.out.print("Enter group: ");
            String group = Validation.checkInputString();
            System.out.print("Enter address: ");
            String address = Validation.checkInputString();
            System.out.print("Enter phone: ");
            String phone = Validation.checkInputPhone();
            contact.add(new Contact(firstName + lastName, group, address, phone, firstName, lastName));
            System.out.println("do you want add more Contact(Y/N)?");
            choice = Validation.checkInputString();;
        } while (choice.equalsIgnoreCase("Y"));
        if (choice == "N") {
            System.err.println("add Contacts successfully!");
        }
    }

    @Override
    public void DisPlay_All_Contacts() {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contact : contact) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getID(), contact.getFullName(),
                    contact.getFirstname(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    @Override
    public void Delete_A_Contacts() {
        System.out.print("Enter id to delete: ");
        int idDelete = Validation.checkInputInt();
        Contact contactDelete = getContactById(idDelete);
        if (contactDelete == null) {
            System.err.println("Contact not found.");
        } else {
            contact.remove(contactDelete);
            System.err.println("Delete successful.");
        }
    }

    public Contact getContactById(int id) {
        for (Contact c : contact) {
            if (c.getID() == id) {
                return c;
            }
        }
        return null;
    }

}
