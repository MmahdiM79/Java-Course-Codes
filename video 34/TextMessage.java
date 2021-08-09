import java.time.LocalDateTime;



class TextMessage 
{
    // Fields
    private String txtMessage;
    private LocalDateTime time;
    private String sender;
    private String receiver;
    private TextMessage replyTo;
    private ImageMessage replyToImage;



    // Constructors
    public TextMessage(String txtMessage, String sender, String receiver)
    {
        this.txtMessage = txtMessage;
        this.time = LocalDateTime.now();
        this.sender = sender;
        this.receiver = receiver;

        this.replyTo = null;
    }

    public TextMessage(String txtMessage, String sender, TextMessage replyTo)
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

    public TextMessage getReplyTo()
    {
        return this.replyTo;
    }
}





