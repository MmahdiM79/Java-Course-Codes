import java.time.LocalDateTime;


public class Message 
{
    // Fields
    private LocalDateTime time;
    private String sender;
    private String receiver;
    private Message replyTo;



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
    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public Message getReplyTo() { return replyTo; }
    public LocalDateTime getTime() { return time; }
}
