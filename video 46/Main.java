


public class Main
{
    public static void main(String[] args) 
    {
        Shape s1 = new Rectangle(10, 4);
        Shape s2 = new Square(5);
        Rectangle s3 = new Square(6);

        // Square s4 = new Shape(){
        //     @Override
        //     public int getArea() {
        //         return -1
        //     }

        //     @Override
        //     public int getPerimeter() {
        //         return -2
        //     }
        // };

        

        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        System.out.println(s3.getArea());
    }
}