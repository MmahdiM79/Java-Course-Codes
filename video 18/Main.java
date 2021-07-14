import java.util.Scanner;






public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);



        // String s1 = in.nextLine();
        // System.out.println(s1);

        // String s2 = in.next();
        // System.out.println(s2);


        
        
        String s3 = in.nextLine();
        

        System.out.println("length of s3 is : " + s3.length());
        System.out.println("char at index 7 of s3 is : " + s3.charAt(7));

        System.out.print("reversed of s3 is : ");
        for (int i = s3.length()-1; i >= 0; i--)
            System.out.print(s3.charAt(i));
        System.out.println();
    }
}
