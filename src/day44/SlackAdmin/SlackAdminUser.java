package day44.SlackAdmin;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;



    public SlackAdminUser(String name,String status,int adminId){
        this.name=name;
        this.status=status;
        this.adminId=adminId;
    }


    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void sendAtChannelMessage(){
        System.out.println(name+" sending Channel Message");
    }
    public void deleteMessage(){
        System.out.println(name+" is deleting message");
    }
    public void addChannel(){
        System.out.println(name+ " adding channel");
    }

    public static void main(String[] args) {

        SlackAdminUser a1=new SlackAdminUser("Akbar","teaching",111);
        System.out.println("a1 = " + a1);

        a1.addChannel();
        a1.deleteMessage();
        a1.sendAtChannelMessage();
        a1.addEmoji();
        a1.callSomeone();
        a1.sendMessage();



    }
}







