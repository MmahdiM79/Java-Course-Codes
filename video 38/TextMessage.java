

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

    public TextMessage(String txtMessage, String sender, Message replyTo)
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


    @Override
    public String toString() 
    {
        if (super.getReplyTo() == null)
            return "" + super.getSender() + " sends '" + txtMessage + "' to " + super.getReceiver() 
                    + " at " + super.getTime(); 

        return "" + super.getSender() + " sends '" + txtMessage + 
                "' reply to [" + super.getReplyTo() + "] to " + super.getReceiver() 
                + " at " + super.getTime();
    }
}





