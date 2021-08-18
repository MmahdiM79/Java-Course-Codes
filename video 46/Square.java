

public class Square extends Rectangle 
{
    public Square(int lenOfSide)
    {
        super(lenOfSide, lenOfSide);
    }
    
    public int getLenOfSide() { return super.getWidth();}


    @Override
    public int getArea() {
        return getLenOfSide() * getLenOfSide();
    }

    @Override
    public int getPerimeter() {
        return getLenOfSide() * 4;
    }
}
