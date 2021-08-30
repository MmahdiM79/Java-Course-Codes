

public class Box<T>
{
    private T[] hold;
    private int index = 0;


    public Box(int capacity)
    {
        this.hold = (T[]) (new Object[capacity]);
    }


    public void add(T e) { hold[index++] = e;}
    public T remove() { return hold[--index]; }
}
