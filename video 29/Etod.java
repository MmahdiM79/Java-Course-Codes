



public class Etod 
{
    private float size;
    private String color;
    public static String brand = "Panter";
    

    public Etod(float size, String color)
    {
        change(size);
        this.color = color;
    }

    
    public Etod()
    {
        this.size = 0;
        this.color = "";
    }

    
    public void getInfo()
    {
        System.out.println("size: " + size);
        System.out.println("color: " + color);
    }

    public static void get()
    {
        System.out.println("brand: " + brand);
    }

    
    private void change(float size)
    {
        this.size = size;
    }
}
