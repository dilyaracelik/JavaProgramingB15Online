package day44_Inheritence;

public class SlackUser {

    protected String name;
    protected String status;

    // sendMessage
//	 callSomeone
//	 addEmoji

    public void sendMessage() {

        System.out.println("SlackUser " + name + " typing");
    }

    public void callSomeone() {

        System.out.println("SlackUser " + name + " calling");
    }

    public void addEmoji() {

        System.out.println("SlackUser " + name + " adding emoji :) ");
    }


}

//    Create a class called SlackUser
//        attributes :
//        name  ,  status (make it protected)
//        behaviours :
//        sendMessage
//        callSomeone
//        addEmoji
//        Creare 1 subClass SlackAdminUser
//        attribute :
//        adminId
//        behaviour :
//        sendAtChannelMessage
//        deleteMessage
//        addChannel
//        toString method
//        constructor :
//        3 argument constructor to set all fields value