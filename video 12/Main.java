import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        float[] class1_grades = new float[25];

        Scanner in = new Scanner(System.in);

        class1_grades[0] = in.nextFloat();
        class1_grades[24] += 4;
        System.out.println(Arrays.toString(class1_grades));
    }   
}