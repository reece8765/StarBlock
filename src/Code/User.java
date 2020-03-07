/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Adam
 */
public class User {

    String ID;
    String Name;
    int PhoneNo;
    String Address;
    String Password;
    double Balance;
    boolean Active;

    public void setID(String input) {
        ID = input;
    }
    public void setName(String input) {
        Name = input;
    }
    public void setPhoneNo(int input) {
        PhoneNo = input;
    }
    public void setAddress(String input) {
        Address = input;
    }
    public void setPassword(String input) {
        Password = input;
    }
    public void setBalance(double input) {
        Balance = input;
    }
    public void setActive(boolean input) {
        Active = input;
    }
    public String returnID() {
        return ID;
    }
    public String returnName() {
        return Name;
    }
    public int returnPhoneNo() {
        return PhoneNo;
    }
    public String returnAddress() {
        return Address;
    }
    public String returnPassword() {
        return Password;
    }
    public double returnBalance() {
        return Balance;
    }
    public boolean returnActive() {
        return Active;
    }
}
    
