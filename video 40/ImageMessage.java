


public class ImageMessage extends Message
{
    // Fields
    private String imagePath;
    private long imageFileSize;
    private String caption;


    // Constructors
    public ImageMessage(String imagePath, String caption, 
                        String sender, String receiver, Message replyTo) 
    {
        super(sender, receiver, replyTo);

        this.imagePath = imagePath;
        this.imageFileSize = 256l; // calculated from the image file size
        this.caption = caption;
    }




    // methods
    public void downloadImage()
    {
        System.out.println("downloading ... ");
    }
    public void showImage()
    {
        System.out.println("showing ... ");
    }




    // setters
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
        this.imageFileSize = 1024l; // calculated from the image file size
    }


    // getters
    public long getImageFileSize() { return imageFileSize; }
    public String getImagePath() { return imagePath; }
    public String getCaption() { return caption; }


    @Override
    public String toString() 
    {
        if (super.getReplyTo() == null)
            return "" + super.getSender() + " sends photo " + imagePath + " with size: " + imageFileSize +
                        " to " + super.getReceiver() + " with caption: " + caption + 
                            " at " + super.getTime() + "\n";


        return "" + super.getSender() + " sends photo " + imagePath + " with size: " + imageFileSize +
                " to " + super.getReceiver() + " with caption: " + caption + 
                " reply to " + super.getReplyTo() +
                    " at " + super.getTime() + "\n";
    }



    @Override
    public boolean equals(Object o) 
    {
        // System.out.println("equals method in ImageMessage class");

        if (o == this) return true;
        if (!(o instanceof ImageMessage))  return false;
        

        ImageMessage imageMessage = (ImageMessage) o;
        return (super.equals(o) &&
                imageMessage.getImagePath().equals(imagePath) &&
                imageMessage.getImageFileSize() == imageFileSize &&
                imageMessage.getCaption().equals(caption));
    }
}
