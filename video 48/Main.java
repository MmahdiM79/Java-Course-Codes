import java.util.ArrayList;



public class Main
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();


        arr.add(2);
        arr.add(4);
        
        System.out.println(arr.get(0));


        arr.set(0, 5);
        System.out.println("" + arr.get(0) + "   arr: " + arr);


        arr.add(0, 3);
        System.out.println(arr);


        ArrayList<Integer> hold = new ArrayList<>();
        hold.add(6); hold.add(10); hold.add(40); hold.add(50);

        // arr.addAll(hold);
        // System.out.println(arr);

        arr.addAll(1, hold);
        System.out.println(arr);



        arr.remove(0);
        System.out.println(arr);

        arr.remove(new Integer(40));
        System.out.println("object remove: " + arr);


        System.out.println(arr.contains(50));
        System.out.println(arr.contains(100));


        System.out.println(arr.indexOf(50));


        System.out.println(arr.subList(2, 5));


        for(int h: arr)
            System.out.println("? : " + h);


            

        // --------------------------------------------------

        ArrayList<Integer> arr2 = new ArrayList<>(50);
        System.out.println(arr2.size());
    }
}