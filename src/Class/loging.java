/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author USER DK
 */
public class loging extends register{
    private String User;
    private String Password;

    public loging() {
        this.Password = register.Password1;
        this.User = register.Username;
    }

    
    
    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        this.User = user;
    }
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}