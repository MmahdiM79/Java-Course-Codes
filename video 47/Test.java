
interface Test2
{
    
}

interface Test3
{
    
}


public interface Test extends Test2, Test3
{
    int NUM = 10;
    void test();


    default void fine() { System.out.println("fine"); }
    static void hello() { System.out.println("hello"); }


    public interface Test4
    {
        void test();
    }
}
