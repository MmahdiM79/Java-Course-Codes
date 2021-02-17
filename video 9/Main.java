



public class Main 
{
    public static void main(String[] args) 
    {
        boolean which = true;



        int num = 10;

        int operator = which ? (!which ? 6: 2): 4;
        
        System.out.println(num%operator);

    }
    
}