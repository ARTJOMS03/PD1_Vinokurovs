package Class;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Artjoms Vinokurovs
 */
public class User {
    private String name;
    private String surname;
    private String login;
    private String password;

    public User(String name, String surname, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.login = login;
    }

    public String getLogin(){
        return login;
    }
    
    public boolean enter(String login, String password) {

        return true;
    }
}
