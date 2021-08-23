import java.io.Serializable;



public class Main implements Test, Serializable
{
    public static void main(String[] args) 
    {
        Main m = new Main();

        Test.hello();
        System.out.println(Test.NUM);
        // Test.NUM = 4;
    }

    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public void fine() {
        System.out.println("Main fine");
    }
}