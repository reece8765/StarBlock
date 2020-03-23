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
    double Balance;
    boolean Active;

    public void setID(String input) {
        ID = input;
    }
    public void setName(String input) {
        Name = input;
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
    public double returnBalance() {
        return Balance;
    }
    public boolean returnActive() {
        return Active;
    }
}
    
