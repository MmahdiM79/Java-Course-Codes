import java.util.Arrays;
import java.util.Scanner;



public class Main
{
    private static Scanner in = new Scanner(System.in);



    private static <T extends Comparable<T>> void sort(T[] array)
    {
        int n = array.length;

        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (array[i].compareTo(array[j]) > 0)
                {
                    T hold = array[i];
                    array[i] = array[j];
                    array[j] = hold;
                }
    }

    public static void main(String[] args) 
    {
        // Person a = new Person("mahdi", 21);
        // Person b = new Person("ahmad", 20);

        // System.out.println(a.compareTo(b));


        int n = in.nextInt();
        in.nextLine();

        Person[] persons = new Person[n];

        String hName; int hAge;
        for (int i = 0; i < n; i++)
        {
            hName = in.nextLine();
            hAge = in.nextInt();
            in.nextLine();

            persons[i] = new Person(hName, hAge);
        }

        System.out.println("\n\n" + Arrays.toString(persons));
        sort(persons);
        System.out.println("\n\nafter sort:\n" + Arrays.toString(persons));


        // Integer[] nums = {1, 5, 3, 4, 2};
        // System.out.println(Arrays.toString(nums));
        // sort(nums);
        // System.out.println(Arrays.toString(nums));
    }
}