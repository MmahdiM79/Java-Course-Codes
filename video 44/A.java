



public class A 
{
    public class B
    {
        // public class C
        // {
        //     public class D
        //     {
        //         public class E

        
        private String name;

        public B(String name)
        {
            this.name = name;
        }

        public String getName() { return name; }
    }



    private int count = 0;
    public int getCount() { return count; }
    public void plusOne() { count++; }
    public B getB() { return new B("B"); }
}
