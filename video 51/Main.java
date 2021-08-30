

public class Main
{
    // private static void print(int[] array)
    // {
    //     for(int i: array)
    //         System.out.print(i + " ");
    //     System.out.println();
    // }

    // private static void print(float[] array)
    // {
    //     for(float i: array)
    //         System.out.print(i + " ");
    //     System.out.println();
    // }


    private static <E> E printGeneric(E[] array)
    {
        for(E i: array)
            System.out.print(i + " ");

        System.out.println();
        
        return array[0];
    }


    public static void main(String[] args) 
    {
        // int[] array = {1, 3, 4};  
        // float[] farray = {2.3f, 4.5f, 7.9f};

        // print(array);
        // print(farray);


        Integer[] intArray = {1, 3, 4};  
        Float[] floatArray = {2.3f, 4.5f, 7.9f};

        printGeneric(intArray);
        printGeneric(floatArray);

        System.out.println("\n -------- \n");

        System.out.println(printGeneric(intArray));
        System.out.println(printGeneric(floatArray));

        System.out.println("\n -------- \n");

        Box<String> s = new Box<>(20);
        s.add("hello");
        s.add("world");
        s.add("media");

        for(int i = 0; i < 3; i++)
            System.out.println(s.remove());
    }
}