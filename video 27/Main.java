




public class Main 
{
    private static long pow2(int num)
    {
        return (long)num*num;
    }

    private long pow3(int num)
    {
        return (long)num*num*num;
    }


    public static void main(String[] args) 
    {
        System.out.println(pow2(4));
        Main t = new Main();
        System.out.println(t.pow3(4));
    }
}
