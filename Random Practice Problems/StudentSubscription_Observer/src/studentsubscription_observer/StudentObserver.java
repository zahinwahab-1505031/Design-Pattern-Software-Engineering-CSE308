/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsubscription_observer;

/**
 *
 * @author Zahin
 */
public class StudentObserver extends Student implements Observer {
    ClassRepresentative subscription;
    Message message;
   
    private String name;
    private String emailID;
    private String studentID;
    private String phoneNumber;
    private boolean isCR;
    public StudentObserver(ClassRepresentative subscription) {
        this.subscription = subscription;
        this.subscription.addObserver(this);
    }
    
    @Override
    public void subscribe(){
        subscription.observers.add(this);
    }
    @Override
    public void unsubscribe(){
         subscription.observers.remove(this);
    }
    @Override
    public void updateMessage(){
        message = subscription.getMessage();
    }

    public ClassRepresentative getSubscription() {
        return subscription;
    }

    public void setSubscription(ClassRepresentative subscription) {
        this.subscription = subscription;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void setStudentInfo(String name, String emailID, String studentID, String phoneNumber) {
        this.name = name;
        this.emailID = emailID;
        this.studentID = studentID;
        this.phoneNumber = phoneNumber;
        this.isCR = false;
    }
    public String toString(){
        return name + " " + studentID + " " + emailID + " "+phoneNumber;
    }
    @Override
    public String getID(){
        return getStudentID();
    }
    
}
