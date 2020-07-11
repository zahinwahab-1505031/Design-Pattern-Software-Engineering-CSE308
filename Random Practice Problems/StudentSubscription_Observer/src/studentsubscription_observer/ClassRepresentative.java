/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsubscription_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zahin
 */
public class ClassRepresentative extends Student implements Observable {
    private Message message;
    protected List<Observer> observers = new ArrayList<Observer>();
    protected List<Message> messages = new ArrayList<Message>();
       
    private String name;
    private String emailID;
    private String studentID;
    private String phoneNumber;
    private boolean isCR;
    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyAllObervers(){
        for(Observer observer:observers){
            observer.updateMessage();
        }
    }
    
    public Message getMessage(){
        return message;
    }
    public void setMessage(Message message){
        this.message = message;
        messages.add(message);
        notifyAllObervers();
    }
    @Override
    public void setStudentInfo(String name, String emailID, String studentID, String phoneNumber) {
        this.name = name;
        this.emailID = emailID;
        this.studentID = studentID;
        this.phoneNumber = phoneNumber;
        this.isCR = true;
    }
}
