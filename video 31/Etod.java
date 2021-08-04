


public class Etod 
{
    // Fields
    public final String BRAND = "Panter";
    private float price = 12.25f;
    private String colorOfBody;
    private float size;
    private String colorOfDrawing;




    // Constructor
    public Etod(String colorOfBody, float size, String colorOfDrawing)
    {
        this.colorOfBody = colorOfBody;
        this.size = size;
        this.colorOfDrawing = colorOfDrawing;
    }




    // setter method
    public void setColorOfDrawing(String colorOfDrawing)
    {
        String[] colors = {"black", "white", "red", "blue", "green", "yellow"};
        for (String color : colors)
            if (colorOfDrawing.equalsIgnoreCase(color))
            {
                this.colorOfDrawing = colorOfDrawing;
                return;
            }
    }



    // getter methods
    public String getBrand() { return this.BRAND; }

    public float getPrice() { return this.price; }

    public String getColorOfBody() { return this.colorOfBody; }

    public float getSize() { return this.size; }

    public String getColorOfDrawing() { return this.colorOfDrawing; }
    
}
