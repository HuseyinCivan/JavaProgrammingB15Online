package day44;

//Create a class called SlackUser
//attributes :
//	 name  ,  status (make it protected)
//behaviours :
//	 sendMessage
//	 callSomeone
//	 addEmoji

public class SlackUser {

    protected String name;
    protected String status;


    public void sendMessage(){
        System.out.println(name+" Sending Message");

    }
    public void callSomeone(){
        System.out.println(name+" Calling Someone");


    }
    public void addEmoji(){
        System.out.println(name+" Adding Emoji");


    }

}
