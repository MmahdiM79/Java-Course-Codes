

class TextMessage extends Message
{
    // Fields
    private String txtMessage;


    // Constructors
    public TextMessage(String txtMessage, String sender, String receiver)
    {
        super(sender, receiver, null);
        this.txtMessage = txtMessage;
    }

    public TextMessage(String txtMessage, String sender, TextMessage replyTo)
    {
        super(sender, replyTo);
        this.txtMessage = txtMessage;
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

    // @Override
    // public String getSender() 
    // {
    //     return super.getSender() + " from text message class";
    // }
}





