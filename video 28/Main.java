import java.util.Scanner;




public class Main 
{
    public static float profit(float f)
    {
        return f * 1.25f;
    }

    public static float profit(float f, float g)
    {
        return f * g;
    }

    public static void main(String[] args) 
    {
        // Scanner in = new Scanner(System.in);

        // float f = in.nextFloat();
        // f *= 1.25f;
        // System.out.println(f);

        // f = in.nextFloat();
        // f *= 1.25f;
        // System.out.println(f);

        // System.out.println(profit(in.nextFloat()));
        // System.out.println(profit(in.nextFloat()));
        // System.out.println(profit(in.nextFloat()));
        // System.out.println(profit(in.nextFloat()));
        // System.out.println(profit(in.nextFloat()));
        // System.out.println(profit(in.nextFloat()));
        // System.out.println(profit(in.nextFloat()));

        System.out.println(profit(5f));
        System.out.println(profit(5f, 1.2f));
    }
}
