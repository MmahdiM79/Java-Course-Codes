import java.util.InputMismatchException;
import java.util.Scanner;



public class Main
{
    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws Exception
    {
        // throw new TestException();
        // throw new TestException(" test be moshkel khord ");
        // throw new TestException(" test failed by ", new InputMismatchException());
        // throw new TestException(new InputMismatchException("wrong input for int"));
        // throw new TestException(new InputMismatchException());
        
        int a = 0;
        try {
            a = in.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("ok");
        }

        System.out.println(a);
    }
}