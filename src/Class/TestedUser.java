/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Artjoms Vinokurovs
 */
public class TestedUser extends User {

    private int questionsCount = 0;
    private int rightAnswer = 0;

    public TestedUser(String name, String surname, String login, String password){
        super(name, surname, login, password);
    }
    
    public void getAnswer(Question question, int answer) {

    }

    public void clear() {

    }
}
