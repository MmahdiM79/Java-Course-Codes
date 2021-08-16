




public class Main 
{
    public static void main(String[] args) 
    {
        // String s = "hello world";
        // s.split(" ");

        Car c1 = new Pride();
        Car c2 = new Sclass();

        c1.startEngine();
        c2.startEngine();

        System.out.println(c1.getColor());
        System.out.println(c2.getColor());

        // Car c3 = new Car("blue", "BMW", 4){
        //     @Override
        //     public void startEngine() {
        //         System.out.println("C3 Engine Started");
        //     }
        // };
    }



    // public abstract void getMain();
}
