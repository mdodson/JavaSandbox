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
public class Sandbox {

    
        SandboxSupport sSupport = new SandboxSupport();
        
    public static void main(String[] args) {
        
        Sandbox s = new Sandbox();
        s.names();
        
    }
    
    public void names() {
        String firstName = sSupport.getFirstName();
        String lastName = sSupport.getLastName();
        
        if("".equals(firstName)){
            sSupport.setFirstName("Mike");
        }
        
        if("".equals(lastName)){
            sSupport.setLastName("Dodson");
        }
        
        if(sSupport.isLoggedIn()){
            
        } else {
            }
    }
    
}
