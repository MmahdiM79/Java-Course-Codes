




public class Etod 
{
    // Fields
    String brand;
    String color;
    float size;


    // Constructor
    public Etod(String color)
    {
        this.color = color;
    }


    // Methods
    void push()
    { System.out.println("push" + " " + color); }

    void drawing()
    { System.out.println("drawing" + " " + color); }
}
