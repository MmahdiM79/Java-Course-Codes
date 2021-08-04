import java.util.Scanner;



public class Main 
{
    private static Scanner in = new Scanner(System.in);



    public static void main(String[] args) 
    {
        Etod e = new Etod("red", 0.3f, "black");

        String newColor = "";
        for (int i = 0; i < 10; i++)
        {
            newColor = in.nextLine();
            e.setColorOfDrawing(newColor);

            System.out.println(e.getColorOfDrawing() + "\n");
        }

    }
}
