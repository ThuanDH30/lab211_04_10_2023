/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import model.Contact;

/**
 *
 * @author Bravo
 */
public interface IcontactFunction {
    void Add_A_Contact();
    void DisPlay_All_Contacts();
    Contact getContactById(int E);
    void Delete_A_Contacts();
}
