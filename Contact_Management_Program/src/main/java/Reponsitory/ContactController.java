/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import view.Menu;
import Reponsitory.ContactFunction;

/**
 *
 * @author Bravo
 */
public class ContactController extends Menu {

    ContactFunction ContactFunction;
    static String[] option = {". Add a contact", ". Display all contacts", ". Delete a contact", ". Exit"};

    public ContactController() {
        super("Display the menu:", option);
        ContactFunction = new ContactFunction();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                ContactFunction.Add_A_Contact();
                break;
            case 2:
                ContactFunction.DisPlay_All_Contacts();
                break;
            case 3:
                ContactFunction.Delete_A_Contacts();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                break;
        }
    }
}
