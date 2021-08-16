
public abstract class Car 
{
    private String color;
    private String brand;
    private int numberOfDoors;


    protected Car(String color, String brand, int numberOfDoors)
    {
        this.color = color;
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }


    public String getColor() { return this.color; }
    public String getBrand() { return this.brand; }
    public int getNumberOfDoors() { return this.numberOfDoors; }

    
    public abstract void startEngine();
    public abstract void putOnLights();
    public abstract void turnOnHorn();
    public abstract void turnOffHorn();
}
