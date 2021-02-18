import java.util.Scanner;



public class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);


        System.out.println("\n\n< ----- simple calculator ----- >\n");

        /*  get two number from client  */
        float num1, num2;
        System.out.print("please enter two number:  ");
        num1 = in.nextFloat();
        num2 = in.nextFloat();

        System.out.println('\n');

        /*  ask what to do with these numbers from client  */
        int whatToDo;
        System.out.println("what to do with these numbers?");
        System.out.println("1. +\n2. -\n3. x\n4. ÷");
        whatToDo = in.nextInt();

        System.out.println('\n');


        if (whatToDo < 1 || whatToDo > 4) // check client input
        {
            System.out.println("wrong input -__-");
            System.out.println("\n< ----------------------------- >\n");

            return;
        }


        if (whatToDo == 1) // case +
            System.out.println("" + num1 + " + " + num2 + " = " + (num1 + num2));
        
        else if (whatToDo == 2) // case -
            System.out.println("" + num1 + " - " + num2 + " = " + (num1 - num2));
        
        else if (whatToDo == 3) // case *
            System.out.println("" + num1 + " x " + num2 + " = " + (num1 * num2));

        else if (whatToDo == 4) // case ÷ 
            System.out.println("" + num1 + " ÷ " + num2 + " = " + (num1 / num2));
        

        System.out.println("\n< ----------------------------- >\n");
    }
}
