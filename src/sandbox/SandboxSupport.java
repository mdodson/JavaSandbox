/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author mdodson
 */
public class SandboxSupport {
    
    private String firstName = "";
    private String lastName = "";
    private boolean loggedIn = true;
    
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public boolean isLoggedIn(){
        return loggedIn;
    }
    
}
