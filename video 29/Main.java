


public class Main 
{
    public static void main(String[] args) 
    {
        Etod e = new Etod(0.5f, "red");
        // e.getInfo();

        // Etod e2 = new Etod();
        // e2.getInfo();

        System.out.println(e.brand);
        System.out.println(Etod.brand);

        e.get();
        e.getInfo();
        Etod.get();
        // Etod.getInfo();

        e.change(4);
    }
}
