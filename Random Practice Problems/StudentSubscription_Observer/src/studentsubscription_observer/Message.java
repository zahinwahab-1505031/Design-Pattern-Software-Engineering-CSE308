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
public class Message {
    String topic;
    String description;
    String date;
    public Message(String topic, String description,String date) {
        this.topic = topic;
        this.description = description;
        this.date = date;
    }
    public String toString(){
        return "TOPIC: "+ topic + "\nDESCRIPTION: "+description+ "\nDATE: "+date;
    }
}
