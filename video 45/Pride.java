


public class Pride extends Car
{
    public Pride()
    {
        super("white", "sypa", 4);
    }



    @Override
    public void turnOffHorn() { System.out.println("Pride: Horn is off"); }

    @Override
    public void turnOnHorn() { System.out.println("Pride: Horn is on"); }

    @Override
    public void startEngine() { System.out.println("Pride: Engine is starting"); }

    @Override
    public void putOnLights() { System.out.println("Pride: Lights are on"); }
}
