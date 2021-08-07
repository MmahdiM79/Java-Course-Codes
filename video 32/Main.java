



public class Main 
{
    public static void main(String[] args) 
    {
        Message msg = new Message("salam khubi?", "user1", "user2");
        System.out.println(msg.getMessage());
        System.out.println(msg.getTime());
        System.out.println(msg.getReplyTo());

        System.out.println("\n ------------- \n");

        Message msg2 = new Message("mamnun to khubi?", "user2", msg);
        System.out.println(msg2.getMessage());
        System.out.println(msg2.getTime());
        System.out.println(msg2.getReplyTo());
        System.out.println(msg2.getReplyTo().getSender());
        System.out.println(msg2.getReplyTo().getMessage());
    }
}
