import java.util.Arrays;





public class Main 
{
    public static void main(String[] args)
    {
        // char[] hold = new char[40];
        // String s1 = "hello world";

        // s1.getChars(0, 5, hold, 10);

        // for (char c: hold)
        //     System.out.print("|"+c+"| ");
        // System.out.println();

        // System.out.println(Arrays.toString(hold));


        String s2 = "hello world";
        String s3 = new String("hello world");
        String s4 = "Hello World";
        String s5 = "Hello World Java Course";

        // System.out.println(s2);
        // System.out.println(s3);
        // if (s2 == s3)
        //     System.out.println("yes, " + s2 + "equals to " + s3);
        // else
        //     System.out.println("no, " + s2 + " doesn't equal to " + s3);

        // if (s2.equals(s3))
        //     System.out.println("yes, " + s2 + "equals to " + s3);
        // else
        //     System.out.println("no, " + s2 + " doesn't equal to " + s3);

        // System.out.println(s2);
        // System.out.println(s4);
        // if (s2.equalsIgnoreCase(s4))
        //     System.out.println("yes, " + s2 + "equals to " + s4);
        // else
        //     System.out.println("no, " + s2 + " doesn't equal to " + s4);


        System.out.println(s2);
        System.out.println(s5);
        if (s2.regionMatches(false, 0, s5, 0, s2.length()))
            System.out.println("yes, " + s2 + "equals to " + s5);
        else
            System.out.println("no, " + s2 + " doesn't equal to " + s5);

    }
}
