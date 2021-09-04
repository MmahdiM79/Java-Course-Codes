import java.util.InputMismatchException;
import java.util.Scanner;



public class Main
{
    private static Scanner in = new Scanner(System.in);


    public static int check(int n) throws Exception, InputMismatchException
    {
        if (n > 100)
            throw (new Exception("the given num is greater than 100!"));


        if (n <= 100 && n > 0)
            return 1;
        return -1;
    }


    public static void main(String[] args) 
    {
        int n = 101;
        try {
            String hold = in.next();
            n = in.nextInt();
            int m = Integer.valueOf(hold);
            System.out.println(n + "  " + m);
        }
        // catch (InputMismatchException | NumberFormatException e)
        catch (Exception e)
        {
            System.out.println("vorudi eshtebah!!");
            System.out.println(e.toString());
        }
        
        System.out.println("\n\n continuing ...\n");


        try {
            System.out.println(check(n));
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
    }
}