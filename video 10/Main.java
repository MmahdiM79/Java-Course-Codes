




public class Main 
{
    public static void main(String[] args) 
    {
        int num = 3;
        if (true || ((num = 10) == 3))
            System.out.println("check");

        System.out.println(num);
    }
}
