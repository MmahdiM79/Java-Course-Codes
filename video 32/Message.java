import java.time.LocalDateTime;



class Message 
{
    // Fields
    private String txtMessage;
    private LocalDateTime time;
    private String sender;
    private String receiver;
    private Message replyTo;



    // Constructors
    public Message(String txtMessage, String sender, String receiver)
    {
        this.txtMessage = txtMessage;
        this.time = LocalDateTime.now();
        this.sender = sender;
        this.receiver = receiver;

        this.replyTo = null;
    }

    public Message(String txtMessage, String sender, Message replyTo)
    {
        this.txtMessage = txtMessage;
        this.time = LocalDateTime.now();
        this.sender = sender;
        this.receiver = replyTo.getSender();
        this.replyTo = replyTo;
    }




    // Methods

    public void editMessage(String txtMessage)
    {
        this.txtMessage = txtMessage;
    }

    // getters
    public String getMessage() 
    {
        return this.txtMessage;
    }

    public LocalDateTime getTime()
    {
        return this.time;
    }

    public String getSender()
    {
        return this.sender;
    }

    public String getReceiver()
    {
        return this.receiver;
    }

    public Message getReplyTo()
    {
        return this.replyTo;
    }
}





