


public class Main 
{
    public static void main( String[] args )
    {
        // ImageMessage imsg = new ImageMessage("./pic.jpg", "see this", "mahdi", "ahmad", null);

        // System.out.println(imsg.getTime());
        // System.out.println(imsg.getReceiver());

        TextMessage tmsg = new TextMessage("salam khubi?", "mahdi", "ahmad");
        System.out.println(tmsg.getSender());
    }
}



