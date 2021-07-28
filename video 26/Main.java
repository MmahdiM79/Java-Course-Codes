


public class Main 
{
    public static void main(String[] args) 
    {
        Etod red = new Etod("red");
        Etod blue = new Etod("blue");

        System.out.println(red.color);
        System.out.println(blue.color);

        red.push();
        red.drawing();
    }
}
