import java.time.LocalDateTime;



public class Message 
{
    // Fields
    private LocalDateTime time;
    private String sender;
    private String receiver;
    private Message replyTo;

    private String test;



    // Constructors
    public Message(String sender, String receiver, Message replyTo) 
    {
        this.time = LocalDateTime.now();
        this.sender = sender;
        this.receiver = receiver;
        this.replyTo = replyTo;
    }

    public Message(String sender, Message replyTo) 
    {
        this.time = LocalDateTime.now();
        this.sender = sender;
        this.receiver = replyTo.getSender();
        this.replyTo = replyTo;
    }




    // getter
    public final String getSender() { return sender; }
    public final String getReceiver() { return receiver; }
    public Message getReplyTo() { return replyTo; }
    public LocalDateTime getTime() { return time; }


    
    //  Methods

    @Override
    public String toString()
    {
        if (replyTo == null)
            return "" + sender + " sends this message at " + time + " to " + receiver;
        
        return "" + sender + " sends this message reply to [" + replyTo + "] at " + time 
                + " to " + receiver;
    }



    @Override
    public boolean equals(Object o) 
    {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
    

        Message message = (Message) o;

        return (message.getSender().equals(sender) && 
                message.getReceiver().equals(receiver) &&
                message.getTime().equals(time) &&
                message.getReplyTo().equals(replyTo));
    }




    public void setTest(String test) {
        this.test = test;
    }
    public String getTest() {
        return test;
    }
}
