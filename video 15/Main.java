import java.util.Scanner;




public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);


        // long sum = 0;
        // int hold;
        // while (true)
        // {
        //     hold = in.nextInt();

        //     if (hold < 0)
        //         break;

        //     sum += hold;
        // }

        // System.out.println("\n" + sum);



        // int hold;
        // while (true)
        // {
        //     hold = in.nextInt();

        //     if (hold == 0)
        //         break;

            
        //     if (hold%2 != 0)
        //         continue;

        //     System.out.println("this is an even number!");
        // }



        int[] numbers = {2, 3, 4, 5, 8, 9, 10, 12, 14, 35, 70, 24, 2, 1, 48};
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i]%2 != 0)
                continue;

            System.out.println("number " + numbers[i] + " is an even number!");
        }
    }
}