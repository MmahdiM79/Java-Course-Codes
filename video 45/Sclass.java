


public class Sclass extends Car
{
    public Sclass()
    {
        super("black", "benz", 4);
    }

    

    @Override
    public void turnOffHorn() { System.out.println("Sclass: Horn is off"); }

    @Override
    public void turnOnHorn() { System.out.println("Sclass: Horn is on"); }

    @Override
    public void startEngine() 
    { 
        System.out.println("Sclass: check the doors");
        System.out.println("Sclass: check engine oil");
        System.out.println("Sclass: Engine is starting"); 
    }

    @Override
    public void putOnLights() { System.out.println("Sclass: Lights are on"); }
}
