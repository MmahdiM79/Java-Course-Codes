


public class Main 
{
    public static void main(String[] args) 
    {
        // String str = "Hello World!";
        // if (str.equals("Hello world!"))
        //     System.out.println("yes");
        // else
        //     System.out.println("no");



        // Message msg = new Message("mahdi", "ahmad", null);
        // msg.setTest("test");
        // System.out.println(msg.getTest());

        // Message msg2 = msg;
        // System.out.println(msg2.getTest());
        // msg2.setTest("test2");

        // System.out.println(msg.getTest());
        // System.out.println(msg2.getTest());



        Message msg = new Message("mahdi", "ahmad", null);
        ImageMessage imsg = new ImageMessage("./pic.png", "ino bbin", "ahmad", "mahdi", msg);
        TextMessage tmsg = new TextMessage("are didam", "mahdi", imsg);

        // if (msg instanceof ImageMessage)
        //     System.out.println("yes 1");
        
        // if (msg instanceof TextMessage)
        //     System.out.println("yes 2");

        // if (msg instanceof Message)
        //     System.out.println("yes 3");

        // if (imsg instanceof Message)
        //     System.out.println("yes 4");

        // if (tmsg instanceof Message)
        //     System.out.println("yes 5");



        System.out.println(msg.equals(tmsg));
    }
}





