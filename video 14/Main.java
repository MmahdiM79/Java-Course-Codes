import java.util.Arrays;
import java.util.Scanner;




public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);


        // n: number of students
        int n;
        System.out.print("please enter the number of students:  ");
        n = in.nextInt();


        // array of students grades
        float[] grades_class1 = new float[n];


        System.out.println("\n");


        // int current = 0;
        // while (current < n) 
        // {
        //     System.out.print("please enter the grade of student no." + (current + 1) + ":  ");
        //     grades_class1[current] = in.nextFloat();
        //     current++;
        // }


        
        // int current = 0;
        // do 
        // {
        //     System.out.print("please enter the grade of student no." + (current + 1) + ":  ");
        //     grades_class1[current++] = in.nextFloat();

        // } while (current < n);



        for (int i = 0; i < grades_class1.length; i++)
        {
            System.out.print("please enter the grade of student no." + (i + 1) + ":  ");
            grades_class1[i] = in.nextFloat();
        }



        System.out.println("\n\n");
        for (float grade : grades_class1) 
        {
            System.out.println("--> " + grade);
        }
    }
}