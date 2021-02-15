import java.util.Scanner;



public class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);


        System.out.println("\n\n< ----- simple calculator ----- >\n");

        float num1, num2;

        System.out.print("please enter two number:  ");
        num1 = in.nextFloat();
        num2 = in.nextFloat();

        System.out.println('\n');
        System.out.println("" + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("" + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("" + num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println("" + num1 + " ÷ " + num2 + " = " + (num1 / num2));
        
        System.out.println("\n< ----------------------------- >\n");
    }
}