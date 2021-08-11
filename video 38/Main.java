


public class Main 
{
    public static void main(String[] args) 
    {
        Message msg = new Message("mahdi", "ahmad", null);
        // System.out.println(msg.toString());

        Message msg2 = new Message("ahmad", msg);
        // System.out.println(msg2.toString());

        TextMessage tmsg = new TextMessage("ok hale", "mahdi", msg2);
        // System.out.println(tmsg.toString());

        ImageMessage imsg = new ImageMessage("./folder/", "ino bbebin", "mahdi", "ahmad", null);
        // System.out.println(imsg.toString());

        TextMessage tmsg2 = new TextMessage("are didam", "ahmad", imsg);
        System.out.println(tmsg2.toString());
    }
}





