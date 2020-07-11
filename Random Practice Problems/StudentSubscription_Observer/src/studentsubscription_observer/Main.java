/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsubscription_observer;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Zahin
 */
public class Main {
   static Scanner sc = new Scanner(System.in);
   static ClassRepresentative subscription = new ClassRepresentative();
   public static void addStudent(){
        System.out.println("ENTER STUDENT NAME:");
        String name = sc.nextLine();
        System.out.println("ENTER EMAILID:");
        String emailID = sc.nextLine();
        System.out.println("ENTER STUDENT ID:");
        String studentID = sc.nextLine();
        System.out.println("ENTER PHONE NUMBER:");
        String phoneNumber = sc.nextLine();
        StudentObserver observer = new StudentObserver(subscription);
        observer.setStudentInfo(name, emailID, studentID, phoneNumber);
   }
    public static void addCR(){
        System.out.println("ENTER STUDENT NAME:");
        String name = sc.nextLine();
        System.out.println("ENTER EMAILID:");
        String emailID = sc.nextLine();
        System.out.println("ENTER STUDENT ID:");
        String studentID = sc.nextLine();
        System.out.println("ENTER PHONE NUMBER:");
        String phoneNumber = sc.nextLine();
        subscription.setStudentInfo(name, emailID, studentID, phoneNumber);
   }
   public static void removeStudent(){
        System.out.println("ENTER STUDENT ID OF THE STUDENT TO BE REMOVED: ");
        String studentID = sc.nextLine();
        Observer ob=null;
        for(Observer observer:subscription.observers){
          if(observer.getID().equals(studentID)) ob = observer;
        }subscription.removeObserver(ob);
   }
   public static void sendMessage(){
       Date date = new Date();
       System.out.println("ENTER TOPIC: ");
       String topic = sc.nextLine();
       System.out.println("ENTER DESCRIPTION: ");
       String description = sc.nextLine();
       Message message = new Message (topic,description,date.toString());
       subscription.setMessage(message);
   }
   public static void main(String[] args) {
       
    StudentObserver observer = new StudentObserver(subscription);
    observer.setStudentInfo("Zahin", "zahinwahab@gmail.com", "31", "01521201384");
    observer = new StudentObserver(subscription);
    observer.setStudentInfo("Mina", "mina@gmail.com", "32", "01929291199"); 
    observer = new StudentObserver(subscription);
    observer.setStudentInfo("Raju", "raju@gmail.com", "33", "01255291199"); 
       while(true){
           System.out.println("1.ADD CR");
           System.out.println("2.ADD STUDENT");
           System.out.println("3.REMOVE STUDENT");
           System.out.println("4.SEND MESSAGE");
           System.out.println("5.SEE LATEST MESSAGE");
           System.out.println("6.SEE ALL MESSAGES");
           System.out.println("7.SEE LIST OF SUBSCRIBED STUDENTS");
           int choice = Integer.parseInt(sc.nextLine());
           if(choice==1) addCR();
           else if(choice == 2) addStudent();
           else if(choice==3) removeStudent();
           else if(choice==4) {
               sendMessage();
           }
            else if(choice==5) {
                if(subscription.getMessage()!=null)
               System.out.println(subscription.getMessage().toString());
           }
           else if(choice==6) {
               for(Message m:subscription.messages){
               System.out.println(m.toString());
          }
           }
           else if(choice==7){
               for(Observer o:subscription.observers){
               System.out.println(o.toString());
          }
           }
       }
    }
    
}
