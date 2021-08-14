import java.util.Arrays;



public class Main 
{
    public static void main(String[] args) 
    {
        Message msg1 = new ImageMessage("./pic.png", "", "mahdi", "ahmad", null);
        Message msg2 = new TextMessage("khubi?", "ahmad", msg1);


        Message[] msgs = new Message[20];
        for (int i = 0; i < msgs.length; i++)
            if (i % 2 == 0)
                msgs[i] = new ImageMessage("./pic.png", "" + i, "mahdi", "ahmad", null);
            else
                msgs[i] = new TextMessage("khubi? " + i, "ahmad", "mahdi");


        // System.out.println(Arrays.toString(msgs));

        for (Message msg : msgs)
            if (msg instanceof ImageMessage)
                System.out.println("IMAGE >>>  " + msg);
            else if (msg instanceof TextMessage)
                System.out.println("TEXT >>>  " + msg);
    }
}





